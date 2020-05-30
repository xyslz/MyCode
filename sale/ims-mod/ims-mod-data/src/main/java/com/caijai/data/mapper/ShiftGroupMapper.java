package com.caijai.data.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.caijai.data.entity.ShiftGroup;

public interface ShiftGroupMapper {

	/**
	 * 分页查询班组信息
	 * 
	 * @param params
	 * @param shiftGroupClass
	 * @param code
	 * @param name
	 * @param org
	 * @param isEffective
	 * @return
	 */
	List<Map<String, Object>> queryShiftGroup(@Param("params") Map<String, Object> params,
			@Param("shiftGroupClass") String shiftGroupClass, @Param("code") String code, @Param("name") String name,
			@Param("org") String org, @Param("isEffective") String isEffective);

	/**
	 * 班组信息总条数
	 * 
	 * @param shiftGroupClass
	 * @param code
	 * @param name
	 * @param org
	 * @param isEffective
	 * @return
	 */
	Integer getShiftGroupClassCount(@Param("shiftGroupClass") String shiftGroupClass, @Param("code") String code,
			@Param("name") String name, @Param("org") String org, @Param("isEffective") String isEffective);

	/**
	 * 查询所有有效的维修班组
	 * 
	 * @return
	 */
	List<Map<String, Object>> queryShiftGroupMain(@Param("org") String org);

	/**
	 * 查询为生产班组的班组信息
	 * 
	 * @param params
	 * @param isMaintainTeam
	 * @param org
	 * @param name
	 * @param lineCode
	 * @return
	 */
	List<Map<String, Object>> qureyByGoupClass(@Param("params") Map<String, Object> params,
			@Param("isMaintainTeam") Integer isMaintainTeam, @Param("org") String org, @Param("name") String name,
			@Param("dept") String dept,@Param("code") String code);

	Integer getByGoupClassCount(@Param("isMaintainTeam") Integer isMaintainTeam, @Param("org") String org,
			@Param("name") String name, @Param("dept") String dept,@Param("code") String code);
	
	ShiftGroup getGroup(@Param("code")String code,@Param("org")String org);
}
