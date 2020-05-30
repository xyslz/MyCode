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

import com.caijai.data.entity.Em;
import com.caijai.eqpt.entity.vo.EmVO;
import com.caijai.data.service.EmService;
import com.caijai.eqpt.service.EmVOService;
import com.caijai.base.service.DMLServiceSupport;
import com.caijai.base.service.FUNServiceSupport;

/**
 * 设备台账
 * 
 * @author ChenYu
 *
 */
@Controller
@RequestMapping("emvo.do")
public class EmVoController {
	
	@Autowired
	private DMLServiceSupport<Em> emDML;
	
	@Autowired
	private DMLServiceSupport<EmVO> emVODML;
	
	@Autowired
	private EmService service;
	
	@Autowired
	private EmVOService voservice;

	@Autowired
	private FUNServiceSupport<EmVO> emVoSupport;
	
	/**
	 * 查询分页
	 * @param pageNumber
	 * @param pageSize
	 * @param em
	 * @return
	 */
	@RequestMapping(params = "queryPage")
	@ResponseBody
	public Map<String, Object> queryPage(String pageNumber, String pageSize, EmVO em) {
		return emVODML.queryPage(pageNumber, pageSize, em);
	}

	
	/**
	 * 查询
	 * @param em
	 * @return
	 */
	@RequestMapping(params = "query")
	@ResponseBody
	public Map<String, Object> query(EmVO em){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("result", voservice.query(em));
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
		Em em = new Em();
		em.setId(id);
		return emDML.invalid(em);
	}

	/**
	 * 保存
	 * @param em
	 * @return
	 */
	@RequestMapping(params = "save")
	@ResponseBody
	public Map<String, Object> save(Em em) {
		Map<String, Object> map = new HashMap<>();
		map.put("result", emDML.save(em));
		return map;
	}
	
	/**
	 * 导出
	 * @param idList
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping(params="export")
	public void export(@RequestParam("list[]")List<String> idList,HttpServletResponse response) throws IOException{
		emVoSupport.export(idList, response);
	}
	
	/**
	 * 由产线查设备
	 * @param em
	 * @return
	 */
	@RequestMapping(params="emlist")
	@ResponseBody
	public Map<String, Object> emlist(String productionLine,String name) {
		Map<String, Object> map = new HashMap<String, Object>();
		Em em = new Em();
		em.setProductionLine(productionLine);
		em.setName(name);
		map.put("result", service.getList(em));
		return map;
	}
	
	@RequestMapping(params="getByParam")
	@ResponseBody
	public Map<String, Object> getByParam(Em em) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("result", service.getByParam(em));
		return map;
	}
	
}
