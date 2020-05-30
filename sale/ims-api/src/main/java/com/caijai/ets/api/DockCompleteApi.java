package com.caijai.ets.api;

import java.util.Map;

/**
 * 脱机接口(完工部分)
 * @author WHD
 *
 */
public interface DockCompleteApi {

	/**
	 * 根据ID查询数据,封装为map传回来
	 * 获取接口所需数据map
	 * @return
	 */
	Map<String,Object> getDataWg(String docNo,Integer type);
	
	/**
	 * 特殊完工数据
	 * @Param map 特殊数据  type-->任务类型
	 */
	Map<String,Object> getSpecialData(Map<String,Object> map);
	
	/**
	 * 调用接口
	 * @param map 入参数据
	 * @param type 类型(杂收杂发等等)
	 * @return
	 */
	Map<String,Object> callInterfaceWg(Map<String,Object> map,Integer type);
	
}
