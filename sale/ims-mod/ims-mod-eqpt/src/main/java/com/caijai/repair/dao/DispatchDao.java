package com.caijai.repair.dao;

import java.util.List;
import java.util.Map;

import com.caijai.repair.entity.DispatchOrderWx;

public interface DispatchDao {

	int getDispatchOrderCount(Map<String, Object> params);

	List<DispatchOrderWx> queryPageByParam(Map<String, Object> params);

}
