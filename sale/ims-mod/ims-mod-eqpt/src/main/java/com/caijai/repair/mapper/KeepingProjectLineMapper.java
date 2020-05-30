package com.caijai.repair.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.caijai.repair.entity.po.KeepingProjectLine;

public interface KeepingProjectLineMapper {

	/**
	 * 由设备表关联模板组合查出每个设备都需要检查的项目 <br>
	 * 从中筛选出该产线、该模板下的项目
	 * @param productionLine
	 * @param keepMouldID
	 * @return
	 */
	List<KeepingProjectLine> queryByMould(@Param("ProductionLine") String productionLine,
			@Param("KeepMouldID") String keepMouldID);;

}
