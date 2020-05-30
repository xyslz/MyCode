package com.caijai.repair.mapper;

import java.util.List;
import java.util.Map;

public interface DispatchOrderWxMapper {

	/**
	 * 分页查询生产订单信息
	 * 
	 */
//	List<Map<String, Object>> queryPageByParam(@Param("params") Map<String, Object> params, @Param("org") String org,
//			@Param("code") String code, @Param("maintainpersonName") String maintainpersonName,
//			@Param("createdOn") String createdOn, @Param("srcdocno") String srcdocno, 
//			@Param("applicantName") String applicantName,@Param("repairOrderDate") String repairOrderDate,
//			@Param("dispatchState") int dispatchState);
	List<Map<String, Object>> queryPageByParam(Map<String, Object> params);
	
	
	/**
	 * 查询生产订单信息的总条数
	 * 
	 * @param org
	 * @param itemmaster
	 * @param productlotno
	 * @param docstate
	 * @return
	 */
//	Integer getDispatchOrderCount(@Param("org") String org,
//			@Param("code") String code, @Param("maintainpersonName") String maintainpersonName,
//			@Param("createdOn") String createdOn, @Param("srcdocno") String srcdocno,
//			@Param("applicantName") String applicantName,@Param("repairOrderDate") String repairOrderDate,
//			@Param("dispatchState") String dispatchState);
	int getDispatchOrderCount(Map<String, Object> params);

	

}
