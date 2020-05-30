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
import com.caijai.data.entity.Em;
import com.caijai.data.service.EmService;

@Controller
@RequestMapping("em.do")
public class EmController {

	@Autowired
	private EmService service;

	@Autowired
	private DMLServiceSupport<Em> emDML;

	/**
	 * 分页查询
	 * 
	 * @param pageNumber
	 * @param pageSize
	 * @param em
	 * @since 2019年4月26日
	 * @author 杨雪景
	 */
	@RequestMapping(params = "queryPage")
	@ResponseBody
	public Map<String, Object> queryPage(String pageNumber, String pageSize, Em em) {
		return emDML.queryPage(pageNumber, pageSize, em);
	}

	
	@RequestMapping(params = "save")
	@ResponseBody
	public Map<String, Object> save(Em em) {
		Map<String, Object> map = new HashMap<>();
		map.put("result", emDML.save(em));
		return map;
	}

	@RequestMapping(params = "invalid")
	@ResponseBody
	public Map<String, Object> invalid(Em em) {
		return emDML.invalid(em);
	}

	@RequestMapping(params = "chooseEm")
	@ResponseBody
	public Map<String, Object> chooseEm(Em em) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("result", service.chooseEm(em));
		return map;
	}
	
	/**
	 * 导入库位
	 * @author CY
	 * @date 2019年4月24日
	 * @param bin
	 * @return
	 */
	@RequestMapping(params = "importBin")
	@ResponseBody
	public Map<String, Object> importBin(@RequestBody List<Em> list) {
		return service.importBin(list);
	}

}
