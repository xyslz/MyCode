package com.caijai.data.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.caijai.base.service.DMLServiceSupport;
import com.caijai.data.entity.Territory;

/**
 * 地区
 * 
 * @author duan2
 *
 */
@Controller
@RequestMapping("territory.do")
public class TerritoryController {

	@Autowired
	private DMLServiceSupport<Territory> territoryDML;

	/**
	 * 分页查询
	 * 
	 * @param pageNumber
	 * @param pageSize
	 * @param territory
	 * @return
	 */
	@RequestMapping(params = "queryPage")
	@ResponseBody
	public Map<String, Object> queryPage(String pageNumber, String pageSize, Territory territory) {
		return territoryDML.queryPage(pageNumber, pageSize, territory);
	}

	/**
	 * 保存
	 * 
	 * @param territory
	 * @return
	 */
	@RequestMapping(params = "save")
	@ResponseBody
	public Map<String, Object> save(Territory territory) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("result", territoryDML.save(territory));
		return map;
	}

	/**
	 * 作废
	 * 
	 * @param territory
	 * @return
	 */
	@RequestMapping(params = "invalid")
	@ResponseBody
	public Map<String, Object> invalid(Territory territory) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("success", territoryDML.invalid(territory));
		return map;
	}

}
