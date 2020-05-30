package com.caijai.data.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.caijai.base.service.DMLServiceSupport;
import com.caijai.data.entity.CustomerSite;

/**
 * 地区
 * 
 * @author duan2
 *
 */
@Controller
@RequestMapping("customerSite.do")
public class CustomerSiteController {

	@Autowired
	private DMLServiceSupport<CustomerSite> customerSiteDML;

	/**
	 * 分页查询
	 * 
	 * @param pageNumber
	 * @param pageSize
	 * @param customerSite
	 * @return
	 */
	@RequestMapping(params = "queryPage")
	@ResponseBody
	public Map<String, Object> queryPage(String pageNumber, String pageSize, CustomerSite customerSite) {
		return customerSiteDML.queryPage(pageNumber, pageSize, customerSite);
	}

	/**
	 * 保存
	 * 
	 * @param customerSite
	 * @return
	 */
	@RequestMapping(params = "save")
	@ResponseBody
	public Map<String, Object> save(CustomerSite customerSite) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("result", customerSiteDML.save(customerSite));
		return map;
	}

	/**
	 * 作废
	 * 
	 * @param customerSite
	 * @return
	 */
	@RequestMapping(params = "invalid")
	@ResponseBody
	public Map<String, Object> invalid(CustomerSite customerSite) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("success", customerSiteDML.invalid(customerSite));
		return map;
	}

}
