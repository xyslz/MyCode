package com.caijai.data.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caijai.base.dao.BaseDao;
import com.caijai.base.util.PageInfo;
import com.caijai.data.entity.Department;
import com.caijai.data.entity.vo.DepartmentVO;
import com.caijai.data.mapper.DepartmentMapper;
import com.caijai.data.service.DepartmentService;
import com.caijai.sysuser.util.MySession;

/**
 * 部门
 * @author ChenYu
 *
 */
@Service("departmentService")
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private BaseDao<Department> departmentDao;
	
	@Autowired
	private BaseDao<DepartmentVO> deptVODao;
	
	@Autowired
	private DepartmentMapper departmentMapper;
	
	@Override
	public PageInfo<Department> queryPage(PageInfo<Department> pageInfo, Department department) {
		department.setDr(0);
		department.setIsEffective(1);
		department.setOrg(MySession.currentUser().getCorpPk());
		return departmentDao.queryPage(pageInfo, department);
	}

	@Override
	public List<DepartmentVO> queryAllDept() {
		DepartmentVO dept = new DepartmentVO();
		dept.setDr(0);
		dept.setIsEffective(1);
		dept.setOrg(MySession.currentUser().getCorpPk());
		return deptVODao.getListByParam(dept);
	}
	
	@Override
	public List<Department> queryDepByName() {
		return departmentMapper.queryDepByName(MySession.currentUser().getCorpPk());
	}

	/**  
	 * Title: queryList<p>  
	 * Description: <br>  
	 * @return  <br>
	 * @see com.caijai.data.service.DepartmentService#queryList()<br>
	 * @author 端鹏程  
	 * @date 2019年1月21日 
	 */
	@Override
	public List<Department> queryList(Department department) {
		return departmentDao.getListByParam(department);
	}

}
