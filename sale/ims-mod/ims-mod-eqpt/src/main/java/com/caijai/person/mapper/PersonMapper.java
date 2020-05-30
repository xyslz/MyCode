package com.caijai.person.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.caijai.person.entity.EmployeeArchive;

public interface PersonMapper {

	List<Map<String, Object>> queryPageByEqpt(@Param("params") Map<String, Object> params,
			@Param("personName") String personName, @Param("shiftGroup") String shiftGroup);

	Integer getCountByEqpt(@Param("personName") String personName, @Param("shiftGroup") String shiftGroup);

	List<Map<String, Object>> queryPersonByShift(@Param("personName") String personName,
			@Param("shiftGroup") String shiftGroup,@Param("currentDate") String currentDate);

	List<EmployeeArchive> queryPagePerson(@Param("params") Map<String, Object> params,
			@Param("ownerOrg") String ownerOrg,@Param("name") String name);
	
	Integer getPersonCount(@Param("ownerOrg") String ownerOrg,@Param("name") String name);
}
