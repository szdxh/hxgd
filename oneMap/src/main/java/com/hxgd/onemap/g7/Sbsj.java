package com.hxgd.onemap.g7;

import java.util.HashMap;
import java.util.Map;

import com.hxgd.onemap.util.G7Util;
import com.hxgd.onemap.util.getBodyJsonString;

/**
* @ClassName: Sbsj
* @Description: TODO(设备数据 设备维度的原始数据，如定位、外接冷链的温度、车辆绑定的设备上传状态等物理数据以及平台计算得到的里程、EMS油耗和油耗报表等事件数据 立即申请 接入指南)
* @author 双子的小坏
* @date 2019年6月28日
*
*/
public class Sbsj {
	
	/**
	 * 
	* @Title: history_location_by_gpsno
	* @Description: TODO(根据设备查询车辆历史轨迹 根据设备查询车辆历史轨迹，返回时间范围内的经纬度点、速度和角度，可以描绘出一组轨迹)
	* @param @param gpsno 设备号，只支持单个
	* @param @param from 开始时间，格式为yyyy-MM-dd HH:mm:ss，时区为GMT+8， 例如：2015-01-01 12:00:00
	* @param @param to 结束时间，格式为yyyy-MM-dd HH:mm:ss，时区为GMT+8， 例如：2015-01-01 12:00:00
	* @param @param map 坐标系类型(支持参数值:baidu.如不传该参数，则默认为火星坐标)
	* @param @param timeInterval 查询时间间隔，10,20,30s ,默认值为10s
	* @param @return
	* @param @throws Exception    参数
	* @return String    返回类型
	* @throws
	 */
	public static String history_location_by_gpsno(String gpsno,String from,String to,String map,String timeInterval) throws Exception {
		Map <String,String>params = new HashMap<String,String>();
		params.put("gpsno", gpsno);
		params.put("from", from);
		params.put("to", to);
		params.put("map", map);
		params.put("timeInterval", timeInterval);
		return G7Util.getRest("/v1/device/truck/history_location_by_gpsno", params);
	}
	
	/**
	* @Title: simple_currents_by_gpsnos
	* @Description: TODO(设备位置和状态查询 查询指定设备的最新位置和状态信息)
	* @param @param gpsnos 设备号(多个设备号之间以“,”号分开,单次调用设备数最多500个)
	* @param @param map 指定返回数据坐标系(非必填，不传，默认返回坐标为GCJ-02；支持’baidu’)
	* @param @param area 传入该参数返回指定区域内的数据(非必填，格式为Lat,lng;lat,lng。查询区域的对角顶点坐标)
	* @param @return
	* @param @throws Exception    参数
	* @return String    返回类型
	* @throws
	 */
	public static String simple_currents_by_gpsnos(String  gpsnos,String  map,String area) throws Exception {
		Map<String,String> params = new HashMap<String,String>();
		params.put("gpsnos", gpsnos);
		params.put("map", map);
		params.put("area", area);
		return G7Util.postRest("/v1/device/equipment/simple_currents_by_gpsnos", getBodyJsonString.getBodyParams(params));
	}
	
	/**
	 * 
	* @Title: list_gpsno_by_status_from_gpslist
	* @Description: TODO(过滤指定状态设备 在一组设备中筛选出指定状态的设备，状态有无法定位、信号中断、未定位、车辆静止、车辆运动中、未启用)
	* @param @param gpsnos 设备号(用’,’ 隔开；单次调用设备数最多50个)
	* @param @param status 支持多个状态，’,’ 隔开；0=无法定位；1=信号中断；2=未定位；3=车辆静止；4=车辆运动中;6=未启用
	* @param @return
	* @param @throws Exception    参数
	* @return String    返回类型
	* @throws
	 */
	public static String list_gpsno_by_status_from_gpslist(String  gpsnos,String  status) throws Exception {
		Map<String,String> params = new HashMap<String,String>();
		params.put("gpsnos", gpsnos);
		params.put("status", status);
		return G7Util.postRest("/v1/device/equipment/list_gpsno_by_status_from_gpslist", getBodyJsonString.getBodyParams(params));
	}
	
	/**
	 * 
	* @Title: getTemperature
	* @Description: TODO(冷库设备温湿度流水 冷库对外温度流水接口)
	* @param @param gpsno 节点编号
	* @param @param starttime 开始时间
	* @param @param endtime 结束时间
	* @param @param pageno 页数
	* @param @param pagesize 一页最多1000条
	* @param @param sortcolumns 排序(time asc / time desc)
	* @param @return
	* @param @throws Exception    参数
	* @return String    返回类型
	* @throws
	 */
	public static String getTemperature(String  gpsno,String  starttime,String endtime,String pageno,String pagesize,String sortcolumns) throws Exception {
		Map<String,String> params = new HashMap<String,String>();
		params.put("gpsno", gpsno);
		params.put("starttime", starttime);
		params.put("endtime", endtime);
		params.put("pageno", pageno);
		params.put("pagesize", pagesize);
		params.put("sortcolumns", sortcolumns);
		return G7Util.postRest("/v1/coldstorage/device/getTemperature", getBodyJsonString.getBodyParams(params));
	}
	
	/**
	 * 
	* @Title: temperature
	* @Description: TODO(温度明细 分页查询温度明细数据)
	* @param @param truckNum  38A722AF85BC91F4D81FB6B8EC709A67AE 车辆标示(sysid+intTruckid)
	* @param @param imei 313000071012931 imei
	* @param @param gpsno 	71012931设备号
	* @param @param from 2016-10-10 00:00:00 开始时间，时间格式 2016-10-10 00:00:00
	* @param @param to 2016-10-10 00:00:00 结束时间，时间格式 2016-10-10 00:00:00
	* @param @param space 是否按一分钟间隔查询数据，1：是，else：否
	* @param @param separate 按时间间隔查询
	* @param @param page_size 单页容量
	* @param @param page_no 当前页数
	* @param @param orderby 排序字段（time desc / time asc）
	* @param @param mars 返回数据中的坐标系，是否使用火星坐标， 1：使用火星坐标 else: 原始坐标
	* @param @return
	* @param @throws Exception    参数
	* @return String    返回类型
	* @throws
	 */
	public static String temperature(String truckNum,String imei,String gpsno,String from,String to,String space,String separate,String page_size,String page_no,String orderby,String mars) throws Exception {
		Map <String,String>params = new HashMap<String,String>();
		params.put("truckNum", truckNum);
		params.put("imei", imei);
		params.put("gpsno", gpsno);
		params.put("from", from);
		params.put("to", to);
		params.put("space", space);
		params.put("separate", separate);
		params.put("page_size", page_size);
		params.put("page_no", page_no);
		params.put("orderby", orderby);
		params.put("mars", mars);
		return G7Util.getRest("/v1/coldchain/daily/temperature", params);
	}
	
	/**
	 * 
	* @Title: simple_currents
	* @Description: TODO(机构所有设备位置和状态查询 查询机构下所有设备的最新位置和状态信息，状态包括定位、状态、温度、等等分类)
	* @param @param orgcode 机构号（包括子机构所有设备）
	* @param @param map 指定返回数据坐标系(不传，默认返回坐标为GCJ-02；支持’baidu’)
	* @param @param area 传入该参数返回指定区域内的数据(格式为Lat,lng;lat,lng。查询区域的对角顶点坐标)
	* @param @return
	* @param @throws Exception    参数
	* @return String    返回类型
	* @throws
	 */
	public static String simple_currents(String orgcode,String map,String area) throws Exception {
		Map <String,String>params = new HashMap<String,String>();
		params.put("orgcode", orgcode);
		params.put("map", map);
		params.put("area", area);
		return G7Util.getRest("/v1/device/equipment/simple_currents", params);
	}
	
	/**
	 * 
	* @Title: list_gpsno_by_status_from_orgcode
	* @Description: TODO(按机构查询指定状态设备列表 根据机构号和指定状态查询设备，状态有无法定位、信号中断、未定位、车辆静止、车辆运动中、未启用)
	* @param @param orgcode 机构号(包含子机构的设备)
	* @param @param status 支持多个状态，’,’ 隔开；0=无法定位；1=信号中断；2=未定位；3=车辆静止；4=车辆运动中;6=未启用
	* @param @return
	* @param @throws Exception    参数
	* @return String    返回类型
	* @throws
	 */
	public static String list_gpsno_by_status_from_orgcode(String orgcode,String status) throws Exception {
		Map <String,String>params = new HashMap<String,String>();
		params.put("orgcode", orgcode);
		params.put("status", status);
		return G7Util.getRest("/v1/device/equipment/list_gpsno_by_status_from_orgcode", params);
	}
	
	/**
	 * 
	* @Title: alertDetail
	* @Description: TODO(冷库温湿度报警明细 冷库温湿度报警事件流水)
	* @param @param starttime 2019-03-01 00:00:00 开始时间
	* @param @param endtime 2019-03-20 00:00:00 结束时间
	* @param @param alarmtype 警报类型：1:高温预警;2高温报警;4:高湿度预警;5:高湿度报警;10:低温预警;11:低温报警;12:低湿度预警;13:低湿度报警
	* @param @param gpsno 节点编号，多个用逗号隔开，最多100个
	* @param @param sname 仓名称，多个用逗号隔开，最多100个
	* @param @param wname 库名称，多个用逗号隔开，最多100个
	* @param @param pageno 那一页
	* @param @param pagesize 一页最多1000条
	* @param @return
	* @param @throws Exception    参数
	* @return String    返回类型
	* @throws
	 */
	public static String alertDetail(String  starttime,String  endtime,String alarmtype,String gpsno,String sname,String wname,String pageno,String pagesize) throws Exception {
		Map<String,String> params = new HashMap<String,String>();
		params.put("starttime", starttime);
		params.put("endtime", endtime);
		params.put("alarmtype", alarmtype);
		params.put("gpsno", gpsno);
		params.put("sname", sname);
		params.put("wname", wname);
		params.put("pageno", pageno);
		params.put("pagesize", pagesize);
		return G7Util.postRest("/v1/coldstorage/alarm/alertDetail", getBodyJsonString.getBodyParams(params));
	}
	
	/**
	 * 
	* @Title: search
	* @Description: TODO(冷库设备查询 设备查询接口)
	* @param @param deviceno 设备号（单个）
	* @param @param devicenos 设备号，（多个）用逗号隔开
	* @param @param onlinestatus 0 - 离线， 1 - 在线
	* @param @param gateway 网关（主机号）
	* @param @param orgcode 机构号
	* @param @return
	* @param @throws Exception    参数
	* @return String    返回类型
	* @throws
	 */
	public static String search(String  deviceno,String  devicenos,String onlinestatus,String gateway,String orgcode) throws Exception {
		Map<String,String> params = new HashMap<String,String>();
		params.put("deviceno", deviceno);
		params.put("devicenos", devicenos);
		params.put("onlinestatus", onlinestatus);
		params.put("gateway", gateway);
		params.put("orgcode", orgcode);
		return G7Util.postRest("/v1/coldstorage/device/search", getBodyJsonString.getBodyParams(params));
	}
	
	/**
	 * 
	* @Title: temperatureCurrents
	* @Description: TODO(当前温度 设备车辆当前温度查询接口)
	* @param @param gpsnos 72000166,72000163 设备号数组|多个用半角逗号隔开(最大50个)
	* @param @param carnums 车牌号数组|多个用半角逗号隔开(最大50个)
	* @param @param truckids 车辆id数组|多个用半角逗号隔开(最大50个)
	* @param @return
	* @param @throws Exception    参数
	* @return String    返回类型
	* @throws
	 */
	public static String temperatureCurrents(String  gpsnos,String  carnums,String truckids) throws Exception {
		Map<String,String> params = new HashMap<String,String>();
		params.put("gpsnos", gpsnos);
		params.put("carnums", carnums);
		params.put("truckids", truckids);
		return G7Util.getRest("/v1/coldchain/daily/temperatureCurrents", params);
	}

}
