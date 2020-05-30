package com.caijai.repair.dao.multi;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.caijai.repair.dao.RepairMenDao;
import com.caijai.repair.entity.RepairMen;
import com.caijai.base.dao.support.MultiDao;
import com.caijai.repair.mapper.RepairMenMapper;
import com.caijai.sysuser.util.MySession;

@Repository
public class RepairMenImpl extends MultiDao<RepairMen> implements RepairMenDao{

	@Autowired
	private RepairMenMapper mapper;
	
	@Override
	public List<RepairMen> queryRepairMen(String srcdocid) {
		List<Map<String, Object>> list = mapper.getListByParams(srcdocid,MySession.currentUser().getCorpPk());
		return mapToObject(list);
	}

	@Override
	public Integer modifyBySrcdoc(String maintainID, String srcdocid) {
		return mapper.modifyBySrcdoc(maintainID, srcdocid, MySession.currentUser().getCorpPk());
	}
}
