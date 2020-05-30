package com.caijai.data.service;

import java.util.Map;

import com.caijai.base.util.PageInfo;
import com.caijai.data.entity.ShiftGroupClass;

public interface ShiftGroupClassService {
	
	/**
	 * 分页查询班组分类
	 * @param pageInfo
	 * @param shiftGroupClass
	 * @return
	 */
	PageInfo<ShiftGroupClass> queryPage(PageInfo<ShiftGroupClass> pageInfo, ShiftGroupClass shiftGroupClass);

	/**
	 * 保存班组分类
	 * @param shift
	 * @return
	 */
	ShiftGroupClass save(ShiftGroupClass shift);

	/**
	 * 作废班组分类
	 * @param shift
	 * @return
	 */
	Integer invalid(ShiftGroupClass shift);
	
	/**
	 * 检查班组分类编码是否重复
	 * @param id
	 * @return
	 */
	Map<String,Object> checkByID(String id);

	/**
	 * 查询当前组织中为父级的分类数据
	 * @param org
	 * @return
	 */
	Map<String, Object> queryParentClass();
	
}
