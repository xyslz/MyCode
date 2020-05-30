package com.caijai.data.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.caijai.base.service.DMLServiceSupport;
import com.caijai.base.util.PageInfo;
import com.caijai.data.entity.Category;
import com.caijai.data.entity.ItemMaster;
import com.caijai.data.entity.vo.ItemMasterVo;
import com.caijai.data.entity.vo.PartVO;
import com.caijai.data.service.ItemMasterService;

@Controller
@RequestMapping("itemMaster.do")
public class ItemMasterController {
	
	@Autowired
	private ItemMasterService itemMasterService;
	
	@Autowired
	private DMLServiceSupport<ItemMasterVo> itemMasterVODML;

	/**
	 * 
	 * @param pageNumber
	 * @param pageSize
	 * @param inventory
	 * @return
	 */
	@RequestMapping(params = "queryPart")
	@ResponseBody
	public Map<String, Object> queryPagePart(String pageNumber, String pageSize, String code,String name,String categoryCode,String categoryName) {
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("code",code );
		param.put("name", name);
		param.put("categoryCode", categoryCode);
		param.put("categoryName", categoryName);
		PageInfo<PartVO> pageInfo = new PageInfo<PartVO>(pageNumber, pageSize);
		pageInfo = itemMasterService.queryPagePart(pageInfo, param);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("total", pageInfo.getTotal());
		map.put("rows", pageInfo.getRows());
		return map;
	}
	
	@RequestMapping(params = "queryPage")
	@ResponseBody
	public Map<String, Object> queryPage(String pageNumber, String pageSize, ItemMasterVo inventory) {
		return itemMasterVODML.queryPage(pageNumber, pageSize, inventory);
	}
	
	@RequestMapping(params = "queryPageCate")
	@ResponseBody
	public Map<String, Object> queryPageCate(String pageNumber, String pageSize, Category category) {
		Map<String, Object> map = new HashMap<String, Object>();
		PageInfo<Category> pageInfo = new PageInfo<Category>(pageNumber, pageSize);
		pageInfo = itemMasterService.queryPageCate(pageInfo, category);
		map.put("total", pageInfo.getTotal());
		map.put("rows", pageInfo.getRows());
		return map;
	}

	@RequestMapping(params = "save")
	@ResponseBody
	public Map<String, Object> save(ItemMasterVo inventory) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("result", itemMasterService.save(inventory));
		return map;
	}

	@RequestMapping(params = "invalid")
	@ResponseBody
	public Map<String, Object> invalid(String id) {
		Map<String, Object> map = new HashMap<String, Object>();
		ItemMaster inventory = new ItemMaster();
		inventory.setId(id);
		map.put("success", itemMasterService.invalid(inventory));
		return map;
	}
	
	@RequestMapping(params = "getItem")
	@ResponseBody
	public Map<String, Object> getItem(ItemMasterVo item) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("result", itemMasterService.getItem(item));
		return map;
	}
	
	/**
	 * 同步数据
	 * @return
	 */
	@RequestMapping(params = "sync")
	@ResponseBody
	public Map<String, Object> sync() {
		Map<String, Object> map = new HashMap<>();
		map.put("total", itemMasterService.sync());
		return map;
	}
	
	/**
	 * 生成副产品
	 * <p>  
	 * Description:
	 * @author 端鹏程  
	 * @date 2019年6月28日
	 */
	@RequestMapping(params = "syncSub")
	@ResponseBody
	public Map<String,Object> syncSub(ItemMasterVo item){
		Map<String, Object> map = new HashMap<>();
		map.put("result", itemMasterService.syncSub(item));
		return map;
	}
	
}