package com.caijai.data.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.caijai.base.service.DMLServiceSupport;
import com.caijai.base.util.PageInfo;
import com.caijai.data.entity.ShiftGroup;
import com.caijai.data.service.ShiftGroupService;

@Controller
@RequestMapping("shiftGroup.do")
public class ShiftGroupController {

	@Autowired
	private DMLServiceSupport<ShiftGroup> shiftGroupDML;
	
	@Autowired
	private ShiftGroupService shiftGroupService;

	@RequestMapping(params = "queryPage")
	@ResponseBody
	public Map<String, Object> queryPage(String pageNumber, String pageSize, ShiftGroup shiftGroup) {
		return shiftGroupDML.queryPage(pageNumber, pageSize, shiftGroup);
	}

	@RequestMapping(params = "save")
	@ResponseBody
	public Map<String, Object> save(ShiftGroup shiftGroup) {
		Map<String, Object> map = new HashMap<>();
		map.put("result", shiftGroupDML.save(shiftGroup));
		return map;
	}

	@RequestMapping(params = "invalid")
	@ResponseBody
	public Map<String, Object> invalid(ShiftGroup shiftGroup) {
		return shiftGroupDML.invalid(shiftGroup);
	}
	
	/**
	 * 根据指定条件查找班组
	 * 
	 * @param code
	 * @return
	 */
	@RequestMapping(params = "chooseShiftGroup")
	@ResponseBody
	public Map<String, Object> chooseShiftGroup(ShiftGroup shiftGroup) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("result", shiftGroupService.chooseShiftGroup(shiftGroup));
		return map;
	}

	@RequestMapping(params = "queryShiftGroupMain")
	@ResponseBody
	public Map<String, Object> queryShiftGroupMain() {
		return shiftGroupService.queryShiftGroupMain();
	}
	
	/**
	 * 查询所有班组
	 * @return
	 */
	@RequestMapping(params = "queryAllShift")
	@ResponseBody
	public Map<String, Object> queryAllShift() {
		Map<String, Object> map = new HashMap<String,Object>();
		List<ShiftGroup> shift = shiftGroupService.queryAllShift();
		map.put("list", shift);
		return map;
	}
	

	/**
	 * 根据班组分类查询
	 * @param pageNumber
	 * @param pageSize
	 * @param isMaintainTeam
	 * @param name
	 * @param dept
	 * @param code
	 * @return
	 */
	@RequestMapping(params = "qureyByGoupClass")
	@ResponseBody
	public Map<String, Object> qureyByGoupClass(String pageNumber, String pageSize, Integer isMaintainTeam, String name,
			String dept, String code) {
		Map<String, Object> map = new HashMap<String, Object>();
		PageInfo<Map<String, Object>> pageInfo = new PageInfo<Map<String, Object>>(pageNumber, pageSize);
		pageInfo = shiftGroupService.qureyByGoupClass(pageInfo, isMaintainTeam, name, dept, code);
		map.put("total", pageInfo.getTotal());
		map.put("rows", pageInfo.getRows());
		return map;
	}


}
