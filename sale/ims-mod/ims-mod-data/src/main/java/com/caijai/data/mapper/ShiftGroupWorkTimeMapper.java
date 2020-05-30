package com.caijai.data.mapper;

import java.util.List;
import java.util.Map;

import com.caijai.data.entity.ShiftGroupWorkTime;
/**
 * @since2019年5月5日
 * @author 杨雪景
 *
 */
public interface ShiftGroupWorkTimeMapper {
	
	/**
	 * Title: getTotalCount
	 * @author 杨雪景
	 * @since2019年5月5日
	 * @param map
	 * @return
	 */
	public Integer getTotalCount(Map<String, Object> map);
	
	/**
	 * Title: queryPage
	 * Description:
	 * @author 杨雪景
	 * @date 2019年5月5日
	 */
	public List<ShiftGroupWorkTime> queryPage(Map<String, Object> map);

}
