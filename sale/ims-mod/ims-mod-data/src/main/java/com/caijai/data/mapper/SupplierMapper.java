package com.caijai.data.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.caijai.data.entity.Supplier;

public interface SupplierMapper {

	/**
	 * 查询当前为未生成用户的供应商
	 * 
	 * @author CY
	 * @date 2019年1月3日
	 * @return
	 */
	List<Supplier> getUserBySupplier(@Param("org") String org);

	List<Supplier> chooseSupplier(@Param("org") String org, @Param("code") String code);

	/**
	 * 分页查询（用于供应商操作--挂起，黑名单）
	 * 
	 * @author CY
	 * @date 2019年7月17日
	 * @param map
	 * @return
	 */
	Integer getTotalByCZ(Map<String, Object> map);

	/**
	 * 分页查询（用于供应商操作--挂起，黑名单）
	 * 
	 * @author CY
	 * @date 2019年7月17日
	 * @param map
	 * @return
	 */
	List<Supplier> queryPageByCZ(Map<String, Object> map);

	/**
	 * 供应商资质审核，修改状态及审核信息
	 * 
	 * @param supplier
	 * @return
	 */
	Integer updateQuality(@Param("supplier") String supplier, @Param("reviewOn") String reviewOn,
			@Param("reviewBy") String reviewBy);
}
