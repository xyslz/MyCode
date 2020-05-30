package com.caijai.common.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.caijai.common.entity.Custom;
import com.caijai.common.service.dml.CustomDML;

@Controller
@RequestMapping("custom.do")
public class CustomController {
	
	@Autowired
	private CustomDML customDML;

	@RequestMapping(params = "queryPage")
	@ResponseBody
	public Map<String, Object> queryPage(String pageNumber, String pageSize, Custom custom) {
		return customDML.queryPage(pageNumber, pageSize, custom);
	}
	
	@RequestMapping(params = "save")
	@ResponseBody
	public Map<String, Object> save(Custom custom) {
		Map<String, Object> map = new HashMap<>();
		map.put("result", customDML.save(custom));
		return map;
	}
	
	@RequestMapping(params = "invalid")
	@ResponseBody
	public Map<String, Object> invalid(Custom custom) {
		Map<String, Object> map = new HashMap<>();
		map.put("result", customDML.invalid(custom));
		return map;
	}
}
