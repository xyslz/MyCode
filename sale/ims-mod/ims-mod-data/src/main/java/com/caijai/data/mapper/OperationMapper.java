package com.caijai.data.mapper;

import java.util.List;
import java.util.Map;

import com.caijai.data.entity.Operation;

public interface OperationMapper {

	Integer getTotalCount(Map<String, Object> map);

	List<Operation> queryPage(Map<String, Object> map);

}
