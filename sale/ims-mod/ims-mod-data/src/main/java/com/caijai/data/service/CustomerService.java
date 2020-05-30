package com.caijai.data.service;

import com.caijai.base.util.PageInfo;
import com.caijai.data.entity.Customer;
import com.caijai.data.entity.Supplier;

import java.util.List;
import java.util.Map;

public interface CustomerService {
	PageInfo<Customer> queryPage(PageInfo<Customer> pageInfo, Customer customer);

	Customer save(Customer customer);

	boolean invalid(Customer customer);

	Map<String, Object> saveCustomerUser(List<Customer> customer);

}
