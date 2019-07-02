package com.hxgd.onemap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.alibaba.fastjson.JSON;
import com.hxgd.onemap.constant.G7DataCurrent_location;
import com.hxgd.onemap.constant.G7Response;
import com.hxgd.onemap.g7.Cljcxx;
import com.hxgd.onemap.g7.Clsj;

@Controller
@RequestMapping("test")
public class TestController {
	
	@RequestMapping("/index")
	public String index(ModelMap map) throws Exception {
		map.addAttribute("key", "王大锤");
		System.out.println(Cljcxx.add_self_truck("testA123456", "1", "王大锤"));
		return "onemap/index";
		
	}
	
	@RequestMapping("/current_location")
	public String current_location( @RequestParam String plate_num,ModelMap map) throws Exception {
	
		G7Response res =   JSON.parseObject( Clsj.current_location(plate_num,"map"), G7Response.class);

		G7DataCurrent_location data =  JSON.parseObject(res.getData(),G7DataCurrent_location.class);
		map.addAttribute("G7DataCurrent_location",data);
		return "onemap/index";
	}

}
