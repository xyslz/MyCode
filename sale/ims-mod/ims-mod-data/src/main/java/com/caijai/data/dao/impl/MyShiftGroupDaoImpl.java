package com.caijai.data.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.caijai.base.sysenum.U9STATE;
import com.caijai.base.util.PageInfo;
import com.caijai.data.dao.ShiftGroupDao;
import com.caijai.data.entity.ShiftGroup;
import com.caijai.data.mapper.ShiftGroupMapper;
import com.caijai.sysuser.entity.SysUser;
import com.caijai.sysuser.util.MySession;

@Repository("myShiftGroupDao")
public class MyShiftGroupDaoImpl implements ShiftGroupDao{
	
	@Autowired
	private ShiftGroupMapper shiftGroupMapper;

	@Override
	public PageInfo<Map<String, Object>> queryShiftGroup(PageInfo<Map<String, Object>> pageInfo, ShiftGroup shiftGroup) {
		SysUser sysUser = MySession.currentUser();
		//Map<String, Object> map = new HashMap<String, Object>();
		Map<String, Object> mapInfo = new HashMap<String, Object>();
		int count = 0;
		if(shiftGroup.getIsEffective() != null) {
			count = shiftGroupMapper.getShiftGroupClassCount(shiftGroup.getShiftGroupClass(), shiftGroup.getCode(),
					shiftGroup.getName(), sysUser.getCorpPk(),String.valueOf(shiftGroup.getIsEffective().getIndex()));
		}else {
			count = shiftGroupMapper.getShiftGroupClassCount(shiftGroup.getShiftGroupClass(), shiftGroup.getCode(),
					shiftGroup.getName(), sysUser.getCorpPk(),null);
		}
		// 如果没有查到相关信息条数，则直接返回
		if (count == 0) {
			return pageInfo;
		}
		pageInfo.setTotal(count);
		mapInfo.put("endPos", pageInfo.getEndPos());
		mapInfo.put("startPos", pageInfo.getStartPos());
		//map.put("pageInfo", pageInfo);
		if(shiftGroup.getIsEffective() != null) {
			pageInfo.setRows(shiftGroupMapper.queryShiftGroup(mapInfo, shiftGroup.getShiftGroupClass(),
					shiftGroup.getCode(), shiftGroup.getName(), sysUser.getCorpPk(),String.valueOf(shiftGroup.getIsEffective().getIndex())));
		}else {
			pageInfo.setRows(shiftGroupMapper.queryShiftGroup(mapInfo, shiftGroup.getShiftGroupClass(),
					shiftGroup.getCode(), shiftGroup.getName(), sysUser.getCorpPk(),null));
		}
		List<Map<String, Object>> sglist = pageInfo.getRows();
		for (Map<String, Object> sg : sglist) {
			if((int)sg.get("isEffective") == 1) {
				sg.put("isEffective", U9STATE.valid);
			}else if((int)sg.get("isEffective") == 0) {
				sg.put("isEffective", U9STATE.invalid);
			}
		}
		pageInfo.setRows(sglist);
		return pageInfo;
	}

}
