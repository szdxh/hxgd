package com.hxgd.onemap.dao;

import java.util.List;

import com.hxgd.onemap.entity.Car;
import com.hxgd.onemap.util.MyMapper;

public interface CarMapper extends MyMapper<Car> {
	//获取区域的集合
	List<String> getAreaList();
	//获取区域的车牌号
	List<String> getAreaCarLicense(String area);
}