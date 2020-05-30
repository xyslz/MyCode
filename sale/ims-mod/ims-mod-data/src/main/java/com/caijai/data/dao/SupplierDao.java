/**
 * @author CY
 * @date 2019年7月17日 
 */
package com.caijai.data.dao;

import com.caijai.base.util.PageInfo;
import com.caijai.data.entity.Supplier;

/**
 * @author CY
 * @date 2019年7月17日
 */
public interface SupplierDao {

	PageInfo<Supplier> queryPageByParam(PageInfo<Supplier> pageInfo, Supplier supplier);

}
