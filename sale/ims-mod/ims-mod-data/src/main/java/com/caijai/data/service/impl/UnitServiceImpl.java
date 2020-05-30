package com.caijai.data.service.impl;

import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.caijai.base.dao.BaseDao;
import com.caijai.base.util.PageInfo;
import com.caijai.base.util.StringUtil;
import com.caijai.data.entity.Unit;
import com.caijai.data.service.UnitService;

@Service("unitService")
public class UnitServiceImpl implements UnitService {
	@Autowired
	private BaseDao<Unit> unitDao;

	@Override
	public PageInfo<Unit> queryPage(PageInfo<Unit> pageInfo, Unit unit) {
		return unitDao.queryPage(pageInfo, unit);
	}

	@Override
	@Transactional
	public Unit save(Unit unit) {
		if (StringUtil.IsNullOrEmpty(unit.getId())) {
			unit.setId(UUID.randomUUID().toString());
			return unitDao.add(unit);
		}

		return unitDao.modify(unit);
	}

	@Override
	@Transactional
	public boolean invalid(Unit unit) {

		return unitDao.invalidByPk(unit);
	}

}