package com.hxgd.onemap.constant;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* @ClassName: G7DataCurrent_location
* @Description: TODO(G7获取当前定位的data)
* @author 双子的小坏
* @date 2019年7月2日
*
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class G7DataCurrent_location {
	
	private String lng;
	
	private String lat;
	
	private String speed;
	
	private String course;
	
	private String time;
	
	private String distance;

}
