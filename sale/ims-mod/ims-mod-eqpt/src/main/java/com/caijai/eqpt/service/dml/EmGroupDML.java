package com.caijai.eqpt.service.dml;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caijai.eqpt.entity.EmGroup;
import com.caijai.eqpt.entity.ProductionLine;
import com.caijai.eqpt.mapper.EmGroupMapper;
import com.caijai.eqpt.service.EmgroupService;
import com.caijai.base.dao.BaseDao;
import com.caijai.base.service.DMLServiceSupport;
import com.caijai.sysuser.util.MySession;

@Service
public class EmGroupDML extends DMLServiceSupport<EmGroup> implements EmgroupService{

	@Autowired
	private BaseDao<EmGroup> dao;
	
	@Autowired
	private EmGroupMapper mapper;
	
	/**
	 * 查询所有设备组
	 */
	@Override
	public List<EmGroup> queryAll() {
		return dao.queryTable(MySession.currentUser().getCorpPk());
	}

	@Override
	public List<EmGroup> queryByProline(ProductionLine line) {
		return mapper.queryByProline(line.getId());
	}

}