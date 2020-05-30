package com.caijai.data.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.caijai.base.service.DMLServiceSupport;
import com.caijai.data.entity.ItemMasterSub;
import com.caijai.data.service.ItemMasterSubService;

/**
 * Title: ItemMasterSubController生产副产品
 * <p>
 * Description: <br>
 * 
 * @author 杨雪景
 * @date 2019年4月24日
 */
@Controller
@RequestMapping("itemMasterSub.do")
public class ItemMasterSubController {

	@Autowired
	private ItemMasterSubService service;

	@Autowired
	private DMLServiceSupport<ItemMasterSub> itemSubDML;

	/**
	 * 分页查询
	 * 
	 * @param pageNumber
	 * @param pageSize
	 * @param itemMasterSub
	 * @since 2019年4月25日
	 * @author 杨雪景
	 */
	@RequestMapping(params = "queryPage")
	@ResponseBody
	public Map<String, Object> queryPage(String pageNumber, String pageSize, ItemMasterSub itemMasterSub) {
		return itemSubDML.queryPage(pageNumber, pageSize, itemMasterSub);
	}

	@RequestMapping(params = "save")
	@ResponseBody
	public Map<String, Object> save(ItemMasterSub itemMasterSub) {
		return service.update(itemMasterSub);
	}

	@RequestMapping(params = "saveList")
	@ResponseBody
	public Map<String, Object> saveList(@RequestBody List<Map<String, Object>> sublist) {
		Map<String, Object> map = new HashMap<>();
		// 查询是否有重复的主产品料号
		ItemMasterSub sub = new ItemMasterSub();
		String code = sublist.get(0).get("mainProductsCode") + "";
		sub.setMainProductsCode(code);
		List<ItemMasterSub> list = service.getList(sub);
		if (list == null || list.isEmpty()) {
			map.put("result", service.saveList(sublist));
		} else {
			map.put("msg", "已存在主产品:" + code);
		}
		return map;
	}

	@RequestMapping(params = "invalid")
	@ResponseBody
	public Map<String, Object> invalid(ItemMasterSub itemMasterSub) {
		return itemSubDML.invalid(itemMasterSub);
	}

	/**
	 * 导入储存地点
	 * 
	 * @author CY
	 * @date 2019年4月24日
	 * @param bin
	 * @return
	 */
	@RequestMapping(params = "importItemSub")
	@ResponseBody
	public Map<String, Object> importItemSub(@RequestBody List<ItemMasterSub> list) {
		return service.importItemSub(list);
	}

	/**
	 * @author 杨雪景
	 * @date 2019年4月28日
	 * @param itemMasterSub
	 * @return
	 */
	@RequestMapping(params = "queryList")
	@ResponseBody
	public Map<String, Object> queryList(ItemMasterSub itemMasterSub) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("result", service.queryList(itemMasterSub));
		return map;
	}

	/**
	 * 根据物料查询泥和皮的副产品
	 * 
	 * @author CY
	 * @date 2019年4月29日
	 * @param itemMasterSub
	 * @return
	 */
	@RequestMapping(params = "getListByItem")
	@ResponseBody
	public Map<String, Object> getListByItem(ItemMasterSub itemMasterSub) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("result", service.getListByItem(itemMasterSub));
		return map;
	}
}
