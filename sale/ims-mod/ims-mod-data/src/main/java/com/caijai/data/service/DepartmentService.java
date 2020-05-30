package com.caijai.data.service;

import java.util.List;

import com.caijai.base.util.PageInfo;
import com.caijai.data.entity.Department;
import com.caijai.data.entity.vo.DepartmentVO;

public interface DepartmentService {
	
	/**
	 * 查询所有部门
	 * @return
	 */
	List<DepartmentVO> queryAllDept();

	/**
	 * 分页查询所有部门
	 * @param pageInfo
	 * @param department
	 * @return
	 */
	PageInfo<Department> queryPage(PageInfo<Department> pageInfo, Department department);

	/**
	 * 查询名字带‘车间’的部门
	 * @return
	 */
	List<Department> queryDepByName();

	/**  
	 * Title: queryList<p>  
	 * Description:
	 * @author 端鹏程  
	 * @param department 
	 * @date 2019年1月21日 
	 */
	List<Department> queryList(Department department);
}
