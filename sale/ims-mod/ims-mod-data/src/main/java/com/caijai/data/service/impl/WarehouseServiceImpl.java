package com.caijai.data.service.impl;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.caijai.base.dao.BaseDao;
import com.caijai.base.util.PageInfo;
import com.caijai.base.util.StringUtil;
import com.caijai.data.entity.Territory;
import com.caijai.data.entity.Warehouse;
import com.caijai.data.service.WarehouseService;

@Service("warehouseService")
public class WarehouseServiceImpl implements WarehouseService {
	
	@Autowired
	private BaseDao<Warehouse> warehouseDao;
	
	@Autowired
	private BaseDao<Territory> territoryDao;

	@Override
	public PageInfo<Warehouse> queryPage(PageInfo<Warehouse> pageInfo, Warehouse warehouse) {
		return warehouseDao.queryPage(pageInfo, warehouse);
	}
	
	@Override
	public PageInfo<Territory> queryPageTerritory(PageInfo<Territory> pageInfo, Territory territory) {
		return territoryDao.queryPage(pageInfo, territory);
	}

	@Override
	@Transactional
	public Warehouse save(Warehouse warehouse) {
		if (StringUtil.IsNullOrEmpty(warehouse.getId())) {
			warehouse.setId(UUID.randomUUID().toString());
			return warehouseDao.add(warehouse);
		}

		return warehouseDao.modify(warehouse);
	}

	@Override
	@Transactional
	public boolean invalid(Warehouse warehouse) {

		return warehouseDao.invalidByPk(warehouse);
	}

}