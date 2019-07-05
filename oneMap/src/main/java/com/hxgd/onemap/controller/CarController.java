package com.hxgd.onemap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hxgd.onemap.serviceimpl.CarServiceImpl;
import com.hxgd.onemap.util.LeeJSONResult;

@Controller
@RequestMapping("car")
public class CarController {
	 
	
	@Autowired
	CarServiceImpl carServiceImpl;
	
	@ResponseBody
	@PostMapping("/getCarposition")
	public LeeJSONResult getCarposition() {
		return  LeeJSONResult.build(200, "定位返回成功", carServiceImpl.getCarposition());
		
		
	}
	

}
