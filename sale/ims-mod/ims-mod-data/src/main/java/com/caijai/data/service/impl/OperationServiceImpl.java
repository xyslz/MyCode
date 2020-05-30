package com.caijai.data.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.caijai.base.service.DMLServiceSupport;
import com.caijai.base.util.PageInfo;
import com.caijai.data.entity.Operation;
import com.caijai.data.mapper.OperationMapper;
import com.caijai.data.service.OperationService;
import com.caijai.sysuser.util.MySession;

@Service
public class OperationServiceImpl extends DMLServiceSupport<Operation> implements OperationService{

	@Autowired
	private OperationMapper mapper;
	
	@Override
	@Transactional
	public PageInfo<Operation> queryPage(PageInfo<Operation> pageInfo, Operation operation, String moDocNo) {
		Map<String, Object> map = new HashMap<>();
		map.put("sequence", operation.getSequence());
		map.put("description", operation.getDescription());
		map.put("mo", moDocNo);
		map.put("org", MySession.currentUser().getCorpPk());
		Integer total = mapper.getTotalCount(map);
		if (total == 0) {
			return pageInfo;
		}
		pageInfo.setTotal(total);
		map.put("pageInfo", pageInfo);
		List<Operation> list = mapper.queryPage(map);
		pageInfo.setRows(list);
		return pageInfo;
	}

}
