/**  
 * Title: MoDaoImpl.java<p>
 * Description: <br>  
 * Copyright: Copyright (c) 2017<br> 
 * Company: www.caijai.com<br>  
 * @author 端鹏程
 * @date 2018年12月10日  
 * @version 1.0  
 */
package com.caijai.data.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.caijai.base.dao.support.MultiDao;
import com.caijai.base.util.PageInfo;
import com.caijai.base.util.StringUtil;
import com.caijai.data.dao.MoDao;
import com.caijai.data.entity.Mo;
import com.caijai.data.entity.vo.MoVO;
import com.caijai.data.mapper.MoMapper;
import com.caijai.sysuser.util.MySession;

/**
 * Title: MoDaoImpl
 * <p>
 * Description: <br>
 * 
 * @author 端鹏程
 * @date 2018年12月10日
 */
@Repository
public class MoDaoImpl extends MultiDao<Mo> implements MoDao {

	@Autowired
	private MoMapper mapper;

	/**
	 * Title: queryNoCompleteList
	 * <p>
	 * Description: <br>
	 * 
	 * @return <br>
	 * @see com.caijai.ets.dao.MoDao#queryNoCompleteList()<br>
	 * @author 端鹏程
	 * @date 2018年12月22日
	 */
	@Override
	public List<Mo> queryNoCompleteList(String startDate, String endDate) {
		String org = MySession.currentUser().getCorpPk();
		return mapper.queryNoCompleteList(org, startDate, endDate);
	}

	/**
	 * Title: queryPage
	 * <p>
	 * Description: <br>
	 * 
	 * @param pageInfo
	 * @param mo
	 * @param actualStartDateFrom
	 * @param actualStartDateEnd
	 * @return <br>
	 * @see com.caijai.ets.dao.MoDao#queryPage(com.caijai.base.util.PageInfo,
	 *      com.caijai.ets.entity.Mo, java.lang.String, java.lang.String)<br>
	 * @author 端鹏程
	 * @date 2018年12月30日
	 */
	@Override
	public PageInfo<Mo> queryPage(PageInfo<Mo> pageInfo, Mo mo, String startDateFrom, String startDateEnd) {
		Map<String, Object> map = new HashMap<>();

		// 如果当前登录人有数据权限控制
		/*List<DataService> data = MySession.currentUser().getDataList();
		if (data != null && data.size() > 0) {
			for (int i = 0; i < data.size(); i++) {
				String tableName = TableUtil.getTableName(Mo.class);
				// 判断当前登录人员有采购订单的数据权限分配
				if (data.get(i).getTableName().equals(tableName)
						&& DataSerType.Self.equals(data.get(i).getDataType())) {
					String dept = MySession.currentUser().getDeptID();
					if (StringUtil.IsNullOrEmpty(dept)) {
						pageInfo.setTotal(0);
						return pageInfo;
					} else {
						map.put("department", dept);
						break;
					}
				}
			}
		} else {
			pageInfo.setTotal(0);
			return pageInfo;
		}*/
		if (mo.getDr() == null) {
			mo.setDr(0);
		}
		if (StringUtil.IsNullOrEmpty(mo.getOrg())) {
			mo.setOrg(MySession.currentUser().getCorpPk());
		}
		map.put("dr", mo.getDr());
		map.put("businessType", mo.getBusinessType());
		map.put("categoryType", mo.getCategoryType() == null ? null : mo.getCategoryType().getIndex() + "");// 成品、半成品
		map.put("org", mo.getOrg());
		map.put("docNo", mo.getDocNo());
		map.put("departmentName", mo.getDepartmentName());
		map.put("docState", mo.getDocState() == null ? null : mo.getDocState().getIndex() + "");
		map.put("itemMasterCode", mo.getItemMasterCode());
		map.put("code1", mo.getCode1());
		map.put("itemMasterName", mo.getItemMasterName());
		map.put("startDateFrom", startDateFrom);
		map.put("startDateEnd", startDateEnd);
		map.put("seibanCode", mo.getSeibanCode());
		map.put("productLotNo", mo.getProductLotNo());
		map.put("modNo", mo.getModNo());// 模具号（新增显示，用于生成批次号）
		map.put("machineNo", mo.getMachineNo());// 机器号（新增显示，用于生成批次号）
		map.put("isIssueStatus", mo.getIsIssueStatus() == null ? null : mo.getIsIssueStatus().getIndex());
		int total = mapper.getTotalCount(map);
		pageInfo.setTotal(total);
		map.put("pageInfo", pageInfo);
		if (total == 0) {
			return pageInfo;
		}
		List<Mo> list = mapper.queryPage(map);
		pageInfo.setRows(list);
		return pageInfo;
	}

	/**
	 * Title: queryNoCompleteCount
	 * <p>
	 * Description: <br>
	 * 
	 * @param startDate
	 * @param endDate
	 * @return <br>
	 * @see com.caijai.ets.dao.MoDao#queryNoCompleteCount(java.lang.String,
	 *      java.lang.String)<br>
	 * @author 端鹏程
	 * @date 2019年1月10日
	 */
	@Override
	public int getTotalCount(Map<String, Object> map) {
		map.put("dr", 0);
		map.put("org", MySession.currentUser().getCorpPk());
		return mapper.getTotalCount(map);
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
	 * @see com.caijai.ets.dao.MoDao#queryPageReport(com.caijai.base.util.PageInfo,
	 *      com.caijai.ets.entity.bo.CompleteApplyDocVO, java.lang.String,
	 *      java.lang.String, java.lang.String, java.lang.String,
	 *      java.lang.String, java.lang.String)<br>
	 * @author 端鹏程
	 * @date 2019年1月23日
	 */
	@Override
	public PageInfo<MoVO> queryPageReport(PageInfo<MoVO> pageInfo, MoVO mo, String applyDateFrom, String applyDateEnd,
			String qcDocCreateDateFrom, String qcDocCreateDateEnd, String businessDateFrom, String businessDateEnd) {
		Map<String, Object> map = new HashMap<>();
		map.put("docNo", mo.getDocNo());
		map.put("itemCode", mo.getItemCode());
		map.put("code1", mo.getCode1());
		map.put("moDocNo", mo.getMoDocNo());// 生产订单号
		map.put("businessType", mo.getBusinessType());
		map.put("docState", mo.getDocState() == null ? null : mo.getDocState().getIndex());
		map.put("departmentName", mo.getDepartmentName());
		map.put("cadState", mo.getCadState() == null ? null : mo.getCadState().getIndex());
		map.put("qcState", mo.getQcState() == null ? null : mo.getQcState().getIndex());
		map.put("categoryType", mo.getCategoryType() == null ? null : mo.getCategoryType().getIndex());
		map.put("applyDateFrom", applyDateFrom);
		map.put("applyDateEnd", applyDateEnd);
		map.put("qcDocCreateDateFrom", qcDocCreateDateFrom);
		map.put("qcDocCreateDateEnd", qcDocCreateDateEnd);
		map.put("businessDateFrom", businessDateFrom);
		map.put("businessDateEnd", businessDateEnd);
		map.put("org", MySession.currentUser().getCorpPk());
		Integer total = mapper.getTotalCountReport(map);
		if (total == 0) {
			return pageInfo;
		}
		pageInfo.setTotal(total);
		map.put("pageInfo", pageInfo);
		List<MoVO> list = mapper.queryPageReport(map);
		pageInfo.setRows(list);
		return pageInfo;
	}

}
