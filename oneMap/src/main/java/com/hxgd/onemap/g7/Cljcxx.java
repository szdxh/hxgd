package com.hxgd.onemap.g7;

import java.util.HashMap;
import java.util.Map;

import com.hxgd.onemap.util.G7Util;
import com.hxgd.onemap.util.getBodyJsonString;

/**
* @ClassName: Cljcxx
* @Description: TODO(车辆基础信息相关接口调用)
* @author 双子的小坏
* @date 2019年6月25日
*
*/
public class Cljcxx {
	
	/**
	 * @throws Exception 
	 * 
	* @Title: add_self_truck
	* @Description: TODO(增加车辆，在机构中以车牌号添加车辆)
	* @param @param carnum 车牌号,只能单个
	* @param @param isheadstock 是否车头,1车头,2挂车,默认1
	* @param @param orgcode 所属机构号
	* @param @return    参数
	* @return String    返回类型
	* @throws
	 */
	public static String add_self_truck(String carnum,String isheadstock,String orgcode) throws Exception {
		Map<String,String> params = new HashMap<String,String>();
		params.put("carnum",carnum);
		params.put("isheadstock", isheadstock);
		params.put("orgcode", orgcode);
		return G7Util.postRest("/v1/base/truck/add_self_truck", getBodyJsonString.getBodyParams(params));
	}
	
	/**
	 * 
	* @Title: truck_delete
	* @Description: TODO(删除车辆，通过车牌号和绑定关系删除车辆)
	* @param @param own_ids 车辆关系ID，多个请用逗号隔开，最多100个
	* @param @param orgcode_like 机构号
	* @param @return
	* @param @throws Exception    参数
	* @return String    返回类型
	* @throws
	 */
	public static String truck_delete(String own_ids,String orgcode_like) throws Exception {
		Map<String,String> params = new HashMap<String,String>();
		params.put("own_ids",own_ids);
		params.put("orgcode_like", orgcode_like);
		return G7Util.postRest("/v1/base/truck/truck_delete", getBodyJsonString.getBodyParams(params));
		
	}
	
	/**
	 * 
	* @Title: truck_info
	* @Description: TODO(查询车辆详情，可以通过车牌号和绑定关系的设备号查询车辆详情)
	* @param @param orgcode_like 机构号，右匹配
	* @param @return
	* @param @throws Exception    参数
	* @return String    返回类型
	* @throws
	 */
	public static String truck_info(String orgcode_like) throws Exception {
		Map<String,String> params = new HashMap<String,String>();
		params.put("orgcode_like",orgcode_like);
		return G7Util.postRest("/v1/base/truck/truck_info", getBodyJsonString.getBodyParams(params));
		
	}
	
	/**
	 * 
	* @Title: truck_list
	* @Description: TODO(查询车辆列表模糊匹配查询车辆)
	* @param @param orgcode_like 机构号，右匹配
	* @param @return
	* @param @throws Exception    参数
	* @return String    返回类型
	* @throws
	 */
	public static String truck_list(String orgcode_like) throws Exception {
		Map<String,String> params = new HashMap<String,String>();
		params.put("orgcode_like",orgcode_like);
		return G7Util.postRest("/v1/base/truck/truck_list", getBodyJsonString.getBodyParams(params));
		
	}
	
	/**
	* @Title: truckinfo_include_custom_fields
	* @Description: TODO(查询车辆详情查询车辆详情（有自定义字段），返回所有字段)
	* @param @param orgcode_like 机构号，右匹配
	* @param @return
	* @param @throws Exception    参数
	* @return String    返回类型
	* @throws
	 */
	public static String truckinfo_include_custom_fields(String  orgcode_like) throws Exception {
		Map<String,String> params = new HashMap<String,String>();
		params.put("orgcode_like",orgcode_like);
		return G7Util.postRest("/v1/base/truck/truckinfo_include_custom_fields", getBodyJsonString.getBodyParams(params));
	}
	
	/**
	 * 
	* @Title: add_truck_internal_share
	* @Description: TODO(批量设置内部共享车辆接口)
	* @param @param carnumList 车牌号机构号的列表（[{"carnum":"xxx","orgcode":"xxx"},{"carnum":"xxx","orgcode":"xxx"}]json串）
	* @param @return
	* @param @throws Exception    参数
	* @return String    返回类型
	* @throws
	 */
	public static String add_truck_internal_share(String carnumList)throws Exception {
		Map<String,String> params = new HashMap<String,String>();
		params.put("carnumList",carnumList);
		return G7Util.postRest("/v1/base/truck/add_truck_internal_share", getBodyJsonString.getBodyParams(params));
		
	}
	
	

}
