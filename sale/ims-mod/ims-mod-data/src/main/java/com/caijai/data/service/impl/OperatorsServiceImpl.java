package com.caijai.data.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caijai.base.dao.BaseDao;
import com.caijai.base.service.DMLServiceSupport;
import com.caijai.base.util.DateUtil;
import com.caijai.base.util.PageInfo;
import com.caijai.base.util.StringUtil;
import com.caijai.data.entity.Operators;
import com.caijai.data.entity.RelationObject;
import com.caijai.data.mapper.OperatorsMapper;
import com.caijai.data.service.OperatorsService;
import com.caijai.sysuser.util.MySession;

@Service
public class OperatorsServiceImpl extends DMLServiceSupport<Operators> implements OperatorsService{
	
	@Autowired
	private BaseDao<Operators> dao;
	
	@Autowired
	private BaseDao<RelationObject> relationDao;
	
	@Autowired
	private OperatorsMapper mapper;
	
	@Override
	public PageInfo<Operators> queryPage(PageInfo<Operators> pageInfo, Operators operators) {
		return dao.queryPage(pageInfo, operators);
	}

	/**
	 * 业余员绑定用户
	 */
	@Override
	public Operators updateRelation(Operators operators) {
		RelationObject relation = new RelationObject();
		relation.setOperatorID(operators.getId());
		RelationObject object = relationDao.getByParam(relation);
		//如果之前存在邦定人员关系则删除
		if(object != null){
			relationDao.delete(object);
		}
		relation.setId(StringUtil.uuid());
		relation.setUserID(operators.getUserID());
		relation.setCreatedBy(MySession.currentUser().getUsername());
		relation.setCreatedOn(DateUtil.nowDate());
		relationDao.add(relation);
		//dao.modify(operators);
		return mapper.getByID(operators.getId());
	}

	@Override
	public List<Operators> queryList(Operators operators) {
		operators.setEffective_IsEffective(1);
		return dao.getListByParam(operators);
	}

	@Override
	public Operators getByCode(Operators operators) {
		return dao.getByParam(operators);
	}

	@Override
	public Operators getByOperator(Operators operators) {
		List<Operators> list = mapper.getOpera(operators.getCode(), MySession.currentUser().getCorpPk());
		if (list != null && list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

}
