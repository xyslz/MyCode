package com.caijai.data.service;

import java.util.List;
import java.util.Map;

import com.caijai.data.entity.ItemMasterSub;

/**
 * Title: ItemMasterSubService生产副产品
 * <p>
 * Description: <br>
 * 
 * @author 杨雪景
 * @date 2019年4月24日
 */
public interface ItemMasterSubService {

	/**
	 * Title:queryPage
	 * 
	 * @author 杨雪景
	 * @date 2019年4月25日
	 * @param pageInfo
	 * @param itemMasterSub
	 * @return
	 */
	//PageInfo<ItemMasterSub> queryPage(PageInfo<ItemMasterSub> pageInfo, ItemMasterSub itemMasterSub);

	Map<String, Object> importItemSub(List<ItemMasterSub> warehouse);
	
	/**
	 * @author 杨雪景
	 * @date 2019年4月28日
	 * @param itemMasterSub
	 * @return
	 */
	List<ItemMasterSub> queryList(ItemMasterSub itemMasterSub);
	
	List<ItemMasterSub> getListByItem(ItemMasterSub itemMasterSub);
	
	Map<String,Object> update(ItemMasterSub itemMasterSub);

	List<ItemMasterSub> saveList(List<Map<String, Object>> sublist);

	List<ItemMasterSub> getList(ItemMasterSub sub);
}
