package com.caijai.dock.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caijai.dock.entity.WaitTasks;
import com.caijai.dock.service.TaskProcessService;
import com.caijai.ets.api.DockCompleteApi;
import com.caijai.pur.api.DockOffApi;

@Service
public class TaskProcessServiceImpl implements TaskProcessService{

//	@Autowired
	private DockOffApi dockOffApi;
	
//	@Autowired
	private DockCompleteApi dockComApi;
	
	@Override
	public Map<String, Object> getData(String id,Integer type) {
		return dockOffApi.getData(id,type);
	}

	@Override
	public Map<String,Object> callInterface(Map<String, Object> map,Integer type){
		Map<String,Object> mapReturn = dockOffApi.callInterface(map,type);
		return mapReturn;
	}

	@Override
	public Map<String, Object> getDataWg(String id, Integer type) {
		return dockComApi.getDataWg(id, type);
	}

	@Override
	public Map<String, Object> callInterfaceWg(Map<String, Object> map, Integer type){
		Map<String, Object> mapReturn = dockComApi.callInterfaceWg(map,type);
		return mapReturn;
	}

	@Override
	public Map<String, Object> getSpecialData(WaitTasks task) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", task.getOrderId());//任务列表中存在的某类型单据的id
		map.put("docNo", task.getOrderNum());//任务列表中存在的某类型单据的单号
		map.put("type", task.getTaskType());//任务的类型，注意：此处存入map的是任务类型枚举
		return dockComApi.getSpecialData(map);
	}
	
}
