package com.caijai.dock.service.impl;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caijai.base.dao.BaseDao;
import com.caijai.base.exception.DockU9Exception;
import com.caijai.base.sysenum.RealOff;
import com.caijai.base.util.DateUtil;
import com.caijai.base.util.StringUtil;
import com.caijai.dock.entity.WaitLog;
import com.caijai.dock.entity.WaitTasks;
import com.caijai.dock.mapper.WaitTasksMapper;
import com.caijai.dock.service.TaskProcessService;
import com.caijai.dock.service.WaitTasksService;
import com.caijai.dock.service.dml.WaitLogDML;
import com.caijai.sysuser.entity.Organization;
import com.caijai.sysuser.entity.SysUser;
import com.caijai.sysuser.entity.User;
import com.caijai.sysuser.util.MySession;


@Service
public class WaitTasksServiceImpl implements WaitTasksService {

	private static Logger logger = Logger.getLogger(WaitTasksServiceImpl.class);
	
	@Autowired
	private BaseDao<WaitTasks> baseDao;
	
	@Autowired
	private BaseDao<User> userDao;
	
	@Autowired
	private BaseDao<Organization> orgDao;
	
	@Autowired
	private WaitTasksMapper mapper;
	
	@Autowired
	private WaitLogDML waitLogDML;
	
	@Autowired
	private TaskProcessService taskService;
	
	@Override
	public List<WaitTasks> queryReady(String org) {
		return mapper.queryReady(org);
	}

	@Override
	public void timerRun(String id) {
		WaitTasks task = baseDao.getById(id);
		try {
			callProcedure(task);	
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("定时任务执行异常："+task.getName());
			logger.error("定时任务异常信息："+e.getMessage());
		} finally {
			//baseDao.modify(task);
		}
	}

	@Override
	public WaitTasks taskStop(String id) {
		WaitTasks task = baseDao.getById(id);
		task.setRealTimeState(RealOff.stop);
		task = baseDao.modify(task);
		return task;
	}
	
	@Override
	public WaitTasks taskContinu(String id) {
		WaitTasks task = baseDao.getById(id);
		task.setRealTimeState(RealOff.start);
		task = baseDao.modify(task);
		return task;
	}
	
	@Override
	public WaitTasks taskRun(String id){
		WaitTasks task = baseDao.getById(id);
		return callProcedure(task);
	}
	
	/**
	 * 执行接口对接
	 * @param task
	 * @return
	 * @throws IOException 
	 */
	private WaitTasks callProcedure(WaitTasks task){
		WaitLog log = new WaitLog();
		log.setId(StringUtil.uuid());
		log.setWaitCode(task.getCode());
		log.setWaitName(task.getName());
		SysUser user = new SysUser();
		try {
			SysUser currentUser = MySession.currentUser();
			if(currentUser==null) {
				user = obtainSession(task);
				log.setExecuteBy("定时任务");
				task.setExecuteBy("定时任务");
			}else {
				user = currentUser;
				log.setExecuteBy(user.getUsername());
				task.setExecuteBy(user.getUsername());
			}
		} catch (Exception e) {
			e.printStackTrace();
			log.setCreatedBy("IMS");
			log.setExecuteBy("IMS");
			throw e;
		}finally {
			log.setCreatedBy(user.getUsername());
			log.setOrg(user.getCorpPk());
			log.setExecuteOn(DateUtil.nowDate());
			task.setExecuteOn(DateUtil.nowDate());
			//记录日志
			int total = task.getExecuteTimes()+1;
			log.setExecuteTimes(total);
			task.setExecuteTimes(total);
			task = run(task,log);
		}
		return task;
	}

	private SysUser obtainSession(WaitTasks task){
		SysUser user = new SysUser();
		//根据姓名查询用户的编码
		User u = new User();
		u.setName(task.getCreatedBy());
		u.setDr(0);
		u.setOrg(task.getOrg());
		u = userDao.getByParam(u);
		if(u!=null){
			user.setUsercode(u.getCode());
		}else{
			user.setUsercode("");
		}
		//根据组织id查询组织的code
		Organization orgs = orgDao.getById(task.getOrg());
		user.setCorpPk(orgs.getId());
		user.setOrgCode(orgs.getCode());
		MySession.setUser(user);
		return user;
	}

	@SuppressWarnings("finally")
	private WaitTasks run(WaitTasks task,WaitLog log){
		try {
			//采购
			Map<String,Object> map = taskService.getData(task.getOrderId(),task.getTaskType().getIndex());
			Map<String, Object> mapReturn = taskService.callInterface(map,task.getTaskType().getIndex());
			String docNo = (String)mapReturn.get("docNo");
			task.setOrderNum(docNo);//任务单号回写
			//完工
			Map<String,Object> mapWg = taskService.getDataWg(task.getOrderId(),task.getTaskType().getIndex());
			Map<String,Object> mapSpecial = taskService.getSpecialData(task);
			Map<String, Object> mapReturnWg = taskService.callInterfaceWg(mapWg,task.getTaskType().getIndex());
		
			task.setExecRes(task.getTaskType().getValue()+"对接成功");
			log.setExecRes(task.getTaskType().getValue()+"对接成功");
			task.setRealTimeState(RealOff.end);
			waitLogDML.add(log);
		} catch (Exception e) {
			task.setExecRes(task.getTaskType().getValue()+"失败,"+e.getMessage());
			log.setExecRes(task.getTaskType().getValue()+"失败,"+e.getMessage());
		} finally {
			task = baseDao.modify(task);
			return task;
		}
	}
}