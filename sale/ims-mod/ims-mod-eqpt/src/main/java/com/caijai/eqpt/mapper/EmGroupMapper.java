package com.caijai.eqpt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.caijai.eqpt.entity.EmGroup;

public interface EmGroupMapper {
	
	/**
	 * 根据产线查询设备组信息
	 * @param productionLine
	 * @return
	 */
	List<EmGroup> queryByProline(@Param("proLine")String proLine);
	
}
