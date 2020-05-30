/**
 * @author CY
 * @date 2019年1月2日 
 */
package com.caijai.data.api.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caijai.base.dao.BaseDao;
import com.caijai.base.sysenum.U9STATE;
import com.caijai.base.sysenum.UserType;
import com.caijai.base.util.DateUtil;
import com.caijai.base.util.StringUtil;
import com.caijai.data.entity.Supplier;
import com.caijai.data.mapper.SupplierMapper;
import com.caijai.sysuser.api.SupplierApi;
import com.caijai.sysuser.entity.SysUser;
import com.caijai.sysuser.util.MySession;
import com.caijai.sysuser.util.PasswordUtil;

/**
 * @author CY
 * @date 2019年1月2日
 */
@Service
public class SupplierApiImpl implements SupplierApi{
	
	@Autowired
	private BaseDao<SysUser> sysUserDao;
	
	/*
	 * @Autowired private BaseDao<UserRole> userRoleDao;
	 * 
	 * @Autowired private BaseDao<Role> roleDao;
	 */	

	@Autowired
	private SupplierMapper supplierMapper;
	
	/* 
	 *
	 */
	@Override
	public Map<String, Object> runFollowTask(String procedure,String org) {
		Map<String,Object> map = new HashMap<String,Object>();
		if(StringUtil.IsNullOrEmpty(procedure)) {
			return null;
		}
		List<Supplier> supplier = supplierMapper.getUserBySupplier(org);
		for (int i = 0; i < supplier.size(); i++) {
			SysUser user = new SysUser();
			//Role roles = roleDao.getById("supplierUser");
			user.setId(StringUtil.uuid());
			//初始密码为123456
			user.setPassword(PasswordUtil.initPaw(""));
			user.setCreatetime(DateUtil.nowDate());
			user.setCreator(MySession.currentUser().getUsername());
			user.setCorpPk(MySession.currentUser().getCorpPk());
			user.setCompany(MySession.currentUser().getCompany());
			user.setUsername(supplier.get(i).getName());
			user.setShowName(supplier.get(i).getName());
			user.setSupplierID(supplier.get(i).getId());
			//user.setRoleName(roles.getRoleName());
			user.setUsercode(supplier.get(i).getCode());
			//user.setMail(supplier.getEmail());
			user.setIsState(U9STATE.valid);
			//TODO 如何取供应商管理员用户  默认赋值为供应商用户
			//user.setRoleID(roles.getId());
			//为供应商用户
			user.setUserType(UserType.SupplierUser);
			user = PasswordUtil.encryption(user);
			//新增用户绑定角色
			/*UserRole role = new UserRole();
			role.setId(StringUtil.uuid());
			role.setCreateTime(DateUtil.nowDate());
			role.setOrg(MySession.currentUser().getCorpPk());
			role.setRoleID(roles.getId());
			role.setRoleName(roles.getRoleName());
			role.setUserID(user.getId());
			userRoleDao.add(role);*/
			sysUserDao.add(user);
		}
		map.put("total", supplier.size());
		map.put("incount", supplier.size());
		map.put("upcount", 0);
		return map;
	}

}
