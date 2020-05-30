package com.caijai.repair.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface RepairLineMapper {
	
	Map<String,Object> getRepairLine(@Param("id") String id);
	
}
