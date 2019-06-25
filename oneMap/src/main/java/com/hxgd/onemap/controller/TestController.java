package com.hxgd.onemap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hxgd.onemap.g7.Cljcxx;

@Controller
@RequestMapping("test")
public class TestController {
	
	@RequestMapping("/index")
	public String index(ModelMap map) throws Exception {
		map.addAttribute("key", "王大锤");
		System.out.println(Cljcxx.add_self_truck("testA123456", "1", "王大锤"));
		return "onemap/index";
		
	}

}
