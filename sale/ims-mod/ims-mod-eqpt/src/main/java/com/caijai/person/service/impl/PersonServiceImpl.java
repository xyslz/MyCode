package com.caijai.person.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caijai.base.dao.BaseDao;
import com.caijai.base.util.DateUtil;
import com.caijai.base.util.PageInfo;
import com.caijai.base.util.StringUtil;
import com.caijai.person.entity.EmployeeArchive;
import com.caijai.person.entity.Person;
import com.caijai.person.mapper.PersonMapper;
import com.caijai.person.service.PersonService;
import com.caijai.sysuser.util.MySession;

@Service("personService")
public class PersonServiceImpl implements PersonService {
	
	@Autowired
	private BaseDao<Person> personDao;
	
	@Autowired
	private PersonMapper personMapper;

	@Override
	public PageInfo<Person> queryPage(PageInfo<Person> pageInfo, Person person) {
		person.setAttachorg(MySession.currentUser().getCorpPk());
		return personDao.queryPage(pageInfo, person);
	}

	@Override
	public Person save(Person person) {
		if (StringUtil.IsNullOrEmpty(person.getId())) {
			person.setId(UUID.randomUUID().toString());
			person.setCreateorg(MySession.currentUser().getCorpPk());
			person.setAttachorg(MySession.currentUser().getCorpPk());
			return personDao.add(person);
		}

		return personDao.modify(person);
	}

	@Override
	public boolean invalid(Person person) {
		return personDao.invalidByPk(person);
	}
	
	@Override
	public PageInfo<Map<String,Object>> queryPageByEqpt(PageInfo<Map<String,Object>> pageInfo, String personName,String shiftGroup) {
		Map<String, Object> mapInfo = new HashMap<String, Object>();
		int count = personMapper.getCountByEqpt(personName,shiftGroup);
		// 如果没有查到相关信息条数，则直接返回
		if (count == 0) {
			return pageInfo;
		}
		pageInfo.setTotal(count);
		mapInfo.put("endPos", pageInfo.getEndPos());
		mapInfo.put("startPos", pageInfo.getStartPos());
		List<Map<String, Object>> list = personMapper.queryPageByEqpt(mapInfo,personName,shiftGroup);
		pageInfo.setRows(list);
		return pageInfo;
	}
	
	@Override
	public Map<String,Object> queryPersonByShift(String personName,String shiftGroup){
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("list", personMapper.queryPersonByShift(personName, shiftGroup,DateUtil.nowDate()));
		return map;
	}

	@Override
	public PageInfo<EmployeeArchive> queryPageList(PageInfo<EmployeeArchive> pageInfo, EmployeeArchive employeeArchive) {
		Map<String, Object> mapInfo = new HashMap<String, Object>();
		int count = personMapper.getPersonCount(employeeArchive.getOwnerOrg(), employeeArchive.getName());
		// 如果没有查到相关信息条数，则直接返回
		if (count == 0) {
			return pageInfo;
		}
		pageInfo.setTotal(count);
		mapInfo.put("endPos", pageInfo.getEndPos());
		mapInfo.put("startPos", pageInfo.getStartPos());
		List<EmployeeArchive> list = personMapper.queryPagePerson(mapInfo, employeeArchive.getOwnerOrg(), employeeArchive.getName());
		pageInfo.setRows(list);
		return pageInfo;
	}

}