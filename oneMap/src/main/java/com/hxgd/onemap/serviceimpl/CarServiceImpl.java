package com.hxgd.onemap.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hxgd.onemap.dao.CarMapper;
import com.hxgd.onemap.entity.Car;

@Service
public class CarServiceImpl {
	
	
	@Autowired
	CarMapper carMapper;
	
	public List<Car> getCarposition() {
		List <Car>list =  carMapper.selectAll();
		return list;
	}
	

}
