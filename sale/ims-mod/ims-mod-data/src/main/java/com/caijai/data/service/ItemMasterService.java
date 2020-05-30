package com.caijai.data.service;

import java.util.List;
import java.util.Map;

import com.caijai.base.util.PageInfo;
import com.caijai.data.entity.Category;
import com.caijai.data.entity.ItemMaster;
import com.caijai.data.entity.vo.ItemMasterVo;
import com.caijai.data.entity.vo.PartVO;

public interface ItemMasterService {

	PageInfo<ItemMaster> queryPage(PageInfo<ItemMaster> pageInfo, ItemMaster inventory);

	ItemMasterVo save(ItemMasterVo inventory);

	boolean invalid(ItemMaster inventory);

	List<ItemMaster> queryList(List<String> idList);

	/**
	 * 查询物料分类信息
	 * 
	 * @param pageInfo
	 * @param category
	 * @return
	 */
	PageInfo<Category> queryPageCate(PageInfo<Category> pageInfo, Category category);

	/**
	 * 查询零件
	 * 
	 * @param pageInfo
	 * @param category
	 * @return
	 */
	PageInfo<PartVO> queryPagePart(PageInfo<PartVO> pageInfo, Map<String, Object> param);

	ItemMasterVo getItem(ItemMasterVo item);
	
	ItemMaster getById(String id);
	
	int sync();

	/**
	 * Title: 生成副产品<p>  
	 * Description:
	 * @author 端鹏程  
	 * @date 2019年7月6日
	 */
	ItemMasterVo syncSub(ItemMasterVo item);

}