package com.hxgd.onemap.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
		map.addAttribute("plate_num", plate_num);
		return "onemap/index";
	}
	
	@RequestMapping("/history_location")
	@ResponseBody
	public String history_location(String plate_num,String startTime,String endTime) throws Exception {
		G7Response res =   JSON.parseObject(Clsj.history_location(plate_num, startTime, endTime, "baidu", "10"), G7Response.class);
		String list = res.getData();
		return list;
	}
	
	@RequestMapping("/fuel")
	@ResponseBody
	public String fuel(@RequestParam String plate_num,@RequestParam String from,@RequestParam String to) throws Exception {
		System.out.println(); 
		G7Response res =  JSON.parseObject(Clsj.fuel(plate_num, from, to), G7Response.class);
		return res.getData();
	}
	

}
