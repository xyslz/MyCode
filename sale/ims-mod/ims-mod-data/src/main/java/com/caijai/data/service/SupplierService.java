package com.caijai.data.service;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.caijai.base.util.PageInfo;
import com.caijai.data.entity.Supplier;
import com.google.zxing.WriterException;

public interface SupplierService {

	PageInfo<Supplier> queryPage(PageInfo<Supplier> pageInfo, Supplier supplier);

	Supplier save(Supplier supplier);

	boolean invalid(Supplier supplier);

	/**
	 * 生成供应商用户
	 * 
	 * @param supplier
	 * @return
	 */
	Map<String, Object> saveSupplierUser(List<Supplier> supplier);

	List<Supplier> chooseSupplier(Supplier supplier);

	/**
	 * 供应商邀约
	 * 
	 * @author CY
	 * @param supplier
	 * @throws IOException
	 * @throws WriterException
	 * @throws Exception
	 * @date 2019年7月10日
	 */
	Map<String, Object> invitation(Supplier supplier) throws Exception;

	/**
	 * 供应商操作（挂起，黑名单）
	 * 
	 * @author CY
	 * @date 2019年7月10日
	 * @param supplier
	 * @return
	 */
	List<Supplier> operateSupplier(List<Supplier> list);

	/**
	 * 用于供应商操作（挂起，黑名单）
	 * @author CY
	 * @date 2019年7月17日
	 * @param pageNumber
	 * @param pageSize
	 * @param supplier
	 * @return
	 */
	Map<String, Object> queryPageByParam(String pageNumber, String pageSize, Supplier supplier);

}