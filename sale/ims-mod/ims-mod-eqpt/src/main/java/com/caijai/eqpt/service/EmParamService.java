package com.caijai.eqpt.service;

import com.caijai.eqpt.entity.EmParam;
import com.caijai.base.util.PageInfo;

public interface EmParamService {
	PageInfo<EmParam> queryPage(PageInfo<EmParam> pageInfo, EmParam equipmentParameter);

	EmParam save(EmParam equipmentParameter);

	boolean invalid(EmParam equipmentParameter);
}
