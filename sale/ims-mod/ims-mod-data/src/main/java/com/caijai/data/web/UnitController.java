package com.caijai.data.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.caijai.base.service.DMLServiceSupport;
import com.caijai.data.entity.Unit;
import com.caijai.data.entity.vo.UnitVo;
import com.caijai.data.service.UnitService;

@Controller
@RequestMapping("unit.do")
public class UnitController{
	
	@Autowired
	private UnitService unitService;
	
	@Autowired
	private DMLServiceSupport<UnitVo> unitVODML;

	@RequestMapping(params = "queryPage")
	@ResponseBody
	public Map<String, Object> queryPage(String pageNumber, String pageSize, UnitVo unit) {
		return unitVODML.queryPage(pageNumber, pageSize, unit);
	}

	@RequestMapping(params = "save")
	@ResponseBody
	public Map<String, Object> save(Unit unit) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("result", unitService.save(unit));
		return map;
	}

	@RequestMapping(params = "invalid")
	@ResponseBody
	public Map<String, Object> invalid(String id) {
		Map<String, Object> map = new HashMap<String, Object>();
		Unit unit = new Unit();
		unit.setId(id);
		map.put("success", unitService.invalid(unit));
		return map;
	}

}