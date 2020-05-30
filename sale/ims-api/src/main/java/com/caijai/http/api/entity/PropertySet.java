package com.caijai.http.api.entity;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import org.apache.log4j.Logger;

public class PropertySet {
	
	private static Logger logger = Logger.getLogger(PropertySet.class);
	
	private static String path;
	
	static {
		path = PropertySet.class.getClassLoader().getResource("/").getPath() + "sysset" + File.separator + "set.properties";
		logger.info("加载:"+path);
	}

	public Map<String, Object> read() throws IOException {
		Properties prop = new Properties();
		Map<String, Object> map = new HashMap<String, Object>();
		InputStream in = new BufferedInputStream(new FileInputStream(path));
		prop.load(in); /// 加载属性列表
		Iterator<String> it = prop.stringPropertyNames().iterator();
		while (it.hasNext()) {
			String key = it.next();
			map.put(key, prop.getProperty(key));
		}
		in.close();
		return map;
	}
	
	public void write(Map<String, String> map) throws IOException {
		Properties prop = new Properties();
		FileOutputStream oFile = new FileOutputStream(path, true);// true表示追加打开
		prop.putAll(map);
		prop.store(oFile, null);
		oFile.close();
	}
}
