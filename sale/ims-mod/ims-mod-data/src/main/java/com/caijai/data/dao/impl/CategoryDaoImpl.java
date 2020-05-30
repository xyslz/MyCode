package com.caijai.data.dao.impl; 

import org.springframework.stereotype.Repository;

import com.caijai.base.dao.support.SimpleDao;
import com.caijai.data.entity.Category; 

@Repository("categoryDao") 
public class CategoryDaoImpl extends SimpleDao<Category> { 

}