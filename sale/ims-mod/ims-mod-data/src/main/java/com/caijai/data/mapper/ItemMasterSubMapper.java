package com.caijai.data.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.caijai.data.entity.ItemMasterSub;

/**
 * Title: ItemMasterSubMapper
 * 
 * @author 杨雪景
 * @date 2019年4月25日
 */
public interface ItemMasterSubMapper {

	/**
	 * 查询属于泥和皮的副产品
	 * 
	 * @author CY
	 * @date 2019年4月29日
	 * @param mainProducts
	 * @param type
	 * @return
	 */
	List<ItemMasterSub> getListByItem(@Param("mainProducts") String mainProducts, @Param("type") Integer type);

	ItemMasterSub getByMud(@Param("mainProducts") String mainProducts, @Param("mud") String mud);

	ItemMasterSub getBySkin(@Param("mainProducts") String mainProducts, @Param("mud") String mud);

	/**
	 * 生成副产品
	 * <p>
	 * Description:
	 * 
	 * @author 端鹏程
	 * @date 2019年7月6日
	 */
	void privateByproduct(@Param("item") String item, @Param("org") String org, @Param("lp") Double lp,
			@Param("ln") Double ln);
}
