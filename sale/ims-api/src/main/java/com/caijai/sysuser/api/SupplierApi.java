package com.caijai.sysuser.api;

import java.util.Map;

public interface SupplierApi{

	/**
	 * @author CY
	 * @date 2019年2月25日
	 * @param procedure
	 * @param sysuer
	 * @return
	 */
	Map<String, Object> runFollowTask(String procedure, String org);

}
