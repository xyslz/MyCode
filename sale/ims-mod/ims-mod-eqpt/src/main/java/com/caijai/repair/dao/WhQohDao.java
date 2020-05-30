package com.caijai.repair.dao;

import java.util.Map;

import com.caijai.repair.entity.WhQoh;
import com.caijai.base.util.PageInfo;

public interface WhQohDao {

	PageInfo<WhQoh> queryPage(PageInfo<WhQoh> pageInfo, Map<String, Object> params);


}
