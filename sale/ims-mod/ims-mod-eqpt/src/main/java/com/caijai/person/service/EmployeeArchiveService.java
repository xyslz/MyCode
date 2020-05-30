package com.caijai.person.service;

import java.util.Map;

import com.caijai.base.util.PageInfo;
import com.caijai.person.entity.EmployeeArchive;

public interface EmployeeArchiveService {

	/**
	 * 分页查询符合要求的维修班组中的人员
	 * 
	 * @param pageInfo
	 * @param person
	 * @return
	 */
	PageInfo<Map<String, Object>> queryPageByShift(PageInfo<Map<String, Object>> pageInfo,EmployeeArchive employeeArchive);

}