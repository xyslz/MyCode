package com.caijai.task.api;

public interface RunTaskApi {

	/**
	 * 同步数据后,执行的接口
	 * 
	 * @param taskname
	 * @return 执行总条数
	 */
	public int runTask(String procedure);

	/**
	 * 正常业务中执行
	 * @param procedure
	 * @return
	 */
	//public boolean business(String procedure);
}
