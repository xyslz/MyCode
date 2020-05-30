/**  
 * Title: MoDao.java<p>
 * Description: <br>  
 * Copyright: Copyright (c) 2017<br> 
 * Company: www.caijai.com<br>  
 * @author 端鹏程
 * @date 2018年12月22日  
 * @version 1.0  
 */
package com.caijai.data.dao;

import java.util.List;
import java.util.Map;

import com.caijai.base.util.PageInfo;
import com.caijai.data.entity.Mo;
import com.caijai.data.entity.vo.MoVO;

/**
 * Title: MoDao
 * <p>
 * Description: <br>
 * 
 * @author 端鹏程
 * @date 2018年12月22日
 */
public interface MoDao {

	/**
	 * Title: queryNoCompleteList
	 * <p>
	 * Description:
	 * 
	 * @author 端鹏程
	 * @date 2018年12月22日
	 */

	List<Mo> queryNoCompleteList(String startDate, String endDate);

	/**
	 * Title: queryPage
	 * <p>
	 * Description:
	 * 
	 * @author 端鹏程
	 * @date 2018年12月30日
	 */

	PageInfo<Mo> queryPage(PageInfo<Mo> pageInfo, Mo mo, String actualStartDateFrom, String actualStartDateEnd);

	/**
	 * Title: queryNoCompleteCount
	 * <p>
	 * Description:
	 * 
	 * @author 端鹏程
	 * @date 2019年1月10日
	 */
	int getTotalCount(Map<String, Object> map);

	/**
	 * Title: queryPageReport
	 * <p>
	 * Description:
	 * 
	 * @author 端鹏程
	 * @date 2019年1月23日
	 */
	PageInfo<MoVO> queryPageReport(PageInfo<MoVO> pageInfo, MoVO mo, String applyDateFrom, String applyDateEnd,
			String qcDocCreateDateFrom, String qcDocCreateDateEnd, String businessDateFrom, String businessDateEnd);

}
