package com.caijai.data.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caijai.base.dao.BaseDao;
import com.caijai.base.service.DMLServiceSupport;
import com.caijai.base.util.DateUtil;
import com.caijai.base.util.PageInfo;
import com.caijai.base.util.StringUtil;
import com.caijai.data.entity.Operators;
import com.caijai.data.entity.ShiftGroupWorkTime;
import com.caijai.data.mapper.ShiftGroupWorkTimeMapper;
import com.caijai.data.service.ShiftGroupWorkTimeService;
import com.caijai.sysuser.util.MySession;

/**
 * Title: ShiftGroupWorkTimeServiceDML
 * <p>
 * Description:班组工作时间 <br>
 * 
 * @author 杨雪景
 * @date 2019年5月5日
 */
@Service
public class ShiftGroupWorkTimeServiceImpl extends DMLServiceSupport<ShiftGroupWorkTime>
		implements ShiftGroupWorkTimeService {

	@Autowired
	private ShiftGroupWorkTimeMapper mapper;

	@Autowired
	private BaseDao<Operators> opDao;

	/**
	 * Title: queryPage
	 * 
	 * @author 杨雪景
	 * @date 2019年5月5日
	 * @param pageInfo
	 * @param shiftGroupWorkTime
	 */
	@Override
	public PageInfo<ShiftGroupWorkTime> queryPage(PageInfo<ShiftGroupWorkTime> pageInfo,
			ShiftGroupWorkTime shiftGroupWorkTime) {
		// TODO Auto-generated method stub
		Map<String, Object> map = new HashMap<>();
		map.put("code", shiftGroupWorkTime.getCode());
		map.put("name", shiftGroupWorkTime.getName());
		map.put("departmentName", shiftGroupWorkTime.getDepartmentName());// 部门名称
		map.put("department", shiftGroupWorkTime.getDepartment());// 部门id
		map.put("employeeName", shiftGroupWorkTime.getEmployeeName()); // 班组人员名称
		map.put("employee", shiftGroupWorkTime.getEmployee()); // 班组人员id
		map.put("employeeCode", shiftGroupWorkTime.getEmployeeCode()); // 班组人员编码
		map.put("shiftGroupCode", shiftGroupWorkTime.getShiftGroupCode()); // 班组编码
		map.put("shiftGroupName", shiftGroupWorkTime.getShiftGroupName()); // 班组名称
		map.put("shiftGroup", shiftGroupWorkTime.getShiftGroup()); // 班组id
		map.put("shiftGroupClassName", shiftGroupWorkTime.getShiftGroupClassName());// 班组分类名称
		map.put("shiftGroupClass", shiftGroupWorkTime.getShiftGroupClass());// 班组分类id
		map.put("endTime", shiftGroupWorkTime.getEndTime());// 结束时间
		map.put("startTime", shiftGroupWorkTime.getStartTime());// 开始时间
		map.put("createdBy", shiftGroupWorkTime.getCreatedBy());
		map.put("createdOn", shiftGroupWorkTime.getCreatedOn());
		map.put("modifiedBy", shiftGroupWorkTime.getModifiedBy());
		map.put("modifiedOn", shiftGroupWorkTime.getModifiedOn());
		map.put("ts", shiftGroupWorkTime.getTs());
		map.put("org", MySession.currentUser().getCorpPk());
		Integer total = mapper.getTotalCount(map);
		if (total == 0) {
			return pageInfo;
		}
		pageInfo.setTotal(total);
		map.put("pageInfo", pageInfo);
		List<ShiftGroupWorkTime> list = mapper.queryPage(map);
		list.forEach(t ->{
			// 拆分员工编码
			String strEmployee[] = t.getEmployee().split(",");
			StringBuilder code = new StringBuilder();
			StringBuilder name = new StringBuilder();
			for (int i = 0; i < strEmployee.length; i++) {
				if(StringUtil.IsNullOrEmpty(strEmployee[i])){
					continue;
				}
				Operators operator = opDao.getById(strEmployee[i]);
				code.append(operator.getCode() + ",");
				name.append(operator.getName() + ",");
			}
			t.setEmployeeCode(code + "");
			t.setEmployeeName(name + "");
		});
		pageInfo.setRows(list);
		return pageInfo;
	}

	@Override
	public ShiftGroupWorkTime save(ShiftGroupWorkTime t) {
		t = super.save(t);
		// 拆分员工编码
		String strEmployee[] = t.getEmployee().split(",");
		StringBuilder code = new StringBuilder();
		StringBuilder name = new StringBuilder();
		for (int i = 0; i < strEmployee.length; i++) {
			if(StringUtil.IsNullOrEmpty(strEmployee[i])){
				continue;
			}
			Operators operator = opDao.getById(strEmployee[i]);
			code.append(operator.getCode() + ",");
			name.append(operator.getName() + ",");
		}
		t.setEmployeeCode(code + "");
		t.setEmployeeName(name + "");
		return t;
	}

}
