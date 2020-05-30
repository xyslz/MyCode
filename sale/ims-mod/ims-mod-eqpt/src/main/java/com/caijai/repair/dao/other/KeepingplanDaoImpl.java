package com.caijai.repair.dao.other; 

import org.springframework.stereotype.Repository;

import com.caijai.repair.entity.po.KeepingPlan;
import com.caijai.base.dao.support.MultiDao; 

/**
 * 保养计划
 * @author ChenYu
 *
 */
@Repository("keepingplanDao") 
public class KeepingplanDaoImpl extends MultiDao<KeepingPlan> { 

}