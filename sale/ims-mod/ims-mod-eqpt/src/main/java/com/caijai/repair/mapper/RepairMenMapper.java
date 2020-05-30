package com.caijai.repair.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface RepairMenMapper {

	/**
	 * 记录所有参与该项目的维修人的结束时间
	 * 
	 * @param dispatchid
	 * @param emid
	 * @param endTime
	 * @return
	 */
	Integer modifyEndTime(@Param("dispatchid") String dispatchid, @Param("emid") String emid,
			@Param("endTime") String endTime);

	/**
	 * 根据数据来源修改批量修改负责人
	 * 
	 * @param MaintainID
	 * @param Srcdocid
	 * @param org
	 * @return
	 */
	Integer modifyBySrcdoc(@Param("MaintainID") String MaintainID, @Param("Srcdocid") String Srcdocid,
			@Param("org") String org);

	/**
	 * 根据来源id查询相关人员 
	 * @param men
	 * @return
	 */
	List<Map<String, Object>> getListByParams(@Param("Srcdocid") String Srcdocid,
			@Param("org") String org);
}
