package com.caijai.eqpt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caijai.eqpt.entity.EmParamDetail;
import com.caijai.eqpt.service.EmParamDetailService;
import com.caijai.base.dao.BaseDao;
import com.caijai.base.util.PageInfo;
import com.caijai.base.util.StringUtil;

/**
 * 设备参数模板祥表
 * @author ChenYu
 *
 */
@Service("equipmentParameterDetailService")
public class EmParamDetailServiceImpl implements EmParamDetailService {

	@Autowired
	private BaseDao<EmParamDetail> equipmentParameterDetailDao;
	
	@Override
	public PageInfo<EmParamDetail> queryPage(PageInfo<EmParamDetail> pageInfo,
			EmParamDetail equipmentParameterDetail) {
		return equipmentParameterDetailDao.queryPage(pageInfo, equipmentParameterDetail);
	}

	@Override
	public EmParamDetail save(EmParamDetail equipmentParameterDetail) {
		if(StringUtil.IsNullOrEmpty(equipmentParameterDetail.getId())) {
			equipmentParameterDetail.setId(StringUtil.uuid());
			return equipmentParameterDetailDao.add(equipmentParameterDetail);
		}
		return equipmentParameterDetailDao.modify(equipmentParameterDetail);
	}

	@Override
	public boolean invalid(EmParamDetail equipmentParameterDetail) {
		return equipmentParameterDetailDao.invalidByPk(equipmentParameterDetail);
	}

}
