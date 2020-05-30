package com.caijai.dock.service;

import java.io.IOException;
import java.util.Map;

import com.caijai.dock.entity.WaitTasks;

public interface TaskProcessService {


	/**
	 * 根据ID查询数据,封装为map传回来
	 * 获取接口所需数据map
	 * @return
	 */
	Map<String,Object> getData(String id,Integer type);
	
	/**
	 * 调用接口
	 * @return
	 */
	Map<String,Object> callInterface(Map<String,Object> map,Integer type);
	
	/**
	 * 根据ID查询数据,封装为map传回来
	 * 获取接口所需数据map
	 * @return
	 */
	Map<String,Object> getDataWg(String id,Integer type);
	
	/**
	 * 特殊完工数据
	 * @Param map 特殊数据  type-->任务类型
	 */
	Map<String,Object> getSpecialData(WaitTasks task);
	
	/**
	 * 调用接口
	 * @return
	 */
	Map<String, Object> callInterfaceWg(Map<String,Object> map,Integer type);
}
