package com.hxgd.onemap.serviceimpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hxgd.onemap.dao.CarMapper;
import com.hxgd.onemap.entity.Car;
import com.hxgd.onemap.service.CarService;

@Service
public class CarServiceImpl implements CarService{
	
	
	@Autowired
	CarMapper carMapper;
	
	public List<Car> getCarposition() {
		List <Car>list =  carMapper.selectAll();
		return list;
	}

	@Override
	public List<String> getAreaList() {
		return carMapper.getAreaList();
	}

	@Override
	public List<String> getAreaCarLicense(String area) {
		return carMapper.getAreaCarLicense(area);
	}
	

	
	
	
	
	

	

}
