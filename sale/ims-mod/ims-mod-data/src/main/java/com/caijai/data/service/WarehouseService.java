package com.caijai.data.service;

import com.caijai.base.util.PageInfo;
import com.caijai.data.entity.Territory;
import com.caijai.data.entity.Warehouse;

public interface WarehouseService {
	PageInfo<Warehouse> queryPage(PageInfo<Warehouse> pageInfo, Warehouse warehouse);

	Warehouse save(Warehouse warehouse);

	boolean invalid(Warehouse warehouse);

	/**
	 * 查询地区
	 * @param pageInfo
	 * @param territory
	 * @return
	 */
	PageInfo<Territory> queryPageTerritory(PageInfo<Territory> pageInfo, Territory territory);

}