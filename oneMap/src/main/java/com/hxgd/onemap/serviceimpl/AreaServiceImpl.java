package com.hxgd.onemap.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hxgd.onemap.dao.AreaMapper;
import com.hxgd.onemap.entity.Area;

/**
* @ClassName: AreaServiceImpl
* @Description: TODO(Area的业务实现类)
* @author 双子的小坏
* @date 2019年7月4日
*
*/
@Service
public class AreaServiceImpl {
	
	@Autowired
	AreaMapper areaMapper ;
	
	public List<Area> getCarposition() {
		List <Area>list =  areaMapper.selectAll();
		return list;
	}
	
	

}
