package com.caijai.data.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.caijai.base.dao.support.MultiDao;
import com.caijai.base.util.PageInfo;
import com.caijai.data.dao.SupplierDao;
import com.caijai.data.entity.Supplier;
import com.caijai.data.mapper.SupplierMapper;
import com.caijai.sysuser.util.MySession;

@Repository
public class SupplierDaoImpl extends MultiDao<Supplier> implements SupplierDao {

	@Autowired
	private SupplierMapper mapper;

	@Override
	public PageInfo<Supplier> queryPageByParam(PageInfo<Supplier> pageInfo, Supplier supplier) {
		Map<String, Object> map = new HashMap<>();
		map.put("org", MySession.currentUser().getCorpPk());
		map.put("code", supplier.getCode());
		map.put("name", supplier.getName());
		map.put("buyerName", supplier.getBuyerName());
		map.put("state", supplier.getState() == null ? null : supplier.getState().getIndex() + "");
		// supState 代表值
		// '挂起'-->查询除挂起及黑名单之外的，'解挂'-->查询已挂起的，'加入黑名单'-->查询所有的，'移出黑名单'-->查黑名单
		map.put("supState", supplier.getSupState());
		int total = mapper.getTotalByCZ(map);
		pageInfo.setTotal(total);
		map.put("pageInfo", pageInfo);
		if (total == 0) {
			return pageInfo;
		}
		List<Supplier> list = mapper.queryPageByCZ(map);
		pageInfo.setRows(list);
		return pageInfo;
	}

}