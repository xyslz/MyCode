package com.caijai.repair.api;

public interface TimingSEApi {

	/**
	 * 点检邮件提醒
	 * 
	 * @author WHD
	 * @date 2019年7月29日 下午2:23:07
	 */
	public void spotCheckSE();
	
	/**
	 * 保养计划邮件提醒
	 * 
	 * @author WHD
	 * @date 2019年7月29日 下午2:23:21
	 */
	public void keepingPlan(String org);
	
}