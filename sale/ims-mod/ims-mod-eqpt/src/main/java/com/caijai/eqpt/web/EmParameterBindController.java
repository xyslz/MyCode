package com.caijai.eqpt.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.caijai.eqpt.entity.EmParamBind;
import com.caijai.base.service.DMLServiceSupport;

/**
 * 设备参数绑定
 * @author ChenYu
 *
 */
@Controller
@RequestMapping("emparambind.do")
public class EmParameterBindController {
	
	@Autowired
	private DMLServiceSupport<EmParamBind> emParamBindDML;
	
	/**
	 * 查询分页
	 * @param pageNumber
	 * @param pageSize
	 * @param paramBind
	 * @return
	 */
	@RequestMapping(params="queryPage")
	@ResponseBody
	public Map<String, Object> queryPage(String pageNumber,String pageSize,EmParamBind paramBind){
		return emParamBindDML.queryPage(pageNumber, pageSize, paramBind);
	}
	
	/**
	 * 作废
	 * @param id
	 * @return
	 */
	@RequestMapping(params="invalid")
	@ResponseBody
	public Map<String, Object> invalid(String id){
		EmParamBind paramBind = new EmParamBind();
		paramBind.setId(id);
		return emParamBindDML.invalid(paramBind);
	}
	
	/**
	 * 保存
	 * @param paramBind
	 * @return
	 */
	@RequestMapping(params="save")
	@ResponseBody
	public Map<String, Object> save(EmParamBind paramBind){
		Map<String, Object> map = new HashMap<>();
		map.put("result", emParamBindDML.save(paramBind));
		return map;
	}
	
}
