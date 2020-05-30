package com.caijai.dock.service;

import java.util.List;

import com.caijai.dock.entity.WaitTasks;

public interface WaitTasksService {

	/**
	 * 查询准备执行的任务
	 * @return
	 */
	public List<WaitTasks> queryReady(String org);
	
	/**
	 * 定时任务启动
	 * @param id
	 */
	void timerRun(String id);

	/**
	 * 任务启动
	 * @param id
	 * @return
	 */
	WaitTasks taskRun(String id);
	
	/**
	 * 任务暂停
	 * @param id
	 * @return
	 */
	WaitTasks taskStop(String id);
	
	/**
	 * 任务继续
	 * @param id
	 * @return
	 */
	WaitTasks taskContinu(String id);
	
	
}
