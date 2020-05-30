package com.caijai.data.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import com.caijai.base.sysenum.U9STATE;
import com.caijai.base.sysenum.UserType;
import com.caijai.base.util.DateUtil;
import com.caijai.sysuser.entity.SupplierOrg;
import com.caijai.sysuser.entity.SysUser;
import com.caijai.sysuser.util.MySession;
import com.caijai.sysuser.util.PasswordUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.caijai.base.dao.BaseDao;
import com.caijai.base.util.PageInfo;
import com.caijai.base.util.StringUtil;
import com.caijai.data.entity.Customer;
import com.caijai.data.service.CustomerService;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private BaseDao<Customer> customerDao;

	@Autowired
	private BaseDao<SysUser> sysUserDao;

	@Override
	public PageInfo<Customer> queryPage(PageInfo<Customer> pageInfo, Customer customer) {
		return customerDao.queryPage(pageInfo, customer);
	}

	@Override
	@Transactional
	public Customer save(Customer customer) {
		if (StringUtil.IsNullOrEmpty(customer.getId())) {
			customer.setId(UUID.randomUUID().toString());
			return customerDao.add(customer);
		}

		return customerDao.modify(customer);
	}

	@Override
	@Transactional
	public boolean invalid(Customer customer) {

		return customerDao.invalidByPk(customer);
	}

	/**
	 * @Description:[生成客户用户]
	 * @author:Joonho
	 * @date:2019/11/13 15:43
	 * @param:[customer]
	 * @return:java.util.Map<java.lang.String,java.lang.Object>
	 **/
	@Override
	public Map<String, Object> saveCustomerUser(List<Customer> customer) {
		Map<String, Object> map = new HashMap<String, Object>();
		String msg = "";
		List<SysUser> sys = new ArrayList<SysUser>();
		for (int i = 0; i < customer.size(); i++) {
			SysUser user = new SysUser();
			user.setUsercode(customer.get(i).getCode());
			// 判断当前生成的用户是否存在
			user.setDr(0);
			SysUser sysuser = sysUserDao.getByParam(user);
			if (sysuser == null) {
				user.setId(StringUtil.uuid());
				// 初始密码为123456
				user.setPassword(PasswordUtil.initPaw(""));
				user.setRoleID("004a0f8588484810ac9860f0e20f4f56");
				user.setRoleName("客户用户");
				user.setCreatetime(DateUtil.nowDate());
				user.setCreator(MySession.currentUser().getUsername());
				user.setCorpPk(MySession.currentUser().getCorpPk());
				user.setCompany(MySession.currentUser().getCompany());
				user.setUsername(customer.get(i).getName());
				user.setShowName(customer.get(i).getName());
				user.setSupplierID(customer.get(i).getId());
				user.setIsState(U9STATE.valid);
				user.setUserType(UserType.CustomerUser);
				user = PasswordUtil.encryption(user);
				sys.add(sysUserDao.add(user));
				/*SupplierOrg suporg = supOrgDao.getById(customer.get(i).getId());
				if (suporg == null) {
					// 如果不存在供应商组织关系则新增
					SupplierOrg org = new SupplierOrg();
					org.setId(customer.get(i).getId());
					org.setCode(user.getUsername());
					org.setCode(user.getUsercode());
					org.setShortName(user.getShowName());
					org.setEmail(user.getMail());
					org.setIsEff("1");
					org.setCreatedBy(MySession.currentUser().getUsername());
					supOrgDao.add(org);
				}*/
			} else {
				if (i == customer.size() - 1) {
					msg += customer.get(i).getCode();
				} else {
					msg += customer.get(i).getCode() + ",";
				}
			}
		}
		if (!StringUtil.IsNullOrEmpty(msg)) {
			map.put("msg", "客户编码为" + msg + "的用户已存在，请至用户档案查看");
		}
		map.put("result", sys);
		return map;
	}

}
