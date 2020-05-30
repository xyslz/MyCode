package com.caijai.data.service;

import java.util.List;

import com.caijai.base.util.PageInfo;
import com.caijai.data.entity.Operators;

/**
 * 业务员
 * 
 * @author CY
 * @date 2018年11月20日
 */
public interface OperatorsService {
	
	/**
	 * 业余员绑定用户
	 * @param operators
	 * @return
	 */
	Operators updateRelation(Operators operators);

	PageInfo<Operators> queryPage(PageInfo<Operators> pageInfo, Operators dod);

	List<Operators> queryList(Operators operators);
	
	Operators getByCode(Operators operators);
	
	Operators getByOperator(Operators operators);

}
