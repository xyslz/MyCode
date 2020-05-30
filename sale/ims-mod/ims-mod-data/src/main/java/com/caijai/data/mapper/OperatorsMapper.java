package com.caijai.data.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.caijai.data.entity.Operators;

public interface OperatorsMapper {

	int getTotalCount(Map<String, Object> param);

	List<Operators> queryPage(Map<String, Object> param);
	
	List<Operators> getByDept(@Param("userID")String userID,@Param("org") String org);
	
	Operators getByID(@Param("id")String id);

	//DataService getDateByRole(@Param("roleID")String roleID);
	
	List<Operators> getOpera(@Param("code")String code,@Param("org")String org);
}
