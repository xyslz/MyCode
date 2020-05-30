package com.caijai.data.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.caijai.base.service.DMLServiceSupport;
import com.caijai.data.entity.FormulaElementpercent;
import com.caijai.data.service.FormulaElementpercentService;

@Controller
@RequestMapping("fep.do")
public class FormulaElementpercentController {
	
	@Autowired
	private DMLServiceSupport<FormulaElementpercent> fepDML;
	
	@Autowired
	private FormulaElementpercentService feService;
	
	@RequestMapping(params = "queryPage")
	@ResponseBody
	public Map<String, Object> queryPage(String pageNumber, String pageSize, FormulaElementpercent e) {
		return fepDML.queryPage(pageNumber, pageSize, e);
	}

	@RequestMapping(params = "save")
	@ResponseBody
	public Map<String, Object> save(FormulaElementpercent e) {
		Map<String, Object> map = new HashMap<>();
		map.put("result", fepDML.save(e));
		return map;
	}

	@RequestMapping(params = "invalid")
	@ResponseBody
	public Map<String, Object> invalid(FormulaElementpercent e) {
		return fepDML.invalid(e);
	}
	
	@RequestMapping(params = "saves")
	@ResponseBody
	public Map<String, Object> saves(FormulaElementpercent e) {
		return feService.saves(e);
	}
}
