package com.caijai.repair.dao.multi; 

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.caijai.repair.dao.RepairDao;
import com.caijai.repair.entity.RepairOrder;
import com.caijai.base.dao.support.MultiDao;
import com.caijai.base.util.PageInfo;
import com.caijai.repair.mapper.RepairOrderMapper;
import com.caijai.sysuser.util.MySession; 

@Repository
public class RepairImpl extends MultiDao<RepairOrder> implements RepairDao{

	@Autowired
	private RepairOrderMapper mapper;
	
	@Override
	public List<Map<String, Object>> queryRepairMen() {
		return mapper.queryRepairMen();
	}

	@Override
	public PageInfo<RepairOrder> queryPage(PageInfo<RepairOrder> pageInfo, RepairOrder t) {
		if (t.getDr() == null) {
			t.setDr(0);
		}
		if (t.getOrg() == null) {
			t.setOrg(MySession.currentUser().getCorpPk());
		}
		Map<String, Object> map = new HashMap<>();
		map.put("code", t.getCode());
		map.put("beforeDate", t.getBeforeDate());
		map.put("afterDate", t.getAfterDate());
		map.put("repairmenNames", t.getRepairmenNames());
		map.put("beforeLatestFinishTime", t.getBeforeLatestFinishTime());
		map.put("afterLatestFinishTime", t.getAfterLatestFinishTime());
		if(t.getRepairstate()!=null) {
			map.put("repairState", t.getRepairstate().getIndex());
		}
		map.put("applicant", t.getApplicant());
		map.put("applicantName", t.getApplicantName());
		map.put("currentLineCode", t.getCurrentLineCode());
		map.put("dr", t.getDr());
		map.put("org", t.getOrg());
		int total = mapper.getTotalCount(map);
		pageInfo.setTotal(total);
		map.put("pageInfo", pageInfo);
		if (total == 0) {
			return pageInfo;
		}
		List<Map<String, Object>> list = mapper.queryPage(map);
		pageInfo.setRows(mapToObject(list));
		return pageInfo;
	}

	@Override
	public List<RepairOrder> queryList(RepairOrder t) {
		if (t.getDr() == null) {
			t.setDr(0);
		}
		if (t.getOrg() == null) {
			t.setOrg(MySession.currentUser().getCorpPk());
		}
		Map<String, Object> map = new HashMap<>();
		map.put("code", t.getCode());
		map.put("beforeDate", t.getBeforeDate());
		map.put("afterDate", t.getAfterDate());
		map.put("repairmenNames", t.getRepairmenNames());
		map.put("beforeLatestFinishTime", t.getBeforeLatestFinishTime());
		map.put("afterLatestFinishTime", t.getAfterLatestFinishTime());
		if(t.getRepairstate()!=null) {
			map.put("repairState", t.getRepairstate().getIndex());
		}
		map.put("leaderName", t.getLeaderName());
		map.put("applicant", t.getApplicant());
		map.put("applicantName", t.getApplicantName());
		map.put("currentLineCode", t.getCurrentLineCode());
		map.put("dr", t.getDr());
		map.put("org", t.getOrg());
		List<Map<String, Object>> list = mapper.queryList(map);
		return mapToObject(list);
	}
}