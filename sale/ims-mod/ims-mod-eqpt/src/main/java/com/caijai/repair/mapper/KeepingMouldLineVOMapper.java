package com.caijai.repair.mapper;

import java.util.List;
import java.util.Map;

import com.caijai.repair.entity.vo.KeepingMouldLineVO;

public interface KeepingMouldLineVOMapper {

	int getTotalCount(Map<String, Object> param);

	List<KeepingMouldLineVO> queryPage(Map<String, Object> param);
}
