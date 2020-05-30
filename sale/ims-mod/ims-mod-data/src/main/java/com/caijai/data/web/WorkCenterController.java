package com.caijai.data.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.caijai.base.service.DMLServiceSupport;
import com.caijai.data.entity.WorkCenter;

/**
 * Title: WorkCenterController
 * <p>
 * Description: 工作中心
 * @author 杨雪景
 * @date 2019年4月
 */
@Controller
@RequestMapping("workCenter.do")
public class WorkCenterController {
	
	
	@Autowired
	private DMLServiceSupport<WorkCenter> workCenterDML;
	
	/**
	 * 新增/修改
	 * @author 杨雪景
	 * @since2019年4月
	 * @param workCenter
	 * @return
	 */
	@RequestMapping(params = "save")
	@ResponseBody
	public Map<String, Object> save(WorkCenter workCenter) {
		Map<String, Object> map = new HashMap<>();
		map.put("result", workCenterDML.save(workCenter));
		return map;
	}
	
	
	/**
	 * 分页查询
	 * @author 杨雪景
	 * @since2019年4月
	 * @param pageNumber
	 * @param pageSize
	 * @param workCenter
	 * @return
	 */
	@RequestMapping(params = "queryPage")
	@ResponseBody
	public Map<String, Object> queryPage(String pageNumber, String pageSize, WorkCenter workCenter) {
		return workCenterDML.queryPage(pageNumber, pageSize, workCenter);
	}
	
	
	

	/**
	 * 作废
	 * @author 杨雪景
	 * @since2019年4月
	 * @param workCenter
	 * @return
	 */
	@RequestMapping(params = "invalid")
	@ResponseBody
	public Map<String, Object> invalid(WorkCenter workCenter) {
		return workCenterDML.invalid(workCenter);
	}

}
