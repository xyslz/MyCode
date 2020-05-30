package com.caijai.eqpt.service;

import java.util.List;

import com.caijai.eqpt.entity.EmGroup;
import com.caijai.eqpt.entity.ProductionLine;

/**
 * 设备组
 * @author duan2
 *
 */
public interface EmgroupService {

	List<EmGroup> queryAll();
	
	/**
	 * 根据查询年信息查找设备组
	 * @param group
	 * @return
	 */
	List<EmGroup> queryByProline(ProductionLine line);

}
