package com.caijai.data.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.caijai.base.dao.support.MultiDao;
import com.caijai.base.util.PageInfo;
import com.caijai.data.entity.Operators;
import com.caijai.data.mapper.OperatorsMapper;
import com.caijai.sysuser.util.MySession;

@Repository
public class OperatorsDaoImpl extends MultiDao<Operators> {

	@Autowired
	private OperatorsMapper mapper;

	@Override
	public PageInfo<Operators> queryPage(PageInfo<Operators> pageInfo, Operators operators) {
		Map<String, Object> map = new HashMap<>();
		map.put("name", operators.getName());
		map.put("code", operators.getCode());
		map.put("deptName", operators.getDeptName());
		map.put("userName", operators.getUserName());
		map.put("userCode", operators.getUserCode());
		map.put("org", MySession.currentUser().getCorpPk());
		map.put("operatorType",
				operators.getOperatorType() == null ? null : operators.getOperatorType().getIndex() + "");
		Integer total = mapper.getTotalCount(map);
		if (total == 0) {
			return pageInfo;
		}
		pageInfo.setTotal(total);
		map.put("pageInfo", pageInfo);
		List<Operators> list = mapper.queryPage(map);
		pageInfo.setRows(list);
		return pageInfo;
	}

}
