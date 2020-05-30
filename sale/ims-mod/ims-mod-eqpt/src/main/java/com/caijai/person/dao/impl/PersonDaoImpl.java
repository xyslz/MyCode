package com.caijai.person.dao.impl; 

import org.springframework.stereotype.Repository;

import com.caijai.base.dao.support.SimpleDao;
import com.caijai.person.entity.Person; 

@Repository("personDao") 
public class PersonDaoImpl extends SimpleDao<Person> { 

}