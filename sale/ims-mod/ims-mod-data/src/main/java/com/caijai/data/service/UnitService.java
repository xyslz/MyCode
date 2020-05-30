package com.caijai.data.service;

import com.caijai.base.util.PageInfo;
import com.caijai.data.entity.Unit;

public interface UnitService {
	PageInfo<Unit> queryPage(PageInfo<Unit> pageInfo, Unit unit);

	Unit save(Unit unit);

	boolean invalid(Unit unit);

}