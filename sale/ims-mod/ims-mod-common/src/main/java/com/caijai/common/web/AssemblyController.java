package com.caijai.common.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.caijai.common.entity.Assembly;
import com.caijai.common.service.dml.AssemblyDML;

@Controller
@RequestMapping("assembly.do")
public class AssemblyController {
	
	@Autowired
	private AssemblyDML assemblyDML;

	@RequestMapping(params = "queryPage")
	@ResponseBody
	public Map<String, Object> queryPage(String pageNumber, String pageSize, Assembly assembly) {
		return assemblyDML.queryPage(pageNumber, pageSize, assembly);
	}
	
	@RequestMapping(params = "save")
	@ResponseBody
	public Map<String, Object> save(Assembly assembly) {
		Map<String, Object> map = new HashMap<>();
		map.put("result", assemblyDML.save(assembly));
		return map;
	}
	
	@RequestMapping(params = "invalid")
	@ResponseBody
	public Map<String, Object> invalid(Assembly assembly) {
		Map<String, Object> map = new HashMap<>();
		map.put("result", assemblyDML.invalid(assembly));
		return map;
	}
}
