package com.caijai.data.service;

import com.caijai.base.util.PageInfo;
import com.caijai.data.entity.ShiftGroupWorkTime;

/**
 * Title: ShiftGroupWorkTimeService
 * <p>
 * Description:班组工作时间 <br>
 * @author 杨雪景
 * @date 2019年5月5日
 */
public interface ShiftGroupWorkTimeService {
	/**
	 * Title:queryPage
	 * @author 杨雪景
	 * @date 2019年5月5日
	 * @param pageInfo
	 * @param shiftGroupWorkTime
	 * @return
	 */
	PageInfo<ShiftGroupWorkTime> queryPage(PageInfo<ShiftGroupWorkTime> pageInfo, ShiftGroupWorkTime shiftGroupWorkTime);

}
