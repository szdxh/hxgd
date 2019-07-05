package com.hxgd.onemap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hxgd.onemap.serviceimpl.AreaServiceImpl;
import com.hxgd.onemap.util.LeeJSONResult;

/**
* @ClassName: AreaController
* @Description: TODO(Area的controller)
* @author 双子的小坏
* @date 2019年7月5日
*
*/
@Controller
@RequestMapping("Area")
public class AreaController {
	
	
	@Autowired
	AreaServiceImpl areaServiceImpl;
	
	
	@ResponseBody
	@PostMapping("/getCarposition")
	public LeeJSONResult getCarposition() {
		return  LeeJSONResult.build(200, "定位返回成功", areaServiceImpl.getCarposition());
		
		
	}

}
