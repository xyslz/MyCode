package com.caijai.eqpt.service.dml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caijai.eqpt.entity.vo.EmVO;
import com.caijai.eqpt.service.EmVOService;
import com.caijai.base.dao.BaseDao;
import com.caijai.base.service.DMLServiceSupport;

/**
 * 设备台账
 * @author ChenYu
 *
 */
@Service
public class EmVODML extends DMLServiceSupport<EmVO> implements EmVOService{
	
	@Autowired
	private BaseDao<EmVO> baseDao; 

	@Override
	public EmVO getById(String id) {
		return baseDao.getById(id);
	}

	@Override
	public EmVO query(EmVO em) {
		return baseDao.getByParam(em);
	}
}
