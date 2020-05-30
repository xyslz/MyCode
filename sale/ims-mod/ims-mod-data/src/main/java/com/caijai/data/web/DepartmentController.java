package com.caijai.data.web;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.caijai.base.util.PageInfo;
import com.caijai.base.util.StringUtil;
import com.caijai.data.entity.Department;
import com.caijai.data.entity.vo.DepartmentVO;
import com.caijai.data.service.DepartmentService;

/**
 * 部门
 * @author ChenYu
 *
 */
@Controller
@RequestMapping("dept.do")
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@RequestMapping(params="queryPage")
	@ResponseBody
	public Map<String, Object> queryPage(String pageNumber,String pageSize,Department department){
		Map<String, Object> map = new HashMap<String,Object>();
		PageInfo<Department> pageInfo = new PageInfo<Department>(pageNumber, pageSize);
		PageInfo<Department> departmentInfo = departmentService.queryPage(pageInfo,department);
		map.put("total", departmentInfo.getTotal());
		map.put("rows", departmentInfo.getRows());
		return map;
	}
	
//	@RequestMapping(params="invalid")
//	@ResponseBody
//	public Map<String, Object> invalid(String id){
//		Map<String, Object> map = new HashMap<String,Object>();
//		Department department = new Department();
//		department.setId(id);
//		map.put("success", departmentService.invalid(department));
//		return map;
//	}
	
//	@RequestMapping(params="save")
//	@ResponseBody
//	public Map<String, Object> save(@RequestBody Department department){
//		Map<String, Object> map = new HashMap<String,Object>();
//		if(department.getIsEffective()==null){
//			department.setIsEffective(0);
//		}
//		map.put("result", departmentService.save(department));
//		return map;
//	}
	
	@RequestMapping(params="queryAllDept")
	@ResponseBody
	public Map<String, Object> queryAllDept(){
		Map<String, Object> map = new HashMap<String,Object>();
		List<DepartmentVO> list = new ArrayList<DepartmentVO>();
		List<DepartmentVO> plist = new ArrayList<DepartmentVO>();
		for (DepartmentVO vo : departmentService.queryAllDept()) {
			if(!StringUtil.IsNullOrEmpty(vo.getName())) {
				list.add(vo);
			}
			if(StringUtil.IsNullOrEmpty(vo.getPid())) {
				plist.add(vo);
			}
		}
		
		Collections.sort(list,new Comparator<DepartmentVO>(){
            public int compare(DepartmentVO arg0, DepartmentVO arg1) {
                return arg0.getCode().compareTo(arg1.getCode());
            }
        });
		
		StringBuilder builder = new StringBuilder("[");
		for (int i = 0; i < plist.size(); i++) {
			DepartmentVO vo = plist.get(i);
			builder.append("{text : '"+vo.getName()+"',value:'"+vo.getId()+"'");
			builder.append(treeStr(vo.getId(),list));
			builder.append("},");
		}
		builder.append("]");
		map.put("str", builder.toString());
		return map;
	}
	
//	deptList = data.list;
//	var parentDept = new Array;
//	for (var i = 0; i < deptList.length; i++) {
//		var pdept = deptList[i];
//		if(null == pdept.pid || '' == pdept.pid){
//			parentDept.push(deptList[i]);
//		}
//	}
//	for (var j = 0; j < parentDept.length; j++) {
//		str += '{text : "'+parentDept[j].name+'",value:"'+parentDept[j].id+'",nodes : [';
//		for (var o = 0; o < deptList.length; o++) {
//			if(parentDept[j].id == deptList[o].pid){
//				str += '{text:"'+deptList[o].name+'",value:"'+deptList[o].id+'"},';
//			}
//		} 
//		str += ']},';
//	}
//	str += "]";
	
	public StringBuilder treeStr(String pid,List<DepartmentVO> list) {
		StringBuilder builder = new StringBuilder(",nodes : [");
		for (int i = 0; i < list.size(); i++) {
			DepartmentVO vo = list.get(i); 
			if(pid.equals(vo.getPid())) {
				builder.append("{text:'"+vo.getName()+"',value:'"+vo.getId()+"'");	
				List<DepartmentVO> clist = new ArrayList<DepartmentVO>(list);
				clist.remove(vo);
				builder.append(treeStr(vo.getId(),clist));
				builder.append("},");
			}
		}
		return builder.append("]");
	}
	
	@RequestMapping(params="queryDept")
	@ResponseBody
	public Map<String, Object> queryDept(){
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("list", departmentService.queryDepByName());
		return map;
	}
	
	@RequestMapping(params="queryList")
	@ResponseBody
	public Map<String, Object> queryList(Department department){
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("list", departmentService.queryList(department));
		return map;
	}
	
}
