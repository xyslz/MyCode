package com.caijai.data.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.caijai.base.service.DMLServiceSupport;
import com.caijai.data.entity.QRCode;
import com.caijai.data.service.QRCodeService;

/**
 * 退回处理单
 * 
 * @author CY
 * @date 2018年11月20日
 */
@Controller
@RequestMapping("QRCode.do")
public class QRCodeController {
	
	@Autowired
	private QRCodeService service;

	@Autowired
	private DMLServiceSupport<QRCode> codeDML;

	@RequestMapping(params = "queryPage")
	@ResponseBody
	public Map<String, Object> queryPage(String pageNumber, String pageSize, QRCode code) {
		return codeDML.queryPage(pageNumber, pageSize, code);
	}

	@RequestMapping(params = "save")
	@ResponseBody
	public Map<String, Object> save(QRCode code) {
		Map<String, Object> map = new HashMap<>();
		map.put("result", codeDML.save(code));
		return map;
	}

	@RequestMapping(params = "invalid")
	@ResponseBody
	public Map<String, Object> invalid(QRCode code) {
		return codeDML.invalid(code);
	}
	
	/**
	 * 打印物料标签
	 * @author CY
	 * @date 2019年7月22日
	 * @param delivery
	 * @return
	 */
	@RequestMapping(params = "getCode")
	@ResponseBody
	public Map<String, Object> getCode(QRCode code) {
		Map<String, Object> map = new HashMap<>();
		map.put("result", service.getCode(code));
		return map;
	}
	
	@RequestMapping(params = "getListCode")
	@ResponseBody
	public Map<String, Object> getListCode(QRCode code) {
		Map<String, Object> map = new HashMap<>();
		map.put("result", service.getListCode(code));
		return map;
	}
}
