package com.hxgd.onemap.util;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hxgd.onemap.constant.Constants;
import com.hxgd.onemap.constant.ContentType;
import com.hxgd.onemap.constant.HttpHeader;
import com.hxgd.onemap.constant.HttpSchema;
import com.hxgd.onemap.enums.Method;

public class G7Util {
	
	private final static Logger log = LoggerFactory.getLogger(G7Util.class);
	
	private final static String ACCESS_ID = "7vhr0b";
			
	private final static String SECRET_KEY =  "bImcozhqJFj1crwMIouybjb5QaOgJ9Bx";
	//正式环境
	private final static String BaseURL = "openapi.huoyunren.com";
	//沙箱环境
	//private final static Sgtring BaseURL = "demo.dsp.chinawayltd.com/altair/rest";
	
	public static String getRest(String path,Map<String,String> querys) throws Exception {
		Map<String,String> headers = new HashMap<String,String>(); 
		headers.put(HttpHeader.HTTP_HEADER_G7_TIMESTAMP, "" + System.currentTimeMillis());
	    Request request = new Request(Method.GET, HttpSchema.HTTP + BaseURL, path, ACCESS_ID, SECRET_KEY, Constants.DEFAULT_TIMEOUT);
	    request.setHeaders(headers);
	    request.setQueries(querys);
	    //调用服务端
	    Response response = Client.execute(request);
	    log.info(response.getBody());
		return response.getBody();
	}
	
	public static String postRest(String path,String body) throws Exception {
		Map<String, String> headers = new HashMap<String, String>();
	    headers.put(HttpHeader.HTTP_HEADER_CONTENT_MD5, MessageDigestUtil.base64AndMD5(body));
	    //（POST/PUT请求必选）请求Body内容格式
	    headers.put(HttpHeader.HTTP_HEADER_CONTENT_TYPE, ContentType.CONTENT_TYPE_JSON);
	    //headers.put("d-header1", "header1Value");
	    //headers.put("X-G7-Ca-a-header1", "header1Value");
	    //headers.put("X-G7-Ca-b-header2", "header2Value");
	    headers.put(HttpHeader.HTTP_HEADER_G7_TIMESTAMP, "" + System.currentTimeMillis());
	    Request request = new Request(Method.POST_JSON, HttpSchema.HTTP + BaseURL, path, ACCESS_ID, SECRET_KEY, Constants.DEFAULT_TIMEOUT);
	    request.setHeaders(headers);
	    request.setJsonStrBody(body);
	    //调用服务端
	    Response response = Client.execute(request);
	    log.info(response.getBody());
		return response.getBody();
		
	}

}
