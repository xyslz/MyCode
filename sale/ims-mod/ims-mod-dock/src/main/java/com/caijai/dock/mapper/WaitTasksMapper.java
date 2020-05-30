package com.caijai.dock.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.caijai.dock.entity.WaitTasks;

/**
 * 定时处理待执行接口
 * @author WHD
 *
 */
public interface WaitTasksMapper {

	/**
	 * 查询将要执行的定时任务
	 * 
	 * @param nowDate
	 * @return
	 */
	List<WaitTasks> queryReady(String org);
	
	/**
	 * 重写查询方法  为了满足按时间段查询
	 * @param pageNumber
	 * @param pageSize
	 * @param task
	 * @return
	 */
	List<WaitTasks> queryPage(@Param("pageNumber")Integer pageNumber,@Param("pageSize")Integer pageSize
						,@Param("task")WaitTasks task
						,@Param("isOffline")Integer isOffline);
	
	/**
	 * 查询此条件下的任务清单条数
	 * @param task
	 * @return
	 */
	int count(@Param("task")WaitTasks task,@Param("isOffline")Integer isOffline);

}