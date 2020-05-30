/**
 * @author CY
 * @date 2019年1月15日 
 */
package com.caijai.pur.api;

/**
 * @author CY
 * @date 2019年1月15日
 */
public interface PurMrbApi {

	/**
	 * 同步不合格处理报告，若不合格处理报告结果为退货，则修改采购订单余量
	 * @author CY
	 * @date 2019年1月15日
	 */
	void updateMarginQty(String org);
	
	/**
	 * 不合格处理报告为多行时，新增收货单行
	 * @author CY
	 * @date 2019年4月17日
	 * @param org
	 */
	void insertRcv(String org);
	
}
