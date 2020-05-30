package com.caijai.dock.web;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.caijai.base.service.DMLServiceSupport;

import com.caijai.dock.entity.WaitTasks;
import com.caijai.dock.service.WaitTasksService;

/**
 * 等待执行的任务
 * @author WHD
 *
 */
@Controller
@RequestMapping("waitTasks.do")
public class WaitTasksController {

	@Autowired
	private DMLServiceSupport<WaitTasks> syncTasksDML;
	
	@Autowired
	private WaitTasksService waitTaskService;
	
	/**
	 * 执行任务
	 * 
	 * @param id
	 * @return
	 * @throws IOException 
	 */
	@RequestMapping(params = "run")
	@ResponseBody
	public Map<String, Object> run(String id){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("result", waitTaskService.taskRun(id));
		return map;
	}
	
	/**
	 * 暂停定时任务
	 * @param id
	 * @return
	 */
	@RequestMapping(params = "stop")
	@ResponseBody
	public Map<String, Object> stop(String id) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("result", waitTaskService.taskStop(id));
		return map;
	}
	
	/**
	 * 暂停定时任务
	 * @param id
	 * @return
	 */
	@RequestMapping(params = "continu")
	@ResponseBody
	public Map<String, Object> continu(String id) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("result", waitTaskService.taskContinu(id));
		return map;
	}

	/**
	 * 分页查询
	 * 
	 * @param pageNumber
	 * @param pageSize
	 * @param synchronizeTasks
	 * @return
	 */
	@RequestMapping(params = "queryPage")
	@ResponseBody
	public Map<String, Object> queryPage(String pageNumber, String pageSize, WaitTasks waitTasks) {
		return syncTasksDML.queryPage(pageNumber, pageSize, waitTasks);
	}

	/**
	 * 保存（新增/修改）
	 * 
	 * @param synchronizeTasks
	 * @return
	 */
	@RequestMapping(params = "save")
	@ResponseBody
	public Map<String, Object> save(WaitTasks waitTasks) {
		Map<String, Object> map = new HashMap<>();
		map.put("result", syncTasksDML.save(waitTasks));
		return map;
	}

	/**
	 * 作废
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(params = "invalid")
	@ResponseBody
	public Map<String, Object> invalid(WaitTasks waitTasks) {
		return syncTasksDML.invalid(waitTasks);
	}
}