package com.caijai.eqpt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.caijai.eqpt.entity.ProLineParam;

public interface ProLineParamMapper {
	
	/**
	 * 查询生产线的参数明细
	 * @param productionLine
	 * @return
	 */
	List<ProLineParam> queryProLineParam(@Param("productionLine")String productionLine,@Param("org") String org);
	
}
