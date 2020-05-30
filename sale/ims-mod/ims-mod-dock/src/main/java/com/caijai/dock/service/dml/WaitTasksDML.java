package com.caijai.dock.service.dml;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caijai.base.service.DMLServiceSupport;
import com.caijai.base.util.StringUtil;
import com.caijai.dock.entity.WaitTasks;
import com.caijai.dock.mapper.WaitTasksMapper;
import com.caijai.sysuser.util.MySession;

@Service
public class WaitTasksDML extends DMLServiceSupport<WaitTasks> {
	
	@Autowired
	private WaitTasksMapper mapper;
	
	@Override
	public Map<String, Object> queryPage(String pageNumber, String pageSize, WaitTasks t) {
		t.setOrg(MySession.currentUser().getCorpPk());
		Map<String, Object> map = new HashMap<String, Object>();
		List<WaitTasks> list = mapper.queryPage(pageNumber(pageNumber), pageSize(pageSize), t,t.getIsOffline().getIndex());
		int count = mapper.count(t,t.getIsOffline().getIndex());
		map.put("rows", list);
		map.put("total", count);
		return map;
	}
	
	private Integer pageNumber(String pageNumber){
		if(StringUtil.IsNullOrEmpty(pageNumber)){
			return 1;
		}else{
			return Integer.parseInt(pageNumber);
		}
	}
	
	private Integer pageSize(String pageSize){
		if(StringUtil.IsNullOrEmpty(pageSize)){
			return 10;
		}else{
			return Integer.parseInt(pageSize);
		}
	}
}