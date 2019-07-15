package com.hxgd.onemap.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hxgd.onemap.entity.Car;
import com.hxgd.onemap.g7.Clsj;
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
	
	@ResponseBody
	@PostMapping("/getG7CarPosition")
	public String getG7CarPosition(String plate_num) throws Exception {
		return  Clsj.current_location(plate_num);
		
		
	}
	
	@ResponseBody
	@PostMapping("/getG7AllCarPosition")
	public String getG7AllCarPosition(String plate_nums, String fields) throws Exception {
		return  Clsj.batch(plate_nums,fields);
	}
	
	@ResponseBody
	@PostMapping("/bootstraptablegetCarposition")
	public List<Car> bootstraptableGetCarposition() {
		return  carServiceImpl.getCarposition();
		
		
	}
	
	@ResponseBody
	@PostMapping("/getAreaCarLicense")
	public List getAreaCarLicense(String area) {
		return carServiceImpl.getAreaCarLicense(area);
		
	}
	

}
