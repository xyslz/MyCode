package com.caijai.repair.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.caijai.repair.entity.po.KeepingPlan;

public interface KeepingPlanMapper {

	/**
	 * 查询需要发送邮件的保养计划清单
	 * 
	 * @author WHD
	 * @date 2019年7月30日 下午2:20:53
	 * @param day 提前天数
	 */
	List<KeepingPlan> queryNeedSE(Map<String,Object> map);
}
