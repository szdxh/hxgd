package com.hxgd.onemap.util;

import java.util.Map;

/**
* @ClassName: getBodyJsonString
* @Description: TODO()
* @author 双子的小坏
* @date 2019年6月25日
*
*/
public class getBodyJsonString {
	
	/**
	 * 
	* @Title: getBodyParams
	* @Description: TODO(获取)
	* @param @param params    参数
	* @return void    返回类型
	* @throws
	 */
	public static String getBodyParams(Map<String, String> params) {
		String body = "{\n";
		 for(String key:params.keySet())
	        {
	         body+= "\""+key+"\":"+"\""+params.get(key)+"\",\n";
	         
	        }
		 body =  body.substring(0,body.length()-2)+"\n}";
		return body;
	}
	
	public static String getBodyArrParams(Map<String, String> params) {
		String body = "{\n";
		 for(String key:params.keySet())
	        {
	         body+= "\""+key+"\":"+params.get(key)+",\n";
	         
	        }
		 body =  body.substring(0,body.length()-2)+"\n}";
		return body;
	}
	
	
	

}
