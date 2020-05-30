/**  
 * Title: MoMapper.java<p>
 * Description: <br>  
 * Copyright: Copyright (c) 2017<br> 
 * Company: www.caijai.com<br>  
 * @author 端鹏程
 * @date 2018年12月21日  
 * @version 1.0  
 */
package com.caijai.data.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.caijai.data.entity.Mo;
import com.caijai.data.entity.vo.MoVO;

/**
 * Title: MoMapper
 * <p>
 * Description: <br>
 * 
 * @author 端鹏程
 * @date 2018年12月21日
 */
public interface MoMapper {
	
	/**
	 * Title: queryNoCompleteList
	 * <p>
	 * Description:
	 * 
	 * @author 端鹏程
	 * @param org
	 * @date 2018年12月22日
	 */
	List<Mo> queryNoCompleteList(@Param("org") String org, @Param("startDate") String startDate,
			@Param("endDate") String endDate);

	/**
	 * Title: getTotalCount
	 * <p>
	 * Description:
	 * 
	 * @author 端鹏程
	 * @date 2018年12月30日
	 */
	Integer getTotalCount(Map<String, Object> map);

	/**
	 * Title: queryPage
	 * <p>
	 * Description:
	 * 
	 * @author 端鹏程
	 * @date 2018年12月30日
	 */
	List<Mo> queryPage(Map<String, Object> map);

	/**
	 * Title: queryNoCompleteCount
	 * <p>
	 * Description:
	 * 
	 * @author 端鹏程
	 * @date 2019年1月10日
	 */
	int queryNoCompleteCount(@Param("org") String org, @Param("startDate") String startDate,
			@Param("endDate") String endDate);

	/**  
	 * Title: getTotalCountReport<p>  
	 * Description:
	 * @author 端鹏程  
	 * @date 2019年1月23日 
	 */
	Integer getTotalCountReport(Map<String, Object> map);

	/**  
	 * Title: queryPageReport<p>  
	 * Description:
	 * @author 端鹏程  
	 * @date 2019年1月23日 
	 */
	List<MoVO> queryPageReport(Map<String, Object> map);
	
	/**
	 * 根据生产订单查询派工单总条数
	 * @author CY
	 * @date 2019年5月16日
	 * @param mo
	 * @return
	 */
	Integer getMoCount(@Param("mo") String mo);

}
