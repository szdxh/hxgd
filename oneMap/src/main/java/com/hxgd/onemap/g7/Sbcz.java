package com.hxgd.onemap.g7;

import java.util.HashMap;
import java.util.Map;

import com.hxgd.onemap.util.G7Util;
import com.hxgd.onemap.util.getBodyJsonString;

/**
* @ClassName: Sbcz
* @Description: TODO(对设备的操作接口，实现和设备的交互)
* @author 双子的小坏
* @date 2019年6月28日
*
*/
public class Sbcz {
	
	/**
	 * 
	* @Title: bind_device
	* @Description: TODO(车辆设备绑定 将设备和车辆进行绑定操作)
	* @param @param truck_id 车辆id
	* @param @param truck_own_id 车辆OWN id
	* @param @param gpsno 设备号
	* @param @return
	* @param @throws Exception    参数
	* @return String    返回类型
	* @throws
	 */
	public static String bind_device(String  truck_id,String  truck_own_id,String gpsno) throws Exception {
		Map<String,String> params = new HashMap<String,String>();
		params.put("truck_id", truck_id);
		params.put("truck_own_id", truck_own_id);
		params.put("gpsno", gpsno);
		return G7Util.postRest("/v1/base/device/bind_device", getBodyJsonString.getBodyParams(params));
	}
	
	/**
	 * 
	* @Title: send_voice
	* @Description: TODO(语音下发 操作下设备下发语音，设备可以实现语音播报)
	* @param @param plate_num 车牌号，单次调用只支持单车，账号对应机构所属或共享车辆
	* @param @param txt 待下发语音内容。语音下发一般与业务关联，延时下发没有意义。所以默认只会下发一次，如果设备离线，则不会再次下发。
	* @param @return
	* @param @throws Exception    参数
	* @return String    返回类型
	* @throws
	 */
	public static String send_voice(String  plate_num,String  txt) throws Exception {
		Map<String,String> params = new HashMap<String,String>();
		params.put("plate_num", plate_num);
		params.put("txt", txt);
		return G7Util.postRest("/v1/device/message/send_voice", getBodyJsonString.getBodyParams(params));
	}
	
	/**
	 * 
	* @Title: real_time_url
	* @Description: TODO(实时视频查询 操作设备回传实时视频)
	* @param @param plate_num 查询的车牌号，只支持单个
	* @param @return
	* @param @throws Exception    参数
	* @return String    返回类型
	* @throws
	 */
	public static String real_time_url(String  plate_num) throws Exception {
		Map<String,String> params = new HashMap<String,String>();
		params.put("plate_num", plate_num);
		return G7Util.getRest("/v1/media/video/real_time_url", params);
	}
	
	/**
	 * 
	* @Title: setting
	* @Description: TODO(车辆设备解绑 将设备和车辆进行解绑操作)
	* @param @param device_list 设备与车辆ID列表，或者设备与车辆OWN ID列表，JSON格式,注意：body参数会被整体json解析，所以如果参数中的值需要传入json格式则需要反转义参数值中json的双引号
	* @param @param orgcode 机构号
	* @param @return
	* @param @throws Exception    参数
	* @return String    返回类型
	* @throws
	 */
	public static String setting(String  device_list,String  orgcode) throws Exception {
		Map<String,String> params = new HashMap<String,String>();
		params.put("device_list", device_list);
		params.put("orgcode", orgcode);
		return G7Util.postRest("/v1/base/device/unbind_device", getBodyJsonString.getBodyParams(params));
	}
	
	/**
	 * 
	* @Title: send_result
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @param message_id 消息id
	* @param @return
	* @param @throws Exception    参数
	* @return String    返回类型
	* @throws
	 */
	public static String send_result(String  message_id) throws Exception {
		Map<String,String> params = new HashMap<String,String>();
		params.put("message_id", message_id);
		return G7Util.getRest("/v1/device/message/send_result", params);
	}
	
	/**
	 * 
	* @Title: update_orgcode
	* @Description: TODO(设备机构号更新 更新设备机构号，实现变更设备使用机构的操作)
	* @param @param gpsno 设备号(必填)
	* @param @param orgcode 需要更改成的组织机构号，只能是同一顶级机构下的子机构(必填)
	* @param @return
	* @param @throws Exception    参数
	* @return String    返回类型
	* @throws
	 */
	public static String update_orgcode(String  gpsno,String  orgcode) throws Exception {
		Map<String,String> params = new HashMap<String,String>();
		params.put("gpsno", gpsno);
		params.put("orgcode", orgcode);
		return G7Util.postRest("/v1/device/equipment/update_orgcode", getBodyJsonString.getBodyParams(params));
	}
	

}
