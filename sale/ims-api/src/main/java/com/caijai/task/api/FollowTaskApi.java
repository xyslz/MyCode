package com.caijai.task.api;

import java.util.Map;

public interface FollowTaskApi {

	/**
	 * 同步数据后,执行的接口
	 * 
	 * @param procedure
	 * @return map.put("total", 总条数); map.put("incount", 新增条数);
	 *         map.put("upcount", 变更条数);
	 */
	public Map<String, Object> runFollowTask(String procedure,String org);

}
