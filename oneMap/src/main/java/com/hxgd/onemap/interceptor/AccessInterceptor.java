package com.hxgd.onemap.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * @ClassName:  AccessInterceptor   
 * @Description:TODO(跨域拦截器)
 * @author: 双子的小坏
 * @date:   2019年3月26日 下午4:21:32  
 */
@Component
public class AccessInterceptor implements HandlerInterceptor {
	
	
		 
		/**
		 * 在请求处理之前进行调用（Controller方法调用之前）
		 */
		@Override
		public boolean preHandle(HttpServletRequest request, HttpServletResponse response, 
				Object object) throws Exception {
			response.setHeader("Access-Control-Allow-Origin", "*");  
	        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");  
	        response.setHeader("Access-Control-Max-Age", "3600");  
	        response.setHeader("Access-Control-Allow-Headers", "x-requested-with");   
	        System.out.println("进入跨域拦截器");
			return true;
		}
		
		/**
		 * 请求处理之后进行调用，但是在视图被渲染之前（Controller方法调用之后）
		 */
		@Override
		public void postHandle(HttpServletRequest request, HttpServletResponse response, 
				Object object, ModelAndView mv)
				throws Exception {
			// TODO Auto-generated method stub
			
		}
		
		/**
		 * 在整个请求结束之后被调用，也就是在DispatcherServlet 渲染了对应的视图之后执行
		 * （主要是用于进行资源清理工作）
		 */
		@Override
		public void afterCompletion(HttpServletRequest request, HttpServletResponse response, 
				Object object, Exception ex)
				throws Exception {
			// TODO Auto-generated method stub
			
		}
	

}
