package com.caijai.data.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.caijai.base.service.DMLServiceSupport;
import com.caijai.base.util.PageInfo;
import com.caijai.data.entity.Territory;
import com.caijai.data.entity.Warehouse;
import com.caijai.data.entity.vo.WarehouseVo;
import com.caijai.data.service.WarehouseService;

@Controller
@RequestMapping("warehouse.do")
public class WarehouseController {
	
	@Autowired
	private WarehouseService warehouseService;
	
	@Autowired
	private DMLServiceSupport<WarehouseVo> warehouseVODML;

	@RequestMapping(params = "queryPage")
	@ResponseBody
	public Map<String, Object> queryPage(String pageNumber, String pageSize, WarehouseVo warehouse) {
		return warehouseVODML.queryPage(pageNumber, pageSize, warehouse);
	}
	
	@RequestMapping(params = "queryPageTerritory")
	@ResponseBody
	public Map<String, Object> queryPageTerritory(String pageNumber, String pageSize, Territory category) {
		Map<String, Object> map = new HashMap<String, Object>();
		PageInfo<Territory> pageInfo = new PageInfo<Territory>(pageNumber, pageSize);
		pageInfo = warehouseService.queryPageTerritory(pageInfo, category);
		map.put("total", pageInfo.getTotal());
		map.put("rows", pageInfo.getRows());
		return map;
	}

	@RequestMapping(params = "save")
	@ResponseBody
	public Map<String, Object> save(@RequestBody Warehouse warehouse) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("result", warehouseService.save(warehouse));
		return map;
	}

	@RequestMapping(params = "invalid")
	@ResponseBody
	public Map<String, Object> invalid(String id) {
		Map<String, Object> map = new HashMap<String, Object>();
		Warehouse warehouse = new Warehouse();
		warehouse.setId(id);
		map.put("success", warehouseService.invalid(warehouse));
		return map;
	}
	
}