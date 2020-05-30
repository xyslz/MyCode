package com.caijai.repair.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.caijai.repair.entity.RepairOrder;

public interface RepairOrderMapper {

	List<Map<String, Object>> queryRepairMen();

	int getTotalCount(Map<String, Object> map);

	List<Map<String, Object>> queryPage(Map<String, Object> map);

	List<Map<String, Object>> queryList(Map<String, Object> map);
	
	/**
	 * 根据设备id查询 状态不是已修复和未修复状态的保修单
	 * @param emid
	 * @return
	 */
	List<RepairOrder> checkRepairOrder(@Param("emid") String emid);
}
