package com.caijai.data.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.caijai.base.service.DMLServiceSupport;
import com.caijai.base.util.PageInfo;
import com.caijai.data.entity.ShiftGroupWorkTime;
import com.caijai.data.service.ShiftGroupWorkTimeService;

/**
 * Title: ShiftGroupWorkTimeController
 * <p>
 * Description: 班组工作时间
 * @author 杨雪景
 * @date 2019年5月5日
 */
@Controller
@RequestMapping("shiftGroupWorkTime.do")
public class ShiftGroupWorkTimeController {
	
	@Autowired
	private ShiftGroupWorkTimeService service;
	
	@Autowired
	private DMLServiceSupport<ShiftGroupWorkTime> shiftGroupWorkTimeDML;
	
	/**
	 * 新增/修改
	 * @author 杨雪景
	 * @since2019年5月5日
	 * @param shiftGroupWorkTime
	 * @return
	 */
	@RequestMapping(params = "save")
	@ResponseBody
	public Map<String, Object> save(ShiftGroupWorkTime shiftGroupWorkTime) {
		Map<String, Object> map = new HashMap<>();
		map.put("result", shiftGroupWorkTimeDML.save(shiftGroupWorkTime));
		return map;
	}
	
	
	/**
	 * 分页查询
	 * @author 杨雪景
	 * @since2019年5月5日
	 * @param pageNumber
	 * @param pageSize
	 * @param shiftGroupWorkTime
	 * @return
	 */
	@RequestMapping(params = "queryPage")
	@ResponseBody
	public Map<String, Object> queryPage(String pageNumber, String pageSize, ShiftGroupWorkTime shiftGroupWorkTime) {
		Map<String, Object> map = new HashMap<String, Object>();
		PageInfo<ShiftGroupWorkTime> pageInfo = new PageInfo<ShiftGroupWorkTime>(pageNumber, pageSize);
		pageInfo = service.queryPage(pageInfo,shiftGroupWorkTime);
		map.put("total", pageInfo.getTotal());
		map.put("rows", pageInfo.getRows());
		return map;
	}
	
	
	

	/**
	 * 作废
	 * @author 杨雪景
	 * @since2019年5月5日
	 * @param shiftGroupWorkTime
	 * @return
	 */
	@RequestMapping(params = "invalid")
	@ResponseBody
	public Map<String, Object> invalid(ShiftGroupWorkTime shiftGroupWorkTime) {
		return shiftGroupWorkTimeDML.invalid(shiftGroupWorkTime);
	}

}
