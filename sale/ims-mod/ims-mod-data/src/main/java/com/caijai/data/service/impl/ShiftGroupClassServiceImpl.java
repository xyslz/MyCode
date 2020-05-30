package com.caijai.data.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.caijai.base.dao.BaseDao;
import com.caijai.base.util.DateUtil;
import com.caijai.base.util.PageInfo;
import com.caijai.data.entity.ShiftGroupClass;
import com.caijai.data.mapper.ShiftGroupClassMapper;
import com.caijai.data.service.ShiftGroupClassService;
import com.caijai.sysuser.entity.SysUser;
import com.caijai.sysuser.util.MySession;

@Service
public class ShiftGroupClassServiceImpl implements ShiftGroupClassService {

	@Autowired
	private BaseDao<ShiftGroupClass> shiftGroupClassDao;
	
	@Autowired
	private ShiftGroupClassMapper shiftGroupClassMapper;
	
	@Override
	public PageInfo<ShiftGroupClass> queryPage(PageInfo<ShiftGroupClass> pageInfo, ShiftGroupClass shiftGroupClass) {
		return shiftGroupClassDao.queryPage(pageInfo, shiftGroupClass);
	}

	@Override
	@Transactional
	public ShiftGroupClass save(ShiftGroupClass shift) {
		SysUser sysUser=MySession.currentUser();
		ShiftGroupClass shiftClass = shiftGroupClassDao.getById(shift.getId());
		if(shiftClass == null) {
			shift.setOrg(sysUser.getCorpPk());
			shift.setCreatedBy(sysUser.getUsername());
			shift.setCreatedOn(DateUtil.nowDate());
			return shiftGroupClassDao.add(shift);
		}else {
			if(shiftClass.getDr()==1) {
				shift.setCreatedBy(sysUser.getUsername());
				shift.setCreatedOn(DateUtil.nowDate());
				shift.setDr(0);
				shift.setTs(shiftClass.getTs());
			}else {
				shift.setModifiedBy(sysUser.getUsername());
				shift.setModifiedOn(DateUtil.nowDate());
			}
			return shiftGroupClassDao.modify(shift);
		}
	}

	@Override
	@Transactional
	public Integer invalid(ShiftGroupClass shift) {
		return shiftGroupClassDao.delete(shift);
	}

	@Override
	public Map<String, Object> checkByID(String id) {
		Map<String,Object> map = new HashMap<String,Object>();
		ShiftGroupClass group = new ShiftGroupClass();
		group.setId(id);
		group.setDr(0);
		ShiftGroupClass shift = shiftGroupClassDao.getByParam(group);
		if(shift!=null) {
			map.put("success", true);
		}else {
			map.put("success", false);
		}
		return map;
	}

	@Override
	public Map<String, Object> queryParentClass() {
		Map<String,Object> map = new HashMap<String,Object>();
		SysUser sysUser=MySession.currentUser();
		map.put("list", shiftGroupClassMapper.queryParentClass(sysUser.getCorpPk()));
		return map;
	}
	
}
