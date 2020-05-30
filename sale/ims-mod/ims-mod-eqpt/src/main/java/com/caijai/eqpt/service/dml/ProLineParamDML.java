package com.caijai.eqpt.service.dml;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caijai.eqpt.entity.ProLineParam;
import com.caijai.eqpt.mapper.ProLineParamMapper;
import com.caijai.eqpt.service.ProLineParamService;
import com.caijai.base.service.DMLServiceSupport;
import com.caijai.sysuser.util.MySession;

/**
 * 产线参数
 * @author ChenYu
 *
 */
@Service
public class ProLineParamDML extends DMLServiceSupport<ProLineParam> implements ProLineParamService{
	
	@Autowired
	private ProLineParamMapper mapper;

	@Override
	public Map<String, Object> queryParam(ProLineParam proLineParam) {
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("list", mapper.queryProLineParam(proLineParam.getProductionLine(),MySession.currentUser().getCorpPk()));
		return map;
	}
	
	
}
