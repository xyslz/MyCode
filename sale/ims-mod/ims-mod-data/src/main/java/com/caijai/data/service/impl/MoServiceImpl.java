/**  
 * Title: MoServiceImpl.java<p>
 * Description: <br>  
 * Copyright: Copyright (c) 2017<br> 
 * Company: www.caijai.com<br>  
 * @author 端鹏程
 * @date 2018年12月10日  
 * @version 1.0  
 */
package com.caijai.data.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.caijai.base.dao.BaseDao;
import com.caijai.base.service.DMLServiceSupport;
import com.caijai.base.sysenum.DocState;
import com.caijai.base.sysenum.SYSSET;
import com.caijai.base.util.DateUtil;
import com.caijai.base.util.PageInfo;
import com.caijai.data.dao.MoDao;
import com.caijai.data.entity.Mo;
import com.caijai.data.entity.vo.MoVO;
import com.caijai.data.mapper.MoMapper;
import com.caijai.data.service.MoService;
import com.caijai.sysuser.entity.SysUser;
import com.caijai.sysuser.util.MySession;
import com.caijai.task.entity.SyncTasks;
import com.caijai.task.service.fun.SyncTasksFUN;

/**
 * Title: MoServiceImpl
 * <p>	
 * Description: <br>
 * 
 * @author 端鹏程
 * @date 2018年12月10日
 */
@Service
public class MoServiceImpl extends DMLServiceSupport<Mo> implements MoService {

	@Autowired
	private BaseDao<Mo> dao;

	@Autowired
	private MoDao moDao;

	@Autowired
	private BaseDao<SyncTasks> tasksDao;

	@Autowired
	private SyncTasksFUN tasksFun;
	
	@Autowired
	private MoMapper mapper;

	/**
	 * 根据组织同步生产订单
	 * 
	 * @param org
	 *            登录用户组织
	 * @author WHD
	 * @date 2019年1月31日 13:40:22
	 */
	@Override
	public int syncMomo() {
		// 同步Sync_MO_Production存储过程
		SyncTasks task = new SyncTasks();
		task.setStprocedure("Sync_MO_Production");
		task.setSyspreset(SYSSET.Y);
		task = tasksDao.getByParam(task);
		return tasksFun.taskRun(task.getId());
	}

	/**
	 * Title: getById
	 * <p>
	 * Description: <br>
	 * 
	 * @param mo
	 * @return <br>
	 * @see com.caijai.ets.service.MoService#getById(com.caijai.ets.entity.Mo)<br>
	 * @author 端鹏程
	 * @date 2018年12月20日
	 */
	@Override
	public Mo getById(Mo mo) {
		return dao.getById(mo.getId());
	}

	/**
	 * Title: getByParams
	 * <p>
	 * Description: <br>
	 * 
	 * @param mo
	 * @return <br>
	 * @see com.caijai.ets.service.MoService#getByParams(com.caijai.ets.entity.Mo)<br>
	 * @author 端鹏程
	 * @date 2018年12月20日
	 */
	@Override
	public Mo getByParams(Mo mo) {
		return dao.getByParam(mo);
	}

	/**
	 * Title: queryList
	 * <p>
	 * Description: <br>
	 * 
	 * @param mo
	 * @return <br>
	 * @see com.caijai.ets.service.MoService#queryList(com.caijai.ets.entity.Mo)<br>
	 * @author 端鹏程
	 * @date 2018年12月20日
	 */
	@Override
	public List<Mo> queryList(Mo mo) {
		return dao.getListByParam(mo);
	}

	/**
	 * Title: queryNoCompleteList
	 * <p>
	 * Description: <br>
	 * 
	 * @param mo
	 * @return <br>
	 * @see com.caijai.ets.service.MoService#queryNoCompleteList(com.caijai.ets.entity.Mo)<br>
	 * @author 端鹏程
	 * @date 2018年12月21日
	 */
	@Override
	public List<Mo> queryNoCompleteList(String startDate, String endDate) {
		return moDao.queryNoCompleteList(startDate, endDate);
	}

	/**
	 * Title: queryPage
	 * <p>
	 * Description: <br>
	 * 
	 * @param pageNumber
	 * @param pageSize
	 * @param mo
	 * @param actualStartDateFrom
	 * @param actualStartDateEnd
	 * @return <br>
	 * @see com.caijai.ets.service.MoService#queryPage(java.lang.String,
	 *      java.lang.String, com.caijai.ets.entity.Mo, java.lang.String,
	 *      java.lang.String)<br>
	 * @author 端鹏程
	 * @date 2018年12月30日
	 */
	@Override
	public Map<String, Object> queryPage(String pageNumber, String pageSize, Mo mo, String startDateFrom,
			String startDateEnd) {
		Map<String, Object> map = new HashMap<String, Object>();
		PageInfo<Mo> pageInfo = new PageInfo<Mo>(pageNumber, pageSize);
		pageInfo = moDao.queryPage(pageInfo, mo, startDateFrom, startDateEnd);
		map.put("total", pageInfo.getTotal());
		map.put("rows", pageInfo.getRows());
		return map;
	}

	/**
	 * Title: queryNoCompleteCount
	 * <p>
	 * Description: <br>
	 * 
	 * @param object
	 * @param object2
	 * @return <br>
	 * @see com.caijai.ets.service.MoService#queryNoCompleteCount(java.lang.Object,
	 *      java.lang.Object)<br>
	 * @author 端鹏程
	 * @date 2019年1月10日
	 */
	@Override
	public int queryNoCompleteCount(Integer type) {
		Map<String, Object> map = new HashMap<>();
		if (type != null) {
			map.put("businessType", type);
		}
		return moDao.getTotalCount(map);
	}

	/**
	 * Title: queryPageReport
	 * <p>
	 * Description: <br>
	 * 
	 * @param pageInfo
	 * @param cad
	 * @param applyDateFrom
	 * @param applyDateEnd
	 * @param qcDocCreateDateFrom
	 * @param qcDocCreateDateEnd
	 * @param businessDateFrom
	 * @param businessDateEnd
	 * @return <br>
	 * @see com.caijai.ets.service.MoService#queryPageReport(com.caijai.base.util.PageInfo,
	 *      com.caijai.ets.entity.bo.CompleteApplyDocVO, java.lang.String,
	 *      java.lang.String, java.lang.String, java.lang.String,
	 *      java.lang.String, java.lang.String)<br>
	 * @author 端鹏程
	 * @date 2019年1月23日
	 */
	@Override
	public PageInfo<MoVO> queryPageReport(PageInfo<MoVO> pageInfo, MoVO mo, String applyDateFrom, String applyDateEnd,
			String qcDocCreateDateFrom, String qcDocCreateDateEnd, String businessDateFrom, String businessDateEnd) {
		return moDao.queryPageReport(pageInfo, mo, applyDateFrom, applyDateEnd, qcDocCreateDateFrom, qcDocCreateDateEnd,
				businessDateFrom, businessDateEnd);
	}

	/**
	 * Title: close
	 * <p>
	 * Description: <br>
	 * 
	 * @param mo
	 * @param user
	 * @return <br>
	 * @see com.caijai.ets.service.MoService#close(com.caijai.ets.entity.Mo,
	 *      com.caijai.sysuser.entity.SysUser)<br>
	 * @author 端鹏程
	 * @date 2019年3月4日
	 */
	@Override
	public Mo close(Mo mo, SysUser user) {
		mo.setModifiedBy(user.getUsername());
		mo.setModifiedOn(DateUtil.nowDate());
		return dao.modify(mo);
	}

	/**
	 * Title: invalid
	 * <p>
	 * Description: <br>
	 * 
	 * @param user
	 * @param org
	 * @param docNo
	 * @return <br>
	 * @see com.caijai.ets.service.MoService#invalid(java.lang.String,
	 *      java.lang.String, java.lang.String)<br>
	 * @author 端鹏程
	 * @date 2019年3月4日
	 */
	@Override
	public Map<String, Object> invalid(String userkey, String org, String docNo) {
		// TODO 通过userkey去u9里查询操作的用户
		Map<String, Object> result = new HashMap<>();
		// 作废生产订单
		Mo mo = new Mo();
		mo.setDocNo(docNo);
		mo.setOrg(org);
		mo = dao.getByParam(mo);
		if (mo == null) {
			result.put("success", true);
			return result;
		}
		mo.setDr(1);
		modify(mo);
		result.put("success", true);
		return result;
	}

	/**
	 * 生产订单关闭
	 */
	@Override
	@Transactional
	public Map<String, Object> closeMo(Mo mo) {
		Map<String, Object> map = new HashMap<String,Object>();
		Integer count = mapper.getMoCount(mo.getId());
		if(count > 0){
			map.put("msg", "当前生产订单下存在未关闭的派工单，请确认后再关闭");
			return map;
		}
		mo.setModifiedBy(MySession.currentUser().getUsername());
		mo.setModifiedOn(DateUtil.nowDate());
		mo.setDocState(DocState.Close);
		map.put("mo", dao.modify(mo));
		return map;
	}

}
