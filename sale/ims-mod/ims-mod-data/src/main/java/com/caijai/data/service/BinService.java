package com.caijai.data.service;

import java.util.List;

import com.caijai.data.entity.Bin;

/**
 * 库位
 * @author CY
 * @date 2018年11月20日
 */
public interface BinService {
	
	/**
	 * 根据库位编码查找库位
	 * @author CY
	 * @date 2018年11月20日
	 * @param bin
	 * @return
	 */
	Bin chooseBin(Bin bin);

	/**
	 * 根据库位编码查找库位集合
	 * @author CY
	 * @date 2019年4月15日
	 * @param bin
	 * @return
	 */
	List<Bin> chooseBinList(Bin bin);
	
}
