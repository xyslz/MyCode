package com.caijai.data.service;

import com.caijai.base.util.PageInfo;
import java.util.List;
import java.util.Map;
import com.caijai.data.entity.Em;

public interface EmService {

	/**
	 * 根据指定条件设备
	 * 
	 * @param em
	 * @return
	 */
	Em chooseEm(Em em);
	
	/**
	 * 导入库位
	 * @author CY
	 * @date 2019年4月24日
	 * @param list
	 * @return
	 */
	Map<String,Object> importBin(List<Em> list);
	
	List<Em> getList(Em em);

	Em getById(String id);
	
	/**
	 * 根据设备参数查找设备
	 * @param em
	 * @return
	 */
	Em getByParam(Em em);

}
