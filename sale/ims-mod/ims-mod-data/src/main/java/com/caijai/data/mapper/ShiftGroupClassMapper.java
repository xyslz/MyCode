package com.caijai.data.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface ShiftGroupClassMapper {
	
	List<Map<String, Object>> queryParentClass(@Param("org") String org);
	
}
