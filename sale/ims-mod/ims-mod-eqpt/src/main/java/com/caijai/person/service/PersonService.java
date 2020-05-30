package com.caijai.person.service;

import java.util.Map;

import com.caijai.base.util.PageInfo;
import com.caijai.person.entity.EmployeeArchive;
import com.caijai.person.entity.Person;

public interface PersonService {
	PageInfo<Person> queryPage(PageInfo<Person> pageInfo, Person person);

	Person save(Person person);

	boolean invalid(Person person);

	/**
	 * 分页查询符合要求的维修班组中的人员
	 * 
	 * @param pageInfo
	 * @param person
	 * @return
	 */
	PageInfo<Map<String, Object>> queryPageByEqpt(PageInfo<Map<String, Object>> pageInfo, String personName,
			String shiftGroup);

	/**
	 * 查询符合要求的指定班组中的人员
	 * 
	 * @param personName
	 * @param shiftGroup
	 * @return
	 */
	Map<String, Object> queryPersonByShift(String personName, String shiftGroup);

	/**
	 * 分页查询所有一级员工二级员工
	 * @param pageInfo
	 * @param ownerOrg
	 * @param name
	 * @return
	 */
	PageInfo<EmployeeArchive> queryPageList(PageInfo<EmployeeArchive> pageInfo, EmployeeArchive employeeArchive);

}