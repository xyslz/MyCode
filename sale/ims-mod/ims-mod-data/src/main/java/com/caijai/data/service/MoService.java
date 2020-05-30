/**  
 * Title: MoService.java<p>
 * Description: <br>  
 * Copyright: Copyright (c) 2017<br> 
 * Company: www.caijai.com<br>  
 * @author 端鹏程
 * @date 2018年12月20日  
 * @version 1.0  
 */
package com.caijai.data.service;

import java.util.List;
import java.util.Map;

import com.caijai.base.util.PageInfo;
import com.caijai.data.entity.Mo;
import com.caijai.data.entity.vo.MoVO;
import com.caijai.sysuser.entity.SysUser;

/**
 * Title: MoService
 * <p>
 * Description: <br>
 * 
 * @author 端鹏程
 * @date 2018年12月20日
 */
public interface MoService {
	
	/**
	 * 根据组织同步生产订单
	 * 
	 * @param org 登录用户组织
	 * @author WHD
	 * @date 2019年1月31日 13:40:22
	 */
	int syncMomo();

	/**
	 * Title: getById
	 * <p>
	 * Description:
	 * 
	 * @author 端鹏程
	 * @date 2018年12月20日
	 */
	Mo getById(Mo mo);

	/**
	 * Title: getByParams
	 * <p>
	 * Description:
	 * 
	 * @author 端鹏程
	 * @date 2018年12月20日
	 */
	Mo getByParams(Mo mo);

	/**
	 * Title: queryList
	 * <p>
	 * Description:
	 * 
	 * @author 端鹏程
	 * @date 2018年12月20日
	 */
	List<Mo> queryList(Mo mo);

	/**
	 * Title: queryNoCompleteList
	 * <p>
	 * Description:
	 * 
	 * @author 端鹏程
	 * @date 2018年12月21日
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

	Map<String, Object> queryPage(String pageNumber, String pageSize, Mo mo, String actualStartDateFrom,
			String actualStartDateEnd);

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

	/**  
	 * Title: close<p>  
	 * Description:
	 * @author 端鹏程  
	 * @date 2019年3月4日 
	 */
	Mo close(Mo mo, SysUser user);

	/**  
	 * Title: invalid<p>  
	 * Description:
	 * @author 端鹏程  
	 * @date 2019年3月4日 
	 */
	Map<String, Object> invalid(String userkey, String org, String docNo);
	
	/**
	 * 生产订单关闭
	 * @author CY
	 * @date 2019年5月16日
	 * @param mo
	 * @return
	 */
	Map<String, Object> closeMo(Mo mo);
	
	/**
	 * 用于查询生产返工的以及完工入库
	 * 
	 * @author CY
	 * @date 2019年6月10日
	 * @param type
	 * @return
	 */
	int queryNoCompleteCount(Integer type);

}
