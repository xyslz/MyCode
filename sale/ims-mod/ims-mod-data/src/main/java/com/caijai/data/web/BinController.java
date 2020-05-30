package com.caijai.data.web;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.caijai.base.service.DMLServiceSupport;
import com.caijai.data.entity.Bin;
import com.caijai.data.service.BinService;

@Controller
@RequestMapping("bin.do")
public class BinController {
	
	private static Logger logger = Logger.getLogger(BinController.class);
	
	@Autowired
	private DMLServiceSupport<Bin> binDML;
	
	@Autowired
	private BinService binService;

	@RequestMapping(params = "queryPage")
	@ResponseBody
	public Map<String, Object> queryPage(String pageNumber, String pageSize, Bin bin) {
		//bin.setSupplier(MySession.currentUser().getSupplier().getId());
		return binDML.queryPage(pageNumber, pageSize, bin);
	}

	@RequestMapping(params = "save")
	@ResponseBody
	public Map<String, Object> save(Bin bin) {
		Map<String, Object> map = new HashMap<>();
		map.put("result", binDML.save(bin));
		return map;
	}

	@RequestMapping(params = "invalid")
	@ResponseBody
	public Map<String, Object> invalid(Bin bin) {
		return binDML.invalid(bin);
	}
	
	/**
	 * 移动端<br>
	 * 扫描库位上架
	 * @author CY
	 * @date 2018年11月20日
	 * @param bin
	 * @return
	 */
	@RequestMapping(params = "chooseBin")
	@ResponseBody
	public Map<String, Object> chooseBin(Bin bin) {
		Map<String, Object> map = new HashMap<>();
		map.put("result", binService.chooseBin(bin));
		return map;
	}
	
	@RequestMapping(params = "chooseBinList")
	@ResponseBody
	public Map<String, Object> chooseBinList(Bin bin) {
		Map<String, Object> map = new HashMap<>();
		map.put("result", binService.chooseBinList(bin));
		return map;
	}
	
}
