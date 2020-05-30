package com.caijai.data.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.caijai.base.service.DMLServiceSupport;
import com.caijai.data.entity.RelationObject;

@Controller
@RequestMapping("relation.do")
public class RelationObjectController {

	@Autowired
	private DMLServiceSupport<RelationObject> relationDML;

	@RequestMapping(params = "queryPage")
	@ResponseBody
	public Map<String, Object> queryPage(String pageNumber, String pageSize, RelationObject relation) {
		return relationDML.queryPage(pageNumber, pageSize, relation);
	}

	@RequestMapping(params = "save")
	@ResponseBody
	public Map<String, Object> save(RelationObject relation) {
		Map<String, Object> map = new HashMap<>();
		map.put("result", relationDML.save(relation));
		return map;
	}

	@RequestMapping(params = "invalid")
	@ResponseBody
	public Map<String, Object> invalid(RelationObject relation) {
		return relationDML.invalid(relation);
	}

}
