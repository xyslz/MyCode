package com.caijai.person.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.caijai.base.service.DMLServiceSupport;
import com.caijai.base.util.PageInfo;
import com.caijai.person.entity.EmployeeArchive;
import com.caijai.person.entity.Person;
import com.caijai.person.service.EmployeeArchiveService;
import com.caijai.person.service.PersonService;
import com.caijai.sysuser.entity.SysUser;
import com.caijai.sysuser.util.MySession;

@Controller
@RequestMapping("person.do")
public class PersonController {
	
	@Autowired
	private PersonService personService;
	
	@Autowired
	private DMLServiceSupport<EmployeeArchive> employeeArchiveDML;
	
	@Autowired
	private EmployeeArchiveService employeeArchiveService;

	/**
	 * 查询维修班组可选择的人员
	 * @param pageNumber
	 * @param pageSize
	 * @param person
	 * @return
	 */
	@RequestMapping(params = "queryPageByMain")
	@ResponseBody
	public Map<String, Object> queryPageByMain(String pageNumber, String pageSize, EmployeeArchive person) {
		person.setWorkingOrg(MySession.currentUser().getCorpPk());
		return employeeArchiveDML.queryPage(pageNumber, pageSize, person);
	}
	
	/**
	 * 根据班组，人员名称查询人员信息
	 * @param pageNumber
	 * @param pageSize
	 * @param person
	 * @return
	 */
	@RequestMapping(params = "queryPageByShift")
	@ResponseBody
	public Map<String, Object> queryPageByShift(String pageNumber, String pageSize, EmployeeArchive person) {
		Map<String, Object> map = new HashMap<String, Object>();
		PageInfo<Map<String,Object>> pageInfo = new PageInfo<Map<String,Object>>(pageNumber, pageSize);
		pageInfo = employeeArchiveService.queryPageByShift(pageInfo, person);
		map.put("total", pageInfo.getTotal());
		map.put("rows", pageInfo.getRows());
		return map;
	}
	
	@RequestMapping(params = "queryPage")
	@ResponseBody
	public Map<String, Object> queryPage(String pageNumber, String pageSize, Person person) {
		Map<String, Object> map = new HashMap<String, Object>();
		PageInfo<Person> pageInfo = new PageInfo<Person>(pageNumber, pageSize);
		pageInfo = personService.queryPage(pageInfo, person);
		map.put("total", pageInfo.getTotal());
		map.put("rows", pageInfo.getRows());
		return map;
	}
	
	/**
	 * 分页查询所有一级员工以及二级员工
	 * @param pageNumber
	 * @param pageSize
	 * @param person
	 * @return
	 */
	@RequestMapping(params = "queryPageList")
	@ResponseBody
	public Map<String, Object> queryPageList(String pageNumber, String pageSize, EmployeeArchive person) {
		SysUser sysUser = MySession.currentUser();
		person.setOwnerOrg(sysUser.getCorpPk());
		Map<String, Object> map = new HashMap<String, Object>();
		PageInfo<EmployeeArchive> pageInfo = new PageInfo<EmployeeArchive>(pageNumber, pageSize);
		pageInfo = personService.queryPageList(pageInfo, person);
		map.put("total", pageInfo.getTotal());
		map.put("rows", pageInfo.getRows());
		return map;
	}
	

	@RequestMapping(params = "save")
	@ResponseBody
	public Map<String, Object> save(@RequestBody Person person) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("result", personService.save(person));
		return map;
	}

	@RequestMapping(params = "invalid")
	@ResponseBody
	public Map<String, Object> invalid(String id) {
		Map<String, Object> map = new HashMap<String, Object>();
		Person person = new Person();
		person.setId(id);
		map.put("success", personService.invalid(person));
		return map;
	}

	@RequestMapping(params = "queryPageByEqpt")
	@ResponseBody
	public Map<String, Object> queryPageByEqpt(String pageNumber, String pageSize, String personName,
			String shiftGroup) {
		Map<String, Object> map = new HashMap<String, Object>();
		PageInfo<Map<String, Object>> pageInfo = new PageInfo<Map<String, Object>>(pageNumber, pageSize);
		pageInfo = personService.queryPageByEqpt(pageInfo, personName, shiftGroup);
		map.put("total", pageInfo.getTotal());
		map.put("rows", pageInfo.getRows());
		return map;
	}

	@RequestMapping(params = "queryPersonByShift")
	@ResponseBody
	public Map<String, Object> queryPersonByShift(String personName, String shiftGroup) {
		return personService.queryPersonByShift(personName, shiftGroup);
	}

}