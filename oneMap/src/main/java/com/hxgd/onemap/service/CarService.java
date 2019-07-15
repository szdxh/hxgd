package com.hxgd.onemap.service;

import java.util.List;

public interface CarService {
	
	//获取区域的集合
	List<String> getAreaList();
	//获取区域的车牌号
	List<String> getAreaCarLicense(String area);

}
