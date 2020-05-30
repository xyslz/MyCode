package com.caijai.data.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.caijai.base.sysenum.SYSSET;
import com.caijai.base.util.PageInfo;
import com.caijai.data.entity.ShiftGroupClass;
import com.caijai.data.service.ShiftGroupClassService;

@Controller
@RequestMapping("shiftGroupClass.do")
public class ShiftGroupClassController {
	
	@Autowired
	private ShiftGroupClassService shiftGroupClassService;
	
	/**
	 * 分页查询班组分类信息
	 * @param pageNumber
	 * @param pageSize
	 * @param shiftGroup
	 * @return
	 */
	@RequestMapping(params = "queryPage")
	@ResponseBody
	public Map<String, Object> queryPage(String pageNumber, String pageSize, ShiftGroupClass shiftGroup) {
		Map<String, Object> map = new HashMap<String, Object>();
		PageInfo<ShiftGroupClass> pageInfo = new PageInfo<ShiftGroupClass>(pageNumber, pageSize);
		pageInfo = shiftGroupClassService.queryPage(pageInfo, shiftGroup);
		map.put("total", pageInfo.getTotal());
		map.put("rows", pageInfo.getRows());
		return map;
	}
	
	/**
	 * 保存班组信息
	 * @param shift
	 * @return
	 */
	@RequestMapping(params = "save")
	@ResponseBody
	public Map<String, Object> save(ShiftGroupClass shift) {
		Map<String, Object> map = new HashMap<String, Object>();
		if(shift.getIsMaintainTeam() == null) {
			shift.setIsMaintainTeam(0);
		}
		if(shift.getIsstate() == null) {
			shift.setIsstate(SYSSET.N);
		}
		map.put("result", shiftGroupClassService.save(shift));
		return map;
	}

	/**
	 * 作废班组信息
	 * @param id
	 * @return
	 */
	@RequestMapping(params = "invalid")
	@ResponseBody
	public Map<String, Object> invalid(String id) {
		Map<String, Object> map = new HashMap<String, Object>();
		ShiftGroupClass shift = new ShiftGroupClass();
		shift.setId(id);
		map.put("success", shiftGroupClassService.invalid(shift));
		return map;
	}
	
	/**
	 * 检查班组分类信息中是否有重复的编码
	 */
	@RequestMapping(params = "checkByID")
	@ResponseBody
	public Map<String, Object> checkByID(String id) {
		return shiftGroupClassService.checkByID(id);
	}
	
	/**
	 * 查询该组织中为父类的数据
	 */
	@RequestMapping(params = "queryParentClass")
	@ResponseBody
	public Map<String, Object> queryParentClass() {
		return shiftGroupClassService.queryParentClass();
	}
	
}
