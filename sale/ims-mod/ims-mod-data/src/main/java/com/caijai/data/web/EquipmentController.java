package com.caijai.data.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.caijai.base.service.DMLServiceSupport;
import com.caijai.data.entity.Equipment;

@Controller
@RequestMapping("equipment.do")
public class EquipmentController {

	@Autowired
	private DMLServiceSupport<Equipment> equipmentDML;

	@RequestMapping(params = "queryPage")
	@ResponseBody
	public Map<String, Object> queryPage(String pageNumber, String pageSize, Equipment e) {
		return equipmentDML.queryPage(pageNumber, pageSize, e);
	}

	@RequestMapping(params = "save")
	@ResponseBody
	public Map<String, Object> save(Equipment e) {
		Map<String, Object> map = new HashMap<>();
		map.put("result", equipmentDML.save(e));
		return map;
	}

	@RequestMapping(params = "invalid")
	@ResponseBody
	public Map<String, Object> invalid(Equipment e) {
		return equipmentDML.invalid(e);
	}

}
