package com.hxgd.oneMap;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class BodyTest {
		
	@Test
	public static void main(String[] args) {
		Map map =  new HashMap();
		map.put("1", "王大锤");
		map.put("2", "王二锤");
		map.put("3", "王三锤");
		getBodyParams(map);
		
	}
	
	private static void getBodyParams(Map<String,String> params) {
		String body = "{\n";
		 for(String key:params.keySet())
	        {
	         body+= "\""+key+"\":"+"\""+params.get(key)+"\",\n";
	        }
		 body =  body.substring(0,body.length()-2)+"\n}";
		 System.out.println(body);
	}
	

}
