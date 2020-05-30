package com.caijai.data.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.caijai.base.service.DMLServiceSupport;
import com.caijai.data.entity.ItemFormula;
import com.caijai.data.service.ItemFormulaService;

@Controller
@RequestMapping("itemFormula.do")
public class ItemFormulaController {
	
	@Autowired
	private DMLServiceSupport<ItemFormula> fepDML;
	
	@Autowired
	private ItemFormulaService ifService;
	
	@RequestMapping(params = "queryPage")
	@ResponseBody
	public Map<String, Object> queryPage(String pageNumber, String pageSize, ItemFormula itemFormula) {
		return fepDML.queryPage(pageNumber, pageSize, itemFormula);
	}

	@RequestMapping(params = "save")
	@ResponseBody
	public Map<String, Object> save(ItemFormula itemFormula) {
		Map<String, Object> map = new HashMap<>();
		map.put("result", fepDML.save(itemFormula));
		return map;
	}

	@RequestMapping(params = "invalid")
	@ResponseBody
	public Map<String, Object> invalid(ItemFormula itemFormula) {
		return fepDML.invalid(itemFormula);
	}
	
	@RequestMapping(params = "saves")
	@ResponseBody
	public Map<String, Object> saves(ItemFormula itemFormula) {
		return ifService.saves(itemFormula);
	}
}
