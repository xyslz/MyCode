package com.caijai.data.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.caijai.base.service.DMLServiceSupport;
import com.caijai.base.util.PageInfo;
import com.caijai.base.util.StringUtil;
import com.caijai.data.entity.Operation;
import com.caijai.data.service.OperationService;

@Controller
@RequestMapping("operation.do")
public class OperationController {

	@Autowired
	private DMLServiceSupport<Operation> operationDML;
	
	@Autowired
	private OperationService oService;

	@RequestMapping(params = "queryPage")
	@ResponseBody
	public Map<String, Object> queryPage(String pageNumber, String pageSize, Operation operation) {
		return operationDML.queryPage(pageNumber, pageSize, operation);
	}

	@RequestMapping(params = "save")
	@ResponseBody
	public Map<String, Object> save(Operation operation) {
		Map<String, Object> map = new HashMap<>();
		map.put("result", operationDML.save(operation));
		return map;
	}

	@RequestMapping(params = "invalid")
	@ResponseBody
	public Map<String, Object> invalid(Operation operation) {
		return operationDML.invalid(operation);
	}
	
	@RequestMapping(params = "queryPageByMo")
	@ResponseBody
	public Map<String, Object> queryPageByMo(String pageNumber, String pageSize, Operation operation,String moDocNo) {
		if(StringUtil.IsNullOrEmpty(moDocNo)) {
			return operationDML.queryPage(pageNumber, pageSize, operation);
		}
		Map<String, Object> map = new HashMap<String, Object>();
		PageInfo<Operation> pageInfo = new PageInfo<Operation>(pageNumber, pageSize);
		pageInfo = oService.queryPage(pageInfo, operation, moDocNo);
		map.put("total", pageInfo.getTotal());
		map.put("rows", pageInfo.getRows());
		return map;
	}

}
