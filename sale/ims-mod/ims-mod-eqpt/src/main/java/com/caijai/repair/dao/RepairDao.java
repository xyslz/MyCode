package com.caijai.repair.dao;

import java.util.List;
import java.util.Map;

import com.caijai.repair.entity.RepairOrder;


public interface RepairDao {
	
	List<Map<String, Object>> queryRepairMen();

	List<RepairOrder> queryList(RepairOrder t);
}
