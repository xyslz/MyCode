package com.caijai.eqpt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caijai.eqpt.entity.EmParam;
import com.caijai.eqpt.service.EmParamService;
import com.caijai.base.dao.BaseDao;
import com.caijai.base.util.PageInfo;
import com.caijai.base.util.StringUtil;

/**
 * 设备参数模板
 * @author ChenYu
 *
 */
@Service("equipmentParameterService")
public class EmParamServiceImpl implements EmParamService {

	@Autowired
	private BaseDao<EmParam> equipmentParameterDao;
	
	@Override
	public PageInfo<EmParam> queryPage(PageInfo<EmParam> pageInfo,
			EmParam equipmentParameter) {
		return equipmentParameterDao.queryPage(pageInfo, equipmentParameter);
	}

	@Override
	public EmParam save(EmParam equipmentParameter) {
		if(StringUtil.IsNullOrEmpty(equipmentParameter.getId())) {
			equipmentParameter.setId(StringUtil.uuid());
			return equipmentParameterDao.add(equipmentParameter);
		}
		return equipmentParameterDao.modify(equipmentParameter);
	}

	@Override
	public boolean invalid(EmParam equipmentParameter) {
		return equipmentParameterDao.invalidByPk(equipmentParameter);
	}

}
