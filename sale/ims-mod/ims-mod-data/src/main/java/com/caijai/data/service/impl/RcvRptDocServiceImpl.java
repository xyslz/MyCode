/**  
 * Title: InStorageServiceImpl.java<p>
 * Description: <br>  
 * Copyright: Copyright (c) 2017<br> 
 * Company: www.caijai.com<br>  
 * @author 端鹏程
 * @date 2018年12月10日  
 * @version 1.0  
 */  
package com.caijai.data.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caijai.base.dao.BaseDao;
import com.caijai.base.service.DMLServiceSupport;
import com.caijai.data.entity.RcvRptDoc;
import com.caijai.data.entity.RcvRptDocLine;
import com.caijai.data.service.RcvRptDocService;

/**  
 * Title: InStorageServiceImpl<p>  
 * Description: <br>  
 * @author 端鹏程  
 * @date 2018年12月10日  
 */
@Service
public class RcvRptDocServiceImpl extends DMLServiceSupport<RcvRptDoc> implements RcvRptDocService{
	
	@Autowired
	private BaseDao<RcvRptDocLine> linedao;

	@Override
	public List<RcvRptDocLine> getRptLine(RcvRptDocLine line) {
		return linedao.getListByParam(line);
	}

	
}
