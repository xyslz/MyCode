package com.caijai.person.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface EmployeeArchiveMapper {

	List<Map<String, Object>> queryPageByShift(@Param("params") Map<String, Object> params,
			@Param("ownerOrg") String ownerOrg, @Param("currentDate") String currentDate, @Param("name") String name,
			@Param("shiftGroup") String shiftGroup);

	Integer getCountByShift(@Param("ownerOrg") String ownerOrg, @Param("currentDate") String currentDate,
			@Param("name") String name, @Param("shiftGroup") String shiftGroup);
}
