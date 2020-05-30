package com.caijai.dock.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.caijai.base.dao.BaseDao;
import com.caijai.base.sysenum.RealOff;
import com.caijai.base.sysenum.SYSSET;
import com.caijai.base.sysenum.TypeOff;
import com.caijai.base.sysenum.U9STATE;
import com.caijai.base.util.AutoCode;
import com.caijai.base.util.DateUtil;
import com.caijai.base.util.StringUtil;
import com.caijai.dock.entity.WaitTasks;
import com.caijai.dock.service.WaitService;
import com.caijai.dock.service.WaitTasksService;
import com.caijai.sysuser.entity.CorpVO;
import com.caijai.sysuser.entity.Organization;
import com.caijai.sysuser.entity.SysDictionaryDetail;
import com.caijai.sysuser.entity.SysUser;
import com.caijai.sysuser.mapper.OrgMapper;
import com.caijai.sysuser.util.MySession;

@Service
public class WaitServiceImpl implements WaitService{
	
	@Autowired
	private BaseDao<SysDictionaryDetail> sysdetaildao;

	@Autowired
	private BaseDao<WaitTasks> waitDao;
	
	@Autowired
	private AutoCode autoCode;
	
	@Autowired 
	private WaitTasksService service;
	
	/**
	 * 判断接口是否生效，生效则直接调用U9接口，否则存入任务，后续手动执行
	 * 
	 * @author CY
	 * @date 2019年3月1日
	 * @param dCode
	 * @return
	 */
	@Override
	public SysDictionaryDetail IsOnline(TypeOff type) {
		// 查找系统字典中xxx接口是否生效
		SysDictionaryDetail sysdetail = new SysDictionaryDetail();
		sysdetail.setDicCode("DIC0008");
		sysdetail.setValue(type.getIndex()+"");
		sysdetail.setOrg(MySession.currentUser().getCorpPk());
		return sysdetaildao.getByParam(sysdetail);
	}

	/**
	 * 添加采购脱机任务
	 * @param rcv
	 * @param name
	 * @return
	 */
	@Override
	public WaitTasks addWait(String id,String docNo, String name,String source) {
		
		WaitTasks task = new WaitTasks();
		task.setOrderId(id);
		task.setOrderNum(docNo);
		task.setTaskType(TypeOff.get(name));
		task.setRealTimeState(RealOff.start);
		task.setSource(source);
		task.setDr(0);
		WaitTasks wait = waitDao.getByParam(task);
		if(wait == null){
			task.setId(StringUtil.uuid());
			task.setCode(autoCode.TGcode(MySession.currentUser().getOrgCode()));
			task.setName(name + "脱机任务处理");
			task.setIsOffline(SYSSET.Y);
			task.setStProcedure("调用U9接口，生成" + name + "单");
			task.setHadSolveTime(DateUtil.nowDate());
			task.setCreatedOn(DateUtil.nowDate());
			task.setCreatedBy(MySession.currentUser().getUsername());
			wait = waitDao.add(task);
		}
		return wait;
	}
	
	/**
	 * 删除脱机任务
	 * @param id
	 * @return
	 */
	@Override
	@Transactional
	public void deleteWait(String id,Integer type) {
		// 删除脱机任务
		WaitTasks wait = new WaitTasks();
		wait.setOrderId(id);
		wait.setDr(0);
		wait.setRealTimeState(RealOff.start);
		wait.setTaskType(TypeOff.get(type));
		List<WaitTasks> waitlist = waitDao.getListByParam(wait);
		if (waitlist != null && waitlist.size() > 0) {
			for (int j = 0; j < waitlist.size(); j++) {
				waitDao.invalidByPk(waitlist.get(j));
			}
		}
	}

	/**
	 * 定时查询任务
	 */
	@Override
	public List<WaitTasks> OnOff(String org) {
		//第二步，根据组织查询系统字典，定时任务开关是否打开
		SysDictionaryDetail sysDic = new SysDictionaryDetail();
		sysDic.setIsState(U9STATE.valid);
		sysDic.setDicCode("DIC0008");
		sysDic.setValue(TypeOff.ONOFF.getIndex()+"");
		SysDictionaryDetail dicList = sysdetaildao.getByParam(sysDic);
		if(dicList!=null){
			//第三步，根据组织查询定时任务
			List<WaitTasks> list = service.queryReady(org);
			return list;
		}
		return null;
	}

	/**
	 * 添加非完全脱机任务
	 * 当调用接口失败时，生成脱机任务
	 * @param rcv
	 * @param name
	 * @return
	 */
	@Override
	public WaitTasks addOnWait(String id,String docNo, String name) {
		WaitTasks task = new WaitTasks();
		task.setId(StringUtil.uuid());
		task.setCode(autoCode.TGcode(MySession.currentUser().getOrgCode()));
		task.setName(name + "脱机任务处理");
		task.setTaskType(TypeOff.get(name));
		task.setOrderId(id);
		task.setOrderNum(docNo);
		task.setIsOffline(SYSSET.N);
		task.setStProcedure("调用U9接口，生成" + name + "单");
		task.setRealTimeState(RealOff.start);
		task.setHadSolveTime(DateUtil.nowDate());
		task.setCreatedOn(DateUtil.nowDate());
		task.setCreatedBy(MySession.currentUser().getUsername());
		return waitDao.add(task);
	}
}
