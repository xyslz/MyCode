package com.caijai.eqpt.web;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.caijai.eqpt.entity.EmGroup;
import com.caijai.eqpt.entity.ProductionLine;
import com.caijai.eqpt.entity.vo.EmGroupVO;
import com.caijai.eqpt.service.EmgroupService;
import com.caijai.base.service.DMLServiceSupport;
import com.caijai.base.service.FUNServiceSupport;

/**
 * 设备组
 * @author duan2
 *
 */
@Controller
@RequestMapping("emgroup.do")
public class EmGroupController {
	
	@Autowired
	private FUNServiceSupport<EmGroupVO> emgroupVOService;
	
	@Autowired
	private DMLServiceSupport<EmGroup> emgroupDML;
	
	@Autowired
	private DMLServiceSupport<EmGroupVO> emgroupVODML;

	@Autowired
	private EmgroupService service;
	
	/**
	 * 查询分页
	 * @param pageNumber
	 * @param pageSize
	 * @param emgroupVO
	 * @return
	 */
	@RequestMapping(params = "queryPage")
	@ResponseBody
	public Map<String, Object> queryPage(String pageNumber, String pageSize, EmGroupVO emgroupVO) {
		return emgroupVODML.queryPage(pageNumber, pageSize, emgroupVO);
	}

	/**
	 * 保存
	 * @param emgroup
	 * @return
	 */
	@RequestMapping(params = "save")
	@ResponseBody
	public Map<String, Object> save(EmGroup emgroup) {
		Map<String, Object> map = new HashMap<>();
		map.put("result", emgroupDML.save(emgroup));
		return map;
	}

	/**
	 * 作废
	 * @param id
	 * @return
	 */
	@RequestMapping(params = "invalid")
	@ResponseBody
	public Map<String, Object> invalid(String id) {
		EmGroup emgroup = new EmGroup();
		emgroup.setId(id);
		return  emgroupDML.invalid(emgroup);
	}
	
	/**
	 * 导出
	 * @param idList
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping(params="export")
	public void export(@RequestParam("list[]")List<String> idList,HttpServletResponse response) throws IOException{
		emgroupVOService.export(idList, response);
	}
	
	/**
	 * 获取所有设备组
	 * @return
	 */
	@RequestMapping(params = "queryAll")
	@ResponseBody
	public Map<String, Object> queryAll(){
		Map<String, Object> map = new HashMap<>();
		map.put("result", service.queryAll());
		return map;
	}
	
	/**
	 * 根据产线查询设备组
	 * @return
	 */
	@RequestMapping(params = "queryByProline")
	@ResponseBody
	public Map<String, Object> queryByProline(ProductionLine line){
		Map<String, Object> map = new HashMap<>();
		map.put("result", service.queryByProline(line));
		return map;
	}
}