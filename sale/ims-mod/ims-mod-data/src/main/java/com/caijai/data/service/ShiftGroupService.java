package com.caijai.data.service;

import java.util.List;
import java.util.Map;

import com.caijai.base.util.PageInfo;
import com.caijai.data.entity.ShiftGroup;

public interface ShiftGroupService {
	
	PageInfo<Map<String, Object>> queryPage(PageInfo<Map<String, Object>> pageInfo, ShiftGroup shiftGroup);

	ShiftGroup save(ShiftGroup shift);

	/**
	 * 查询所有维修班组
	 * @return
	 */
	Map<String, Object> queryShiftGroupMain();

	/**
	 * 分页查询非维修班组
	 * @param pageInfo
	 * @param isMaintainTeam
	 * @return
	 */
	PageInfo<Map<String, Object>> qureyByGoupClass(PageInfo<Map<String, Object>> pageInfo, Integer isMaintainTeam,
			String name, String dept, String code);

	/**
	 * 查询所有的班组
	 * @return
	 */
	List<ShiftGroup> queryAllShift();

	/**
	 * 根据指定条件查找班组
	 * @param shiftGroup
	 * @return
	 */
	ShiftGroup chooseShiftGroup(ShiftGroup shiftGroup);
	
}
