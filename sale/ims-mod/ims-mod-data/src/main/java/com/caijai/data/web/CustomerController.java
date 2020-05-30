package com.caijai.data.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.caijai.data.entity.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.caijai.base.service.DMLServiceSupport;
import com.caijai.data.entity.Customer;
import com.caijai.data.entity.vo.CustomerVo;
import com.caijai.data.service.CustomerService;

@Controller
@RequestMapping("customer.do")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@Autowired
	private DMLServiceSupport<CustomerVo> customerVODML;

	@RequestMapping(params = "queryPage")
	@ResponseBody
	public Map<String, Object> queryPage(String pageNumber, String pageSize, CustomerVo customer) {
		return customerVODML.queryPage(pageNumber, pageSize, customer);
	}

	@RequestMapping(params = "save")
	@ResponseBody
	public Map<String, Object> save(@RequestBody Customer customer) {
		Map<String, Object> map = new HashMap<String, Object>();
		if(customer.getEffectiveIseffective()==null){
			customer.setEffectiveIseffective(0);
		}
		map.put("result", customerService.save(customer));
		return map;
	}

	@RequestMapping(params = "invalid")
	@ResponseBody
	public Map<String, Object> invalid(String id) {
		Map<String, Object> map = new HashMap<String, Object>();
		Customer customer = new Customer();
		customer.setId(id);
		map.put("success", customerService.invalid(customer));
		return map;
	}

	/**
	 * @Description:[生成客户用户]
	 * @author:Joonho
	 * @date:2019/11/13 15:40
	 * @param:[customer]
	 * @return:java.util.Map<java.lang.String,java.lang.Object>
	 **/
	@RequestMapping(params = "saveCustomerUser")
	@ResponseBody
	public Map<String, Object> saveCustomerUser(@RequestBody List<Customer> customer) {
		return customerService.saveCustomerUser(customer);
	}

}
