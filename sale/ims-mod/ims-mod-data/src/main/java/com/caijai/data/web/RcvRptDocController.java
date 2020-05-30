/**  
 * Title: RcvRptDocController.java<p>
 * Description: <br>  
 * Copyright: Copyright (c) 2017<br> 
 * Company: www.caijai.com<br>  
 * @author 端鹏程
 * @date 2018年12月10日  
 * @version 1.0  
 */
package com.caijai.data.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.caijai.base.service.DMLServiceSupport;
import com.caijai.data.entity.RcvRptDoc;
import com.caijai.data.entity.RcvRptDocLine;
import com.caijai.data.service.RcvRptDocService;

/**
 * Title: RcvRptDocController
 * <p>
 * Description: <br>
 * 
 * @author 端鹏程
 * @date 2018年12月10日
 */
@Controller
@RequestMapping("rcvRptDoc.do")
public class RcvRptDocController {

	@Autowired
	private DMLServiceSupport<RcvRptDoc> rptDocDML;

	@Autowired
	private DMLServiceSupport<RcvRptDocLine> rcvRptDocLineDML;
	
	@Autowired
	private RcvRptDocService service;

	@RequestMapping(params = "queryPage")
	@ResponseBody
	public Map<String, Object> queryPage(String pageNumber, String pageSize, RcvRptDoc rptDoc) {
		return rptDocDML.queryPage(pageNumber, pageSize, rptDoc);
	}

	@RequestMapping(params = "queryPageLine")
	@ResponseBody
	public Map<String, Object> queryPageRcvRptDocLine(String pageNumber, String pageSize, RcvRptDocLine rcvRptDocLine) {
		return rcvRptDocLineDML.queryPage(pageNumber, pageSize, rcvRptDocLine);
	}

	@RequestMapping(params = "save")
	@ResponseBody
	public Map<String, Object> save(RcvRptDoc rptDoc) {
		Map<String, Object> map = new HashMap<>();
		map.put("result", rptDocDML.save(rptDoc));
		return map;
	}

	@RequestMapping(params = "saveLine")
	@ResponseBody
	public Map<String, Object> saveLine(RcvRptDocLine rcvRptDocLineSave) {
		Map<String, Object> map = new HashMap<>();
		map.put("rcvRptDocLineSave", rcvRptDocLineDML.save(rcvRptDocLineSave));
		return map;
	}

	@RequestMapping(params = "invalid")
	@ResponseBody
	public Map<String, Object> invalid(RcvRptDoc rptDoc) {
		return rptDocDML.invalid(rptDoc);
	}

	@RequestMapping(params = "invalidLine")
	@ResponseBody
	public Map<String, Object> invalidLine(RcvRptDocLine rcvRptDocLineInvalid) {
		Map<String, Object> map = new HashMap<>();
		map.put("rcvRptDocLineInvalid", rcvRptDocLineDML.invalid(rcvRptDocLineInvalid));
		return map;
	}
	
	@RequestMapping(params = "getRptLine")
	@ResponseBody
	public Map<String, Object> getRptLine(RcvRptDocLine line) {
		Map<String, Object> map = new HashMap<>();
		map.put("result", service.getRptLine(line));
		return map;
	}

}
