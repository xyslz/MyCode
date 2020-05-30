/**  
 * Title: MoController.java<p>
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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.caijai.base.service.DMLServiceSupport;
import com.caijai.base.util.PageInfo;
import com.caijai.data.entity.Mo;
import com.caijai.data.entity.vo.MoVO;
import com.caijai.data.service.MoService;

/**
 * Title: MoController
 * <p>
 * Description: <br>
 * 
 * @author 端鹏程
 * @date 2018年12月10日
 */
@Controller
@RequestMapping("mo.do")
public class MoController {

	@Autowired
	private DMLServiceSupport<Mo> moDML;

	@Autowired
	private MoService service;

	/**
	 * 同步数据
	 * @return
	 */
	@RequestMapping(params = "syncMomo")
	@ResponseBody
	public Map<String, Object> syncMomo() {
		Map<String, Object> map = new HashMap<>();
		map.put("total", service.syncMomo());
		return map;
	}

	/**
	 * Title: 订单执行情况
	 * <p>
	 * Description:
	 * 
	 * @author 端鹏程
	 * @date 2019年1月7日
	 */
	@RequestMapping(params = "queryPageReport")
	@ResponseBody
	public Map<String, Object> queryPageReport(String pageNumber, String pageSize, MoVO mo, String applyDateFrom,
			String applyDateEnd, String qcDocCreateDateFrom, String qcDocCreateDateEnd, String businessDateFrom,
			String businessDateEnd) {
		Map<String, Object> map = new HashMap<String, Object>();
		PageInfo<MoVO> pageInfo = new PageInfo<MoVO>(pageNumber, pageSize);
		pageInfo = service.queryPageReport(pageInfo, mo, applyDateFrom, applyDateEnd, qcDocCreateDateFrom,
				qcDocCreateDateEnd, businessDateFrom, businessDateEnd);
		map.put("total", pageInfo.getTotal());
		map.put("rows", pageInfo.getRows());
		return map;
	}

	@RequestMapping(params = "queryPage")
	@ResponseBody
	public Map<String, Object> queryPage(String pageNumber, String pageSize, Mo mo, String startDateFrom,
			String startDateEnd) {
		return service.queryPage(pageNumber, pageSize, mo, startDateFrom, startDateEnd);
	}

	@RequestMapping(params = "getByParams")
	@ResponseBody
	public Map<String, Object> getByParams(Mo mo) {
		Map<String, Object> map = new HashMap<>();
		map.put("result", service.getByParams(mo));
		return map;
	}

	@RequestMapping(params = "queryList")
	@ResponseBody
	public Map<String, Object> queryList(Mo mo) {
		Map<String, Object> map = new HashMap<>();
		map.put("result", service.queryList(mo));
		return map;
	}

	/**
	 * Title: 查询未完成的生产订单
	 * <p>
	 * Description:
	 * 
	 * @author 端鹏程
	 * @date 2018年12月26日
	 */
	@RequestMapping(params = "queryNoCompleteList")
	@ResponseBody
	public Map<String, Object> queryNoCompleteList(String startDate, String endDate) {
		Map<String, Object> map = new HashMap<>();
		map.put("result", service.queryNoCompleteList(startDate, endDate));
		return map;
	}

	@RequestMapping(params = "getById")
	@ResponseBody
	public Map<String, Object> getById(Mo mo) {
		Map<String, Object> map = new HashMap<>();
		map.put("result", service.getById(mo));
		return map;
	}

	@RequestMapping(params = "save")
	@ResponseBody
	public Map<String, Object> save(Mo mo) {
		Map<String, Object> map = new HashMap<>();
		map.put("result", moDML.save(mo));
		return map;
	}

	@RequestMapping(method = RequestMethod.POST, params = "invalid")
	@ResponseBody
	public Map<String, Object> invalid(String userKey, String userName, String org, String docNo) {
		if ("U9PIMODE".equals(userKey)) {
			return service.invalid(userName, org, docNo);
		}
		return null;
	}
	
	@RequestMapping(params = "closeMo")
	@ResponseBody
	public Map<String, Object> closeMo(Mo mo) {
		return service.closeMo(mo);
	}

}
