package com.hxgd.onemap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("test")
public class TestController {
	
	@RequestMapping("/index")
	public String index(ModelMap map) {
		map.addAttribute("key", "王大锤");
		return "onemap/index";
		
	}

}
