package com.caijai.data.dao;

import java.util.Map;

import com.caijai.base.util.PageInfo;
import com.caijai.data.entity.ShiftGroup;

public interface ShiftGroupDao {

	PageInfo<Map<String, Object>> queryShiftGroup(PageInfo<Map<String, Object>> pageInfo, ShiftGroup shiftGroup);
}
