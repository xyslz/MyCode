/**
 * @author CY
 * @date 2019年7月10日 
 */
package com.caijai.data.api;

import java.util.Map;

import com.caijai.data.entity.Supplier;

/**
 * @author CY
 * @date 2019年7月10日
 */
public interface SupplierQualityApi {

	Map<String, Object> addQuality(Supplier supplier);

	/**
	 * 删除供应商资质
	 * @author CY
	 * @date 2019年8月16日
	 * @param supplier
	 */
	void deleteQuality(Supplier supplier);

}
