package com.caijai.data.dao.impl; 

import org.springframework.stereotype.Repository;

import com.caijai.base.dao.support.MultiDao;
import com.caijai.data.entity.Department;

@Repository("departmentDao")
public class DepartmentDaoImpl extends MultiDao<Department> { 

}