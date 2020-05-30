package com.caijai.data.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.caijai.base.service.DMLServiceSupport;
import com.caijai.base.util.PageInfo;
import com.caijai.data.entity.Operators;
import com.caijai.data.service.OperatorsService;

/**
 * Title: OperatorsController<p>  
 * Description: <br>  
 * @author 端鹏程  
 * @date 2019年4月12日
 */
@Controller
@RequestMapping("operators.do")
public class OperatorsController {

	@Autowired
	private DMLServiceSupport<Operators> operationDML;
	
	@Autowired
	private OperatorsService service;

	@RequestMapping(params = "queryPage")
	@ResponseBody
	public Map<String, Object> queryPage(String pageNumber, String pageSize, Operators operators) {
		Map<String, Object> map = new HashMap<String, Object>();
		PageInfo<Operators> pageInfo = new PageInfo<Operators>(pageNumber, pageSize);
		pageInfo = service.queryPage(pageInfo, operators);
		map.put("total", pageInfo.getTotal());
		map.put("rows", pageInfo.getRows());
		return map;
	}
	
	@RequestMapping(params = "queryList")
	@ResponseBody
	public Map<String, Object> queryList(Operators operators) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("result",  service.queryList(operators));
		return map;
	}
	
	/**
	 * 移动端扫码
	 * @author CY
	 * @date 2019年5月20日
	 * @param code
	 * @return
	 */
	@RequestMapping(params = "getByCode")
	@ResponseBody
	public Map<String, Object> getByCode(Operators operators) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("result",  service.getByCode(operators));
		return map;
	}
	
	/**
	 * 根据条件模糊查询编码和名称
	 * @author CY
	 * @date 2019年5月22日
	 * @param operators
	 * @return
	 */
	@RequestMapping(params = "getByOperator")
	@ResponseBody
	public Map<String, Object> getByOperator(Operators operators) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("result",  service.getByOperator(operators));
		return map;
	}
	
	@RequestMapping(params = "save")
	@ResponseBody
	public Map<String, Object> save(Operators operators) {
		Map<String, Object> map = new HashMap<>();
		map.put("result", operationDML.save(operators));
		return map;
	}

	@RequestMapping(params = "invalid")
	@ResponseBody
	public Map<String, Object> invalid(Operators operators) {
		return operationDML.invalid(operators);
	}
	
	@RequestMapping(params = "updateRelation")
	@ResponseBody
	public Map<String, Object> updateRelation(Operators operators) {
		Map<String, Object> map = new HashMap<>();
		map.put("result", service.updateRelation(operators));
		return map;
	}
}
