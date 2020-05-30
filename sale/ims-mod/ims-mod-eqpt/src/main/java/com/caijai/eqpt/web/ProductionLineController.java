package com.caijai.eqpt.web;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.caijai.eqpt.entity.ProLineParam;
import com.caijai.eqpt.entity.ProductionLine;
import com.caijai.eqpt.service.ProLineParamService;
import com.caijai.base.service.DMLServiceSupport;
import com.caijai.base.service.FUNServiceSupport;

@Controller
@RequestMapping("productionLine.do")
public class ProductionLineController {
	
	@Autowired
	private FUNServiceSupport<ProductionLine> productionLineService;
	
	@Autowired
	private DMLServiceSupport<ProductionLine> productionLineDML;
	
	@Autowired
	private DMLServiceSupport<ProLineParam> proLineParamDML;
	
	@Autowired
	private ProLineParamService proLineParamService;
	
	@RequestMapping(params = "queryPage")
	@ResponseBody
	public Map<String, Object> queryPage(String pageNumber, String pageSize, ProductionLine productionLine) {
		return productionLineDML.queryPage(pageNumber, pageSize, productionLine);
	}
	
	@RequestMapping(params = "save")
	@ResponseBody
	public Map<String, Object> save(ProductionLine productionLine) {
		Map<String, Object> map = new HashMap<>();
		map.put("result", productionLineDML.save(productionLine));
		return map;
	}

	@RequestMapping(params = "invalid")
	@ResponseBody
	public Map<String, Object> invalid(String id) {
		ProductionLine pl = new ProductionLine();
		pl.setId(id);
		return  productionLineDML.invalid(pl);
	}
	
	@RequestMapping(params="export")
	public void export(@RequestParam("list[]")List<String> idList,HttpServletResponse response) throws IOException{
		productionLineService.export(idList, response);
	}
	
	@RequestMapping(params = "queryParam")
	@ResponseBody
	public Map<String, Object> queryParam(ProLineParam proLineParam) {
		return proLineParamService.queryParam(proLineParam);
	}
	
	@RequestMapping(params = "saveLine")
	@ResponseBody
	public Map<String, Object> saveLine(ProLineParam proLineParam) {
		Map<String, Object> map = new HashMap<>();
		map.put("result", proLineParamDML.save(proLineParam));
		return map;
	}

	@RequestMapping(params = "invalidLine")
	@ResponseBody
	public Map<String, Object> invalidLine(String id) {
		ProLineParam pl = new ProLineParam();
		pl.setId(id);
		return  proLineParamDML.invalid(pl);
	}
	
}
