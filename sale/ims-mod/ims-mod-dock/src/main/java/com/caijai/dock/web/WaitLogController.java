package com.caijai.dock.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.caijai.base.service.DMLServiceSupport;

import com.caijai.dock.entity.WaitLog;

/**
 * 执行的任务记录
 * @author WHD
 *
 */
@Controller
@RequestMapping("waitLog.do")
public class WaitLogController {
	
	@Autowired
	private DMLServiceSupport<WaitLog> waitLogDML;

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
	public Map<String, Object> queryPage(String pageNumber, String pageSize, WaitLog waitLog) {
		return waitLogDML.queryPage(pageNumber, pageSize, waitLog);
	}

	/**
	 * 保存（新增/修改）
	 * 
	 * @param synchronizeTasks
	 * @return
	 */
	@RequestMapping(params = "save")
	@ResponseBody
	public Map<String, Object> save(WaitLog waitLog) {
		Map<String, Object> map = new HashMap<>();
		map.put("result", waitLogDML.save(waitLog));
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
	public Map<String, Object> invalid(WaitLog waitLog) {
		return waitLogDML.invalid(waitLog);
	}
}