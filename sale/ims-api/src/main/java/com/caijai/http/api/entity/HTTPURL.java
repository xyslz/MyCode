/**  
 * Title: U9APIURL.java<p>
 * Description: <br>  
 * Copyright: Copyright (c) 2017<br> 
 * Company: www.caijai.com<br>  
 * @author 端鹏程
 * @date 2019年1月4日  
 * @version 1.0  
 */  
package com.caijai.http.api.entity;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**  
 * Title: U9APIURL<p>  
 * Description: <br>  
 * @author 端鹏程  
 * @date 2019年1月4日  
 */
public class HTTPURL {

	public static final String U9API;
	public static final String EntCode;
	
	static {
		Map<String, Object> map = new HashMap<>();
		try {
			map = new PropertySet().read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		EntCode = (String) map.get("EntCode");
	   	U9API = (String) map.get("U9API");
	}
}
