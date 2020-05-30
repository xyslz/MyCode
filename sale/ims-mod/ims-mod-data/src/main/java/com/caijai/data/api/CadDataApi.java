package com.caijai.data.api;

public interface CadDataApi {

	/**
	 * Title: resetCad
	 * <p>
	 * Description:将版本为1的数据，取消质检，还原至未质检的历史单据
	 * 
	 * @author 端鹏程
	 * @date 2019年6月12日
	 */
	boolean resetCad(String id);
}
