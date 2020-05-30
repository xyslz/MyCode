package com.caijai.data.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.caijai.base.dao.BaseDao;
import com.caijai.base.service.DMLServiceSupport;
import com.caijai.base.util.DateUtil;
import com.caijai.data.entity.Em;
import com.caijai.data.mapper.EmMapper;
import com.caijai.data.service.EmService;
import com.caijai.sysuser.util.MySession;

@Service
public class EmServiceImpl extends DMLServiceSupport<Em> implements EmService{
	
	@Autowired
	private BaseDao<Em> dao;
	
	@Autowired
	private EmMapper mapper;

	/**
	 * 校验编码唯一
	 */
	@Override
	public Em add(Em Em){
		Em s = new Em();
		s.setId(Em.getId());
		s.setCode(Em.getCode());
		dao.checkDoubleNoPk(s);
		return super.add(Em);
	}

	@Override
	public Em chooseEm(Em em) {
		//dao.getByParam(em);
		return mapper.getEm(em.getCode(), MySession.currentUser().getCorpPk());
	}

	@Override
	@Transactional
	public Map<String, Object> importBin(List<Em> list) {
		Map<String, Object> map = new HashMap<String, Object>();
		int addCount = 0, modifyCount = 0;
		for (int i = 0; i < list.size(); i++) {
			Em em = dao.getById(list.get(i).getId());
			if (em == null) {
				addCount++;
				list.get(i).setCreatedBy(MySession.currentUser().getUsername());
				list.get(i).setCreatedOn(DateUtil.nowDate());
				dao.add(list.get(i));
			} else {
				modifyCount++;
				list.get(i).setModifiedBy(MySession.currentUser().getUsername());
				list.get(i).setModifiedOn(DateUtil.nowDate());
				dao.modify(list.get(i));
			}
		}
		map.put("result","当前导入操作，新增数据" + addCount + "条，修改数据" + modifyCount + "条");
		return map;
	}
	
	@Override
	public List<Em> getList(Em em) {
		return dao.getListByParam(em);
	}

	@Override
	public Em getById(String id) {
		return dao.getById(id);
	}

	@Override
	public Em getByParam(Em em) {
		return dao.getByParam(em);
	}
}
