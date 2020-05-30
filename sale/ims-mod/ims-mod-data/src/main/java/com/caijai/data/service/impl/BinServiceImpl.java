package com.caijai.data.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caijai.base.dao.BaseDao;
import com.caijai.base.service.DMLServiceSupport;
import com.caijai.data.entity.Bin;
import com.caijai.data.service.BinService;

@Service
public class BinServiceImpl extends DMLServiceSupport<Bin> implements BinService{
	
	@Autowired
	private BaseDao<Bin> dao;

	/**
	 * 校验编码唯一
	 */
	@Override
	public Bin add(Bin bin){
		Bin s = new Bin();
		s.setId(bin.getId());
		s.setCode(bin.getCode());
		s.setWarehouse(bin.getWarehouse());
		dao.checkDoubleNoPk(s);
		return super.add(bin);
	}
	
	@Override
	public Bin chooseBin(Bin bin) {
		return dao.getByParam(bin);
	}
	
	@Override
	public List<Bin> chooseBinList(Bin bin) {
		return dao.getListByParam(bin);
	}
	
}
