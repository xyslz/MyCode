package com.caijai.repair.dao.simple;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.caijai.repair.dao.DispatchDao;
import com.caijai.repair.entity.DispatchOrderWx;
import com.caijai.repair.mapper.DispatchOrderWxMapper;
import com.caijai.base.dao.support.MultiDao;
import com.caijai.base.util.StringUtil;
import com.caijai.sysuser.util.MySession;

@Repository
public class DispatchImpl extends MultiDao<DispatchOrderWx> implements DispatchDao {

	@Autowired
	private DispatchOrderWxMapper mapper;

	@Override
	public int getDispatchOrderCount(Map<String, Object> params) {
		return mapper.getDispatchOrderCount(params);
	}

	@Override
	public List<DispatchOrderWx> queryPageByParam(Map<String, Object> params) {
		return mapToObject(mapper.queryPageByParam(params));
	}

	@Override
	public DispatchOrderWx add(DispatchOrderWx t) {
		if(StringUtil.IsNullOrEmpty(t.getCreatedBy())) {
			t.setCreatedBy(MySession.currentUser().getUsername());
		}
		return super.add(t);
	}

}
