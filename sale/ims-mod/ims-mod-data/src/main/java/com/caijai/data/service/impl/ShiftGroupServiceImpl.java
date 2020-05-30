package com.caijai.data.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.caijai.base.dao.BaseDao;
import com.caijai.base.service.DMLServiceSupport;
import com.caijai.base.sysenum.U9STATE;
import com.caijai.base.util.DateUtil;
import com.caijai.base.util.PageInfo;
import com.caijai.base.util.StringUtil;
import com.caijai.data.dao.impl.MyShiftGroupDaoImpl;
import com.caijai.data.entity.ShiftGroup;
import com.caijai.data.mapper.ShiftGroupMapper;
import com.caijai.data.service.ShiftGroupService;
import com.caijai.sysuser.entity.SysUser;
import com.caijai.sysuser.util.MySession;

@Service
public class ShiftGroupServiceImpl extends DMLServiceSupport<ShiftGroup> implements ShiftGroupService {

	@Autowired
	private BaseDao<ShiftGroup> shiftGroupDao;

	@Autowired
	private ShiftGroupMapper shiftGroupMapper;

	@Autowired
	private MyShiftGroupDaoImpl myShiftGroupDao;

	@Override
	public PageInfo<Map<String, Object>> queryPage(PageInfo<Map<String, Object>> pageInfo, ShiftGroup shiftGroup) {
		return myShiftGroupDao.queryShiftGroup(pageInfo, shiftGroup);
	}

	/**
	 * 校验编码唯一
	 */
	@Override
	public ShiftGroup add(ShiftGroup shiftGroup) {
		ShiftGroup s = new ShiftGroup();
		s.setId(shiftGroup.getId());
		s.setCode(shiftGroup.getCode());
		shiftGroupDao.checkDoubleNoPk(s);
		return super.add(shiftGroup);
	}

	@Override
	@Transactional
	public ShiftGroup save(ShiftGroup shift) {
		SysUser sysUser = MySession.currentUser();
		if (StringUtil.IsNullOrEmpty(shift.getId())) {
			shift.setId(StringUtil.uuid());
			shift.setCreatedBy(sysUser.getUsername());
			shift.setCreatedOn(DateUtil.nowDate());
			shift.setOrg(sysUser.getCorpPk());
			ShiftGroup gp = new ShiftGroup();
			gp.setCode(shift.getCode());
			shiftGroupDao.checkDouble(gp);
			return shiftGroupDao.add(shift);
		} else {
			shift.setModifiedBy(sysUser.getUsername());
			shift.setModifiedOn(DateUtil.nowDate());
			return shiftGroupDao.modify(shift);
		}
	}

	@Override
	public ShiftGroup chooseShiftGroup(ShiftGroup shiftGroup) {
		//return shiftGroupDao.getByParam(shiftGroup);
		return shiftGroupMapper.getGroup(shiftGroup.getCode(), MySession.currentUser().getCorpPk());
	}

	@Override
	public Map<String, Object> queryShiftGroupMain() {
		SysUser sysUser = MySession.currentUser();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("list", shiftGroupMapper.queryShiftGroupMain(sysUser.getCorpPk()));
		return map;
	}

	@Override
	public PageInfo<Map<String, Object>> qureyByGoupClass(PageInfo<Map<String, Object>> pageInfo,
			Integer isMaintainTeam, String name, String dept, String code) {
		SysUser sysUser = MySession.currentUser();
		Map<String, Object> mapInfo = new HashMap<String, Object>();
		int count = shiftGroupMapper.getByGoupClassCount(isMaintainTeam, sysUser.getCorpPk(), name, dept, code);
		// 如果没有查到相关信息条数，则直接返回
		if (count == 0) {
			return pageInfo;
		}
		pageInfo.setTotal(count);
		mapInfo.put("endPos", pageInfo.getEndPos());
		mapInfo.put("startPos", pageInfo.getStartPos());
		List<Map<String, Object>> list = shiftGroupMapper.qureyByGoupClass(mapInfo, isMaintainTeam, sysUser.getCorpPk(),
				name, dept, code);
		pageInfo.setRows(list);
		return pageInfo;

	}

	@Override
	public List<ShiftGroup> queryAllShift() {
		ShiftGroup shiftGroup = new ShiftGroup();
		shiftGroup.setOrg(MySession.currentUser().getCorpPk());
		shiftGroup.setDr(0);
		shiftGroup.setIsEffective(U9STATE.valid);
		return shiftGroupDao.getListByParam(shiftGroup);
	}

}
