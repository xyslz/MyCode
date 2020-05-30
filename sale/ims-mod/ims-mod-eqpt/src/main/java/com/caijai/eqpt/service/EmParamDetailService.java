package com.caijai.eqpt.service;

import com.caijai.eqpt.entity.EmParamDetail;
import com.caijai.base.util.PageInfo;

public interface EmParamDetailService {
	PageInfo<EmParamDetail> queryPage(PageInfo<EmParamDetail> pageInfo, EmParamDetail equipmentParameterDetail);

	EmParamDetail save(EmParamDetail equipmentParameterDetail);

	boolean invalid(EmParamDetail equipmentParameterDetail);
}
