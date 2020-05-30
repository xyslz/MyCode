package com.caijai.dock.service;

import java.util.List;

import com.caijai.base.sysenum.TypeOff;
import com.caijai.dock.entity.WaitTasks;
import com.caijai.sysuser.entity.SysDictionaryDetail;

/**
 * 脱机任务
 * @author WHD
 *
 */
public interface WaitService {

	/**
	 * 查询接口是否生效
	 * @param dCode
	 * @return
	 */
	SysDictionaryDetail IsOnline(TypeOff type);

	/**
	 * 添加脱机任务
	 * @param id
	 * @param docNo
	 * @param name
	 * @return
	 */
	WaitTasks addWait(String id, String docNo, String name,String source);
	
	/**
	 * 删除脱机任务
	 * @param id
	 * @return
	 */
	void deleteWait(String id, Integer type);

	/**
	 * 定时执行脱机任务
	 * @return
	 */
	public List<WaitTasks> OnOff(String org);

	/**
	 * 添加非脱机任务
	 * @param id
	 * @param docNo
	 * @param name
	 * @return
	 */
	WaitTasks addOnWait(String id,String docNo, String name);
	
}
