package com.caijai.data.api.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caijai.data.mapper.OperatorsMapper;
import com.caijai.sysuser.api.Operators;
import com.caijai.sysuser.api.OperatorsApi;

@Service
public class OperatorsApiImpl implements OperatorsApi{

	@Autowired
	private OperatorsMapper mapper;
	
	@Override
	public List<Operators> getByDept(String userID, String org) {
		List<Operators> operators = new ArrayList<>();
		List<com.caijai.data.entity.Operators> list = mapper.getByDept(userID, org);
		list.forEach(o -> {
			Operators operator = new Operators();
			operator.setDept(o.getDept());
			operator.setParentNode(o.getParentNode());
			operators.add(operator);
		});
		return operators;
	}

}
