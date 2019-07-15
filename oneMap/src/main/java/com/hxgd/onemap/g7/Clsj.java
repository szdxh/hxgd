package com.hxgd.onemap.g7;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hxgd.onemap.util.G7Util;
import com.hxgd.onemap.util.getBodyJsonString;

/**
* @ClassName: Clsj
* @Description: TODO(车辆维度的原始数据，如定位、外接冷链的温度、车辆绑定的设备上传状态等物理数据以及平台计算得到的里程、EMS油耗和油耗报表等事件数据)
* @author 双子的小坏
* @date 2019年6月26日
*
*/
public class Clsj {
	
	/**
	 * 
	* @Title: aa
	* @Description: TODO(车辆历史轨迹查询 车辆历史轨迹查询，返回时间范围内的经纬度点、速度和角度，可以描绘出一组轨迹。 分页实现：查询返回单页条数限制为1000，根据本页查询得到的最后一条数据的时间加1秒作为下一页查询的开始时间(from)。)
	* @param @param plate_num 车牌号
	* @param @param from 开始时间，格式为yyyy-MM-dd HH:mm:ss，时区为GMT+8， 例如：2015-01-01 12:00:00
	* @param @param to 结束时间，格式为yyyy-MM-dd HH:mm:ss，时区为GMT+8， 例如：2015-01-01 12:00:00
	* @param @param map 坐标系类型(支持参数值:baidu.如不传该参数，则默认为火星坐标)
	* @param @param timeInterval 查询时间间隔，10,20,30s ,默认值为10s
	* @param @return
	* @param @throws Exception    参数
	* @return String    返回类型
	* @throws
	 */
	public static String history_location(String plate_num,String from,String to,String map,String timeInterval) throws Exception {
		Map <String,String>params = new HashMap<String,String>();
		params.put("plate_num", plate_num);
		params.put("from", from);
		params.put("to", to);
		params.put("map", map);
		params.put("timeInterval", timeInterval);
		return G7Util.getRest("/v1/device/truck/history_location", params);
	}
	
	/**
	 * 
	* @Title: mileage_daily
	* @Description: TODO(车辆GPS每日里程查询 车辆GPS每日里程查询，查询时间范围内的每天里程统计)
	* @param @param plate_num 车牌号，只支持单车调用
	* @param @param from 查询时间段开始，格式为yyyy-MM-dd，时区为GMT+8, 例如：2017-01-01。单次调用开始结束时间间隔最长不超过31天，超过31天报错。
	* @param @param to 查询时间段结束，格式为yyyy-MM-dd，时区为GMT+8, 例如：2017-01-01。
	* @param @return
	* @param @throws Exception    参数
	* @return String    返回类型
	* @throws
	 */
	public static String mileage_daily(String plate_num,String from,String to) throws Exception {
		Map <String,String>params = new HashMap<String,String>();
		params.put("plate_num", plate_num);
		params.put("from", from);
		params.put("to", to);
		return G7Util.getRest("/v1/device/truck/mileage_daily", params);
	}
	
	/**
	 * 
	* @Title: current_info_by_gpsno
	* @Description: TODO(根据设备查询车辆状态 批量车辆状态查询，批量返回车辆状态包括定位、状态、温度、等等)
	* @param @param gpsno 设备号(单次单设备调用)
	* @param @param fields 返回附加信息(loc:位置信息，status:状态信息，cold:冷链信息，driver:司机信息)
	* @param @param addr_required 是否解析中文地址(不传，默认False不解析；True，解析中文地址)
	* @param @return
	* @param @throws Exception    参数
	* @return String    返回类型
	* @throws
	 */
	public static String current_info_by_gpsno(String gpsno,String fields,String addr_required) throws Exception {
		Map <String,String>params = new HashMap<String,String>();
		params.put("gpsno", gpsno);
		params.put("fields", fields);
		params.put("addr_required", addr_required);
		return G7Util.getRest("/v1/device/truck/current_info_by_gpsno", params);
	}
	

	
	/**
	 * 
	* @Title: truck_travel
	* @Description: TODO(车辆期间报表查询 车辆期间报表查询，车辆维度在时间范围内EMS数据统计)
	* @param @param orgcode 机构编号
	* @param @param carnum 车牌号,多个车牌号之间以“,”号给开，最多20个
	* @param @param from 查询开始时间,日期格式为yyyy-MM-dd HH:mm:ss
	* @param @param to 查询结束时间,日期格式为yyyy-MM-dd HH:mm:ss
	* @param @param pageNum 第几页,页数从1开始
	* @param @param pageSize 分页大小,每页最大1000
	* @param @return
	* @param @throws Exception    参数
	* @return String    返回类型
	* @throws
	 */
	public static String truck_travel(String orgcode,String carnum,String from,String to,String pageNum,String pageSize) throws Exception {
		Map <String,String>params = new HashMap<String,String>();
		params.put("orgcode", orgcode);
		params.put("carnum", carnum);
		params.put("from", from);
		params.put("to", to);
		params.put("pageNum", pageNum);
		params.put("pageSize", pageSize);
		return G7Util.getRest("/v1/device/ems/truck_travel", params);
	}
	
	/**
	 * 
	* @Title: gps_event
	* @Description: TODO(平台事件查询 包括停留点、进出区域、超速报警、疲劳驾驶报警等事件)
	* @param @param plate_num 车牌号，只支持单车调用
	* @param @param from 查询时间段开始，按停留开始时间查询，格式为yyyy-MM-dd HH:mm:ss，时区为GMT+8, 例如：2017-01-01 12:00:00。单次调用开始结束时间间隔最长不超过7天，超过7天，默认以查询时间段开始+7天作为结束时间查询。
	* @param @param to 查询时间段结束，按停留开始时间查询，格式为yyyy-MM-dd HH:mm:ss，时区为GMT+8, 例如：2017-01-01 12:00:00。
	* @param @param types 事件类型。使用","(逗号)号分割多个type，目前支持：1:点火事件；9:停留点事件。
	* @param @param limit 返回最大条数，范围1-1000，默认100
	* @param @return
	* @param @throws Exception    参数
	* @return String    返回类型
	* @throws
	 */
	public static String gps_event(String plate_num,String from,String to,String types,String limit) throws Exception {
		Map <String,String>params = new HashMap<String,String>();
		params.put("plate_num", plate_num);
		params.put("from", from);
		params.put("to", to);
		params.put("types", types);
		params.put("limit", limit);
		return G7Util.getRest("/v1/device/event/gps_event", params);
	}
	
	/**
	 * 
	* @Title: getLoadDetailList
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @param carnum_hang 车辆车牌号
	* @param @param from 查询开始时间戳
	* @param @param to 查询结束时间戳
	* @param @param pageNo 页数
	* @param @param pageSize 每页展示数据量
	* @param @return
	* @param @throws Exception    参数
	* @return String    返回类型
	* @throws
	 */
	public static String getLoadDetailList(String carnum_hang,String from,String to,String pageNo,String pageSize) throws Exception {
		Map<String,String> params = new HashMap<String,String>();
		params.put("carnum_hang", carnum_hang);
		params.put("from", from);
		params.put("to", to);
		params.put("pageNo", pageNo);
		params.put("pageSize", pageSize);
		return G7Util.postRest("/v1/device/index/getLoadDetailList", getBodyJsonString.getBodyParams(params));
	}
	
	/**
	 * 
	* @Title: current_location
	* @Description: TODO(车辆当前定位V1.0)
	* @param @param plate_num 车牌号
	* @param @param map 坐标系类型(支持参数值:baidu.如不传该参数，则默认为火星坐标)
	* @param @return
	* @param @throws Exception    参数
	* @return String    返回类型
	* @throws
	 */
	public static String current_location(String plate_num) throws Exception {
		Map <String,String>params = new HashMap<String,String>();
		params.put("plate_num", plate_num);
		params.put("map", "baidu");
		return G7Util.getRest("/v1/device/truck/current_location", params);
	}
	
	/**
	 * 
	* @Title: get_event_truck
	* @Description: TODO(区域进出在岗车辆 区域进出在岗车辆查询接口)
	* @param @param from 进区时间
	* @param @param to 出区时间
	* @param @param orgcode 机构号码
	* @param @param oids 标注点id
	* @param @return
	* @param @throws Exception    参数
	* @return String    返回类型
	* @throws
	 */
	public static String get_event_truck(String from,String to,String orgcode,String oids) throws Exception {
		Map<String,String> params = new HashMap<String,String>();
		params.put("from", from);
		params.put("to", to);
		params.put("orgcode", orgcode);
		params.put("oids", oids);
		return G7Util.postRest("/v1/truck/event/get_event_truck", getBodyJsonString.getBodyParams(params));
	}
	
	
	public static String batch(String plate_nums,String fields)throws Exception {
		Map<String,String> params = new HashMap<String,String>();
		params.put("plate_nums",plate_nums );
		params.put("fields", fields);
		return G7Util.postRest("/v1/device/truck/current_info/batch", getBodyJsonString.getBodyArrParams(params));
	}
	
	/**
	 * 
	* @Title: playback_stream_by_gpsno
	* @Description: TODO(实时视频-获取回放地址)
	* @param @param gpsno gpsno
	* @param @param channelNo 通道号
	* @param @param memType 存储器类型0：未知 1:主存储器，2:灾备存储器
	* @param @param streamType 码流类型 1:主码流，2:子码流
	* @param @param avitemType 音视频资源类型:0:音视频，1:音频，2:视频
	* @param @param from 开始时间
	* @param @param to 结束时间
	* @param @return
	* @param @throws Exception    参数
	* @return String    返回类型
	* @throws
	 */
	public static String playback_stream_by_gpsno(String gpsno,String channelNo,String memType,String streamType,String avitemType,String from,String to) throws Exception {
		Map <String,String>params = new HashMap<String,String>();
		params.put("gpsno", gpsno);
		params.put("channelNo", channelNo);
		params.put("memType", memType);
		params.put("streamType", streamType);
		params.put("avitemType", avitemType);
		params.put("from", from);
		params.put("to", to);
		return G7Util.getRest("/v1/device/video/playback_stream_by_gpsno", params);
	}
	
	/**
	 * 
	* @Title: playback_calendar_by_carnum
	* @Description: TODO(实时视频-获取回放视频月历信息 获取回放视频月历信息)
	* @param @param carnum
	* @param @param orgcode
	* @param @param from
	* @param @return
	* @param @throws Exception    参数
	* @return String    返回类型
	* @throws
	 */
	public static String playback_calendar_by_carnum(String carnum,String orgcode,String from) throws Exception {
		Map <String,String>params = new HashMap<String,String>();
		params.put("carnum", carnum);
		params.put("orgcode", orgcode);
		params.put("from", from);
		return G7Util.getRest("/v1/device/video/playback_calendar_by_carnum", params);
	}
	
	/**
	 * 
	* @Title: query_event_by_start_time
	* @Description: TODO(事件多媒体数据查询 根据终端事件类型获取事件相关的多媒体数据)
	* @param @param name
	* @param @return
	* @param @throws Exception    参数
	* @return String    返回类型
	* @throws
	 */
	public static String query_event_by_start_time(String name) throws Exception {
		Map<String,String> params = new HashMap<String,String>();
		params.put("name", name);
		return G7Util.postRest("/v1/device/event/query_event_by_start_time", getBodyJsonString.getBodyParams(params));
	}
	
	/**
	 * 
	* @Title: mileage
	* @Description: TODO(车辆GPS总里程查询 车辆GPS总里程查询，查询时间范围内的总里程)
	* @param @param plate_num 车牌号，只支持单车调用
	* @param @param from 查询时间段开始，格式为yyyy-MM-dd HH:mm:ss，时区为GMT+8, 例如：2017-01-01 12:00:00。单次调用开始结束时间间隔最长不超过31天，超过31天报错。
	* @param @param to 查询结束时间，格式为yyyy-MM-dd HH:mm:ss，时区为GMT+8, 例如：2017-01-01 12:00:00。
	* @param @return
	* @param @throws Exception    参数
	* @return String    返回类型
	* @throws
	 */
	public static String mileage(String plate_num,String from,String to) throws Exception {
		Map <String,String>params = new HashMap<String,String>();
		params.put("plate_num", plate_num);
		params.put("from", from);
		params.put("to", to);
		return G7Util.getRest("/v1/device/truck/mileage", params);
	}
	
	/**
	 * 
	* @Title: current_info
	* @Description: TODO(车辆状态查询 车辆状态查询，查询单车的车辆状态包括定位、状态、温度、等等)
	* @param @param plate_num 车牌号(单次单车调用)
	* @param @param fields 返回附加信息(loc:位置信息，status:状态信息，cold:冷链信息，driver:司机信息)
	* @param @param addr_required 是否解析中文地址(不传，默认False不解析；True，解析中文地址)
	* @param @return
	* @param @throws Exception    参数
	* @return String    返回类型
	* @throws
	 */
	public static String driver_travel(String plate_num,String fields,String addr_required) throws Exception {
		Map <String,String>params = new HashMap<String,String>();
		params.put("plate_num", plate_num);
		params.put("fields", fields);
		params.put("addr_required", addr_required);
		return G7Util.getRest("/v1/device/ems/driver_travel", params);
	}
	
	/**
	 * 
	* @Title: current_info
	* @Description: TODO(司机期间报表查询  司机期间报表查询，司机维度在时间范围内EMS数据统计)
	* @param @param orgcode 机构编号
	* @param @param drivername 司机名称,多个司机名称之间以“,”号给开，最多20个
	* @param @param from 查询开始时间,日期格式为yyyy-MM-dd HH:mm:ss
	* @param @param to 查询结束时间,日期格式为yyyy-MM-dd HH:mm:ss
	* @param @param pageNum 第几页,页数从1开始
	* @param @param pageSize 分页大小,每页最大1000
	* @param @return
	* @param @throws Exception    参数
	* @return String    返回类型
	* @throws
	 */
	public static String current_info(String orgcode,String drivername,String from,String to,String pageNum,String pageSize) throws Exception {
		Map <String,String>params = new HashMap<String,String>();
		params.put("orgcode", orgcode);
		params.put("drivername", drivername);
		params.put("from", from);
		params.put("to", to);
		params.put("pageNum", pageNum);
		params.put("pageSize", pageSize);
		return G7Util.getRest("/v1/device/truck/current_info", params);
	}
	
	/**
	 * 
	* @Title: truck_travel_detail
	* @Description: TODO(车辆行程明细查询 车辆行程明细查询，司机行程内EMS数据统计分类)
	* @param @param orgcode 机构编号
	* @param @param carnum  车牌号,多个车牌号之间以“,”号给开，最多20个
	* @param @param from 查询开始时间,日期格式为yyyy-MM-dd HH:mm:ss
	* @param @param to 查询结束时间,日期格式为yyyy-MM-dd HH:mm:ss
	* @param @param pageNum 第几页,页数从1开始
	* @param @param pageSize 分页大小,每页最大1000
	* @param @return
	* @param @throws Exception    参数
	* @return String    返回类型
	* @throws
	 */
	public static String truck_travel_detail(String orgcode,String carnum,String from,String to,String pageNum,String pageSize) throws Exception {
		Map <String,String>params = new HashMap<String,String>();
		params.put("orgcode", orgcode);
		params.put("drivername", carnum);
		params.put("from", from);
		params.put("to", to);
		params.put("pageNum", pageNum);
		params.put("pageSize", pageSize);
		return G7Util.getRest("/v1/device/ems/truck_travel_detail", params);
	}
	
	/**
	 * 
	* @Title: fuel
	* @Description: TODO(EMS油耗查询 EMS（Engine Management System）油耗查询)
	* @param @param plate_num 车牌号(单个车牌号)
	* @param @param from 开始时间，跨度小于等于7天（最多一周）格式为yyyy-MM-dd HH:mm:ss，时区为GMT+8， 例如：2015-01-01 12:00:00
	* @param @param to 结束时间，格式为yyyy-MM-dd HH:mm:ss，时区为GMT+8， 例如：2015-01-01 12:00:00
	* @param @return
	* @param @throws Exception    参数
	* @return String    返回类型
	* @throws
	 */
	public static String fuel(String plate_num,String from,String to) throws Exception {
		Map <String,String>params = new HashMap<String,String>();
		params.put("plate_num", plate_num);
		params.put("from", from);
		params.put("from", from);
		params.put("to", to);
		return G7Util.getRest("/v1/device/truck/fuel", params);
	}
	
	/**
	 * 
	* @Title: truck_event
	* @Description: TODO(查询车辆事件报表 此接口给开放平台使用)
	* @param @param carnums 车牌号和支持的事件ID,多个条件之间以','号分割,车牌号和事件ID之间用':',事件ID之间用';'，例如：京A12345:19;28,京B23456:51;52,京P34567:52
	* @param @param alarmtypes 事件id，多个事件ID用“,”号分割，车辆默认的事件id列表{6:转速过高,7:急刹车,21:司机登签,22:司机退签,26:停留超时,27:怠速,28:超速,29:疲劳驾驶,601:司机未登签,30:空档滑行,41:急加速,45:风险入弯,117:行程开始结束,271:PTO怠速,272:暖车怠速,301:紧急刹车,302:异常怠速,304:发动机水温过高,310:机油压力低}
	* @param @param from 查询开始时间,日期格式为yyyy-MM-dd HH:mm:ss
	* @param @param to 查询结束时间,日期格式为yyyy-MM-dd HH:mm:ss
	* @param @param pageNum 第几页,页数从1开始
	* @param @param pageSize 分页大小,每页最大1000
	* @param @param orderby 排序字段，startTime：事件开始时间，truckId：车牌，alarmtype：事件类型
	* @param @param order 升序还是降序,asc:升序，desc:降序
	* @param @return
	* @param @throws Exception    参数
	* @return String    返回类型
	* @throws
	 */
	public static String truck_event(String carnums,String alarmtypes, String from ,String to, String pageNum,String pageSize,String orderby,String order) throws Exception {
		Map <String,String>params = new HashMap<String,String>();
		params.put("carnums", carnums);
		params.put("alarmtypes", alarmtypes);
		params.put("from", from);
		params.put("pageNum", pageNum);
		params.put("pageSize", pageSize);
		params.put("orderby", orderby);
		params.put("order", order);
		return G7Util.getRest("/v1/ems-openapi/ems/truck_event", params);
	}

	/**
	 * 
	* @Title: getTruckMileage
	* @Description: TODO(获取车辆任意时间段的里程 获取车辆任意时间段的里程)
	* @param @param truckIds 38370AEB34CF12CDB58D747C0FF7D0B61D 车辆编号，多个车辆以逗号隔开
	* @param @param startDate 2017-03-16 04:57:47 开始时间
	* @param @param endDate 2017-03-17 04:57:47 结束时间
	* @param @return
	* @param @throws Exception    参数
	* @return String    返回类型
	* @throws
	 */
	public static String getTruckMileage(String  truckIds,String  startDate,String endDate) throws Exception {
		Map<String,String> params = new HashMap<String,String>();
		params.put("truckIds", truckIds);
		params.put("startDate", startDate);
		params.put("endDate", endDate);
		return G7Util.postRest("/v1/device/gps/getTruckMileage", getBodyJsonString.getBodyParams(params));
	}
	
	/**
	* @Title: playback_control_by_gpsno
	* @Description: TODO(实时视频-回放控制 回放控制)
	* @param @param gpsno gpsno
	* @param @param channelNo 通道号
	* @param @param control 控制命令 0-正常回放 1-暂停 2-结束 3-快进 4-快退 5-拖动
	* @param @param quickType 快进或快退倍数 0-无效 1-1倍 2-2倍 3-4倍 4-8倍 5-16倍 control=3|4时有效
	* @param @param positionTime 拖动位置 格式：yyyy-MM-dd HH:mm:ss control=5时有效
	* @param @return
	* @param @throws Exception    参数
	* @return String    返回类型
	* @throws
	 */
	public static String playback_control_by_gpsno(String gpsno,String channelNo, String control ,String quickType, String positionTime) throws Exception {
		Map <String,String>params = new HashMap<String,String>();
		params.put("gpsno", gpsno);
		params.put("channelNo", channelNo);
		params.put("control", control);
		params.put("quickType", quickType);
		params.put("positionTime", positionTime);
		return G7Util.getRest("/v1/device/video/playback_control_by_gpsno", params);
	}
	
	/**
	 * 
	* @Title: playback_file_by_carnum
	* @Description: TODO(实时视频-获取回放文件列表 获取回放文件列表)
	* @param @param carnum 车牌号
	* @param @param orgcode 机构号
	* @param @param from 开始时间|格式为 yyyy-MM-dd HH:mm:ss
	* @param @param to 开始时间|格式为 yyyy-MM-dd HH:mm:ss
	* @param @return
	* @param @throws Exception    参数
	* @return String    返回类型
	* @throws
	 */
	public static String playback_file_by_carnum(String carnum,String orgcode, String from ,String to) throws Exception {
		Map <String,String>params = new HashMap<String,String>();
		params.put("carnum", carnum);
		params.put("orgcode", orgcode);
		params.put("from", from);
		params.put("to", to);
		return G7Util.getRest("/v1/device/video/playback_file_by_carnum", params);
	}
	
	/**
	 * 
	* @Title: real_time_by_carnum
	* @Description: TODO(实时视频-根据车牌获取实时视频连接 根据车牌获取实时视频连接)
	* @param @param carnum 车牌号
	* @param @param orgcode 机构号
	* @param @return
	* @param @throws Exception    参数
	* @return String    返回类型
	* @throws
	 */
	public static String real_time_by_carnum(String carnum,String orgcode) throws Exception {
		Map <String,String>params = new HashMap<String,String>();
		params.put("carnum", carnum);
		params.put("orgcode", orgcode);
		return G7Util.getRest("/v1/device/video/real_time_by_carnum", params);
	}
	
	/**
	 * 
	* @Title: getTruckRiskByOrgcodes
	* @Description: TODO(根据机构号获取车辆高风险信息 通过机构号、时间范围获取车辆的高风险及其坐标信息)
	* @param @param orgcodes 201KBK01 机构号
	* @param @param from 2019-05-13 09:00:00 开始时间
	* @param @param to 2019-05-13 09:30:00 结束时间
	* @param @param pageNo 1 页号
	* @param @param pageSize 10 页条数
	* @param @return
	* @param @throws Exception    参数
	* @return String    返回类型
	* @throws
	 */
	public static String getTruckRiskByOrgcodes(String  orgcodes,String  from,String to,String pageNo,String pageSize) throws Exception {
		Map<String,String> params = new HashMap<String,String>();
		params.put("orgcodes", orgcodes);
		params.put("from", from);
		params.put("to", to);
		params.put("pageNo", pageNo);
		params.put("pageSize", pageSize);
		return G7Util.postRest("/v1/sos-producer/risk/getTruckRiskByOrgcodes", getBodyJsonString.getBodyParams(params));
	}
	
	



}
