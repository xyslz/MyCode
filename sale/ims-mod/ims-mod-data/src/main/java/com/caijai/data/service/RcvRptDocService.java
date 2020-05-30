/**  
 * Title: RcvRptDocService.java<p>
 * Description: <br>  
 * Copyright: Copyright (c) 2017<br> 
 * Company: www.caijai.com<br>  
 * @author 端鹏程
 * @date 2018年12月12日  
 * @version 1.0  
 */
package com.caijai.data.service;

import java.util.List;

import com.caijai.data.entity.RcvRptDocLine;

/**
 * Title: RcvRptDocService
 * <p>
 * Description: <br>
 * 
 * @author 端鹏程
 * @date 2018年12月12日
 */
public interface RcvRptDocService {

	List<RcvRptDocLine> getRptLine(RcvRptDocLine line);

}
