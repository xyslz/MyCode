package com.caijai.eqpt.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.caijai.eqpt.entity.EmParam;
import com.caijai.eqpt.entity.EmParamDetail;
import com.caijai.eqpt.service.EmParamDetailService;
import com.caijai.eqpt.service.EmParamService;
import com.caijai.base.util.PageInfo;

/**
 * 设备参数
 * @author ChenYu
 *
 */
@Controller
@RequestMapping("emparam.do")
public class EmParamController {
	
	@Autowired
	private EmParamService equipmentParameterService;
	
	@Autowired
	private EmParamDetailService equipmentParameterDetailService;
	
	/**
	 * 分页查询
	 * @param pageNumber
	 * @param pageSize
	 * @param equipmentParameter
	 * @return
	 */
	@RequestMapping(params="queryPage")
	@ResponseBody
	public Map<String, Object> queryPage(String pageNumber,String pageSize,EmParam equipmentParameter){
		Map<String, Object> map = new HashMap<String,Object>();
		PageInfo<EmParam> pageInfo = new PageInfo<EmParam>(pageNumber, pageSize);
		PageInfo<EmParam> equipmentParameterInfo = equipmentParameterService.queryPage(pageInfo,equipmentParameter);
		map.put("total", equipmentParameterInfo.getTotal());
		map.put("rows", equipmentParameterInfo.getRows());
		return map;
	}
	
	/**
	 * 分页查询(明细)
	 * @param pageNumber
	 * @param pageSize
	 * @param equiTempNo
	 * @return
	 */
	@RequestMapping(params="queryPageDetail")
	@ResponseBody
	public Map<String, Object> queryPageDetail(String pageNumber,String pageSize,String equiTempNo){
		Map<String, Object> map = new HashMap<String,Object>();
		PageInfo<EmParamDetail> pageInfo = new PageInfo<EmParamDetail>(pageNumber, pageSize);
		EmParamDetail equipmentParameterDetail = new EmParamDetail();
		equipmentParameterDetail.setDr(0);
		equipmentParameterDetail.setTempID(equiTempNo);
		PageInfo<EmParamDetail> equipmentParameterInfo = equipmentParameterDetailService.queryPage(pageInfo,equipmentParameterDetail);
		map.put("total", equipmentParameterInfo.getTotal());
		map.put("rows", equipmentParameterInfo.getRows());
		return map;
	}
	
	/**
	 * 作废
	 * @param id
	 * @return
	 */
	@RequestMapping(params="invalid")
	@ResponseBody
	public Map<String, Object> invalid(String id){
		Map<String, Object> map = new HashMap<String,Object>();
		EmParam equipmentParameter = new EmParam();
		equipmentParameter.setId(id);
		map.put("success", equipmentParameterService.invalid(equipmentParameter));
		return map;
	}
	
	/**
	 * 作废子表
	 * @param id
	 * @return
	 */
	@RequestMapping(params="invalidDetail")
	@ResponseBody
	public Map<String, Object> invalidDetail(String id){
		Map<String, Object> map = new HashMap<String, Object>();
		EmParamDetail equipmentParameterDetail = new EmParamDetail();
		equipmentParameterDetail.setId(id);
		map.put("success", equipmentParameterDetailService.invalid(equipmentParameterDetail));
		return map;
	}
	
	/**
	 * 保存
	 * @param emParam
	 * @return
	 */
	@RequestMapping(params="save")
	@ResponseBody
	public Map<String, Object> save(EmParam emParam){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("result", equipmentParameterService.save(emParam));
		return map;
	}
	
	/**
	 * 保存子表
	 * @param emParamDetail
	 * @return
	 */
	@RequestMapping(params="saveDetail")
	@ResponseBody
	public Map<String, Object> saveDetail(EmParamDetail emParamDetail){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("result", equipmentParameterDetailService.save(emParamDetail));
		return map;
	}
	
}
