package com.caijai.data.mapper;

import java.util.List;
import java.util.Map;

import com.caijai.data.entity.vo.PartVO;

public interface PartMapper {

	int getTotalCount(Map<String, Object> param);

	List<PartVO> queryPage(Map<String, Object> param);

}
