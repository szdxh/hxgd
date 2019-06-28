package com.hxgd.onemap.g7;

import java.util.HashMap;
import java.util.Map;

import com.hxgd.onemap.util.G7Util;
import com.hxgd.onemap.util.getBodyJsonString;

/**
* @ClassName: Sjjcxx
* @Description: TODO(司机基础信息)
* @author 双子的小坏
* @date 2019年6月25日
*
*/
public class Sjjcxx {
	
	/**
	 * 
	* @Title: create_driver
	* @Description: TODO(增加司机，以司机姓名和机构号增加司机以及详细信息)
	* @param @param driver_name 司机姓名 
	* @param @param orgcode 司机所属机构号
	* @param @param id_card 身份证号
	* @param @param phone 电话号码
	* @param @return
	* @param @throws Exception    参数
	* @return String    返回类型
	* @throws
	 */
	public static String create_driver(String driver_name,String orgcode,String id_card,String phone) throws Exception {
		Map<String,String> params = new HashMap<String,String>();
		params.put("driver_name",driver_name);
		params.put("orgcode", orgcode);
		params.put("id_card", id_card);
		params.put("phone", phone);
		return G7Util.postRest("/v1/base/driver/create_driver", getBodyJsonString.getBodyParams(params));
	}
	
	/**
	 * 
	* @Title: driver_sync
	* @Description: TODO(司机信息增量同步查询某个时间段内有过变动的司机信息)
	* @param @param updatetime 更新时间
	* @param @param orgcode_like 机构号，右匹配
	* @param @return
	* @param @throws Exception    参数
	* @return String    返回类型
	* @throws
	 */
	public static String driver_sync(String updatetime,String orgcode_like) throws Exception {
		Map<String,String> params = new HashMap<String,String>();
		params.put("updatetime",updatetime);
		params.put("orgcode_like", orgcode_like);
		return G7Util.postRest("/v1/base/driver/driver_sync", getBodyJsonString.getBodyParams(params));
	}

	/**
	 * 
	* @Title: edit_driver
	* @Description: TODO(编辑司机，编辑车辆的姓名，身份证号，所属机构号等信息。司机车辆信息不可编辑，只可以解绑和绑定)
	* @param @param driver_id 司机信息id
	* @param @param driver_name 司机姓名
	* @param @param id_card 司机所属机构号
	* @param @param phone 身份证号
	* @param @param orgcode 电话号码
	* @param @return
	* @param @throws Exception    参数
	* @return String    返回类型
	* @throws
	 */
	public static String edit_driver(String driver_id,String driver_name,String id_card,String phone,String orgcode) throws Exception {
		Map<String,String> params = new HashMap<String,String>();
		params.put("driver_id",driver_id);
		params.put("driver_name", driver_name);
		params.put("id_card", id_card);
		params.put("phone", phone);
		params.put("orgcode", orgcode);
		return G7Util.postRest("/v1/base/driver/edit_driver", getBodyJsonString.getBodyParams(params));
	}
	
	/**
	 * 
	* @Title: bind_driver
	* @Description: TODO(司机绑定车辆 操作司机和车辆的绑定，通过车辆的id和司机id绑定关系)
	* @param @param truck_id 车辆id
	* @param @param driver_id 司机id
	* @param @param bind_truck_type 主驾或副驾 1为主驾驶 2为副驾驶
	* @param @return
	* @param @throws Exception    参数
	* @return String    返回类型
	* @throws
	 */
	public static String bind_driver(String truck_id,String driver_id,String bind_truck_type) throws Exception {
		Map<String,String> params = new HashMap<String,String>();
		params.put("truck_id",truck_id);
		params.put("driver_id", driver_id);
		params.put("bind_truck_type", bind_truck_type);
		return G7Util.postRest("/v1/base/driver/bind_driver", getBodyJsonString.getBodyParams(params));
	}
	
	/**
	 * 
	* @Title: driver_list
	* @Description: TODO(查询司机信息 查询司机，返回司机的车辆id，司机姓名，司机身份证号等已经设置和编辑的信息)
	* @param @param updatetime 更新时间
	* @param @param orgcode_like 机构号，右匹配
	* @param @return
	* @param @throws Exception    参数
	* @return String    返回类型
	* @throws
	 */
	public static String driver_list(String updatetime,String orgcode_like) throws Exception {
		Map<String,String> params = new HashMap<String,String>();
		params.put("updatetime",updatetime);
		params.put("orgcode_like", orgcode_like);
		return G7Util.postRest("/v1/base/driver/driver_list", getBodyJsonString.getBodyParams(params));
	}
	
	/**
	 * 
	* @Title: delete_driver
	* @Description: TODO(删除司机，删除指定司机的所有信息)
	* @param @param driver_ids 司机ID，多个ID用,隔开，最多100个
	* @param @param orgcode_like 机构号，右匹配
	* @param @return
	* @param @throws Exception    参数
	* @return String    返回类型
	* @throws
	 */
	public static String delete_driver(String driver_ids,String orgcode_like) throws Exception {
		Map<String,String> params = new HashMap<String,String>();
		params.put("driver_ids",driver_ids);
		params.put("orgcode_like", orgcode_like);
		return G7Util.postRest("/v1/base/driver/delete_driver", getBodyJsonString.getBodyParams(params));
	}


}
