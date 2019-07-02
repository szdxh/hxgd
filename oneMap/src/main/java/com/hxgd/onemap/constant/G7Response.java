package com.hxgd.onemap.constant;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* @ClassName: G7Response
* @Description: TODO(G7接口的返回值)
* @author 双子的小坏
* @date 2019年7月2日
*
*/

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class G7Response {
	
	private String code;
	
	private String msg;
	
	private  String succ;
	
	private String sub_code;
	
	private String sub_msg;
	
	private String req_id;
	
	private String data;

	
	
	

}
