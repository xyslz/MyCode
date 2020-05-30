package com.caijai.data.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.caijai.data.entity.Department;

public interface DepartmentMapper {
	
	List<Department> queryDepByName(@Param("org")String org);
	
}
