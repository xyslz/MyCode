package com.caijai.pur.api;

import java.util.Map;

/**
 * 脱机接口(采购部分)
 * @author WHD
 *
 */
public interface DockOffApi {

	/**
	 * 根据ID查询数据,封装为map传回来
	 * 获取接口所需数据map
	 * @return
	 */
	Map<String,Object> getData(String id,Integer type);
	
	/**
	 * 调用接口
	 * @param map 入参数据
	 * @param type 类型(杂收杂发等等)
	 * @return
	 */
	Map<String, Object> callInterface(Map<String,Object> map,Integer type);
	
}
