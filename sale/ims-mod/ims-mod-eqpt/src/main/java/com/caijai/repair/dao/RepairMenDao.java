package com.caijai.repair.dao;

import java.util.List;

import com.caijai.repair.entity.RepairMen;


public interface RepairMenDao {
	
	List<RepairMen> queryRepairMen(String srcdocid);

	Integer modifyBySrcdoc(String maintainID, String srcdocid);

}
