package com.caijai.data.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.caijai.base.service.DMLServiceSupport;
import com.caijai.base.sysenum.SupplierState;
import com.caijai.data.entity.Supplier;
import com.caijai.data.entity.vo.SupplierVo;
import com.caijai.data.service.SupplierService;

@Controller
@RequestMapping("supplier.do")
public class SupplierController {

	private static Logger logger = Logger.getLogger(SupplierController.class);

	@Autowired
	private SupplierService supplierService;

	@Autowired
	private DMLServiceSupport<SupplierVo> supplierVODML;

	@RequestMapping(params = "queryPage")
	@ResponseBody
	public Map<String, Object> queryPage(String pageNumber, String pageSize, SupplierVo supplier) {
		if (supplier.getState() == null) {
			supplier.setState(SupplierState.Verified);
		}
		return supplierVODML.queryPage(pageNumber, pageSize, supplier);
	}

	@RequestMapping(params = "queryPageByParam")
	@ResponseBody
	public Map<String, Object> queryPageByParam(String pageNumber, String pageSize, Supplier supplier) {
		return supplierService.queryPageByParam(pageNumber, pageSize, supplier);
	}

	@RequestMapping(params = "save")
	@ResponseBody
	public Map<String, Object> save(Supplier supplier) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("result", supplierService.save(supplier));
		return map;
	}

	@RequestMapping(params = "invalid")
	@ResponseBody
	public Map<String, Object> invalid(String id) {
		Map<String, Object> map = new HashMap<String, Object>();
		Supplier supplier = new Supplier();
		supplier.setId(id);
		map.put("success", supplierService.invalid(supplier));
		return map;
	}

	/**
	 * 生成供应商用户
	 * 
	 * @param supplier
	 * @return
	 */
	@RequestMapping(params = "saveSupplierUser")
	@ResponseBody
	public Map<String, Object> saveSupplierUser(@RequestBody List<Supplier> supplier) {
		return supplierService.saveSupplierUser(supplier);
	}

	/**
	 * 根据条件模糊查询供应商
	 * 
	 * @author CY
	 * @date 2019年5月30日
	 * @param supplier
	 * @return
	 */
	@RequestMapping(params = "chooseSupplier")
	@ResponseBody
	public Map<String, Object> chooseSupplier(Supplier supplier) {
		Map<String, Object> map = new HashMap<>();
		map.put("result", supplierService.chooseSupplier(supplier));
		return map;
	}

	/**
	 * 供应商邀约<br>
	 * 发送邮件<br>
	 * 
	 * @author CY
	 * @date 2019年7月10日
	 * @param supplier
	 * @throws Exception
	 */
	@RequestMapping(params = "invitation")
	@ResponseBody
	public Map<String, Object> invitation(Supplier supplier) throws Exception {
		logger.info("供应商：" + supplier.getCode() + "邀约");
		return supplierService.invitation(supplier);
	}

	/**
	 * 供应商审核--挂起，黑名单
	 * 
	 * @author CY
	 * @date 2019年7月10日
	 * @param supplier
	 * @return
	 */
	@RequestMapping(params = "operateSupplier")
	@ResponseBody
	public Map<String, Object> operateSupplier(@RequestBody List<Supplier> list) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("success", supplierService.operateSupplier(list));
		return map;
	}

}