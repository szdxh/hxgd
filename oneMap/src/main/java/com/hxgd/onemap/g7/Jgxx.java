package com.hxgd.onemap.g7;

import java.util.HashMap;
import java.util.Map;

import com.hxgd.onemap.util.G7Util;
import com.hxgd.onemap.util.getBodyJsonString;

/**
* @ClassName: Jgxx
* @Description: TODO(购买G7S产品后，G7会为客户开通一个顶级机构，orgcode是机构的唯一标识。机构有顶级机构和子级机构的区别。这里的接口提供操作机构的入口立即申请 )
* @author 双子的小坏
* @date 2019年6月26日
*
*/
public class Jgxx {
	
	/**
	 * 
	* @Title: get_org_by_code
	* @Description: TODO(根据orgcode获取机构信息根据机构号查询机构信息，包括机构编码，机构名称)
	* @param @param orgcode
	* @param @return
	* @param @throws Exception    参数
	* @return String    返回类型
	* @throws
	 */
	public static String get_org_by_code(String orgcode) throws Exception {
		Map<String,String> params = new HashMap<String,String>();
		params.put("orgcode", orgcode);
		return G7Util.postRest("/v1/base/org/get_org_by_code", getBodyJsonString.getBodyParams(params));
		
	}
	
	/**
	 * 
	* @Title: getRoleResourceBySubsystemCode
	* @Description: TODO(获取角色资源根据子系统代码获取角色资源（一级菜单列表）)
	* @param @param roleid 角色id
	* @param @param product_code 产品编码
	* @param @return
	* @param @throws Exception    参数
	* @return String    返回类型
	* @throws
	 */
	public static String getRoleResourceBySubsystemCode(String roleid,String product_code) throws Exception {
		Map<String,String> params = new HashMap<String,String>();
		params.put("roleid", roleid);
		params.put("product_code", product_code);
		return G7Util.postRest("/v1/base/RoleResource/getRoleResourceBySubsystemCode", getBodyJsonString.getBodyParams(params));
		
	}
	
	/**
	 * 
	* @Title: getUserByUserName
	* @Description: TODO(获取用户信息(username)根据username获取用户信息)
	* @param @param username 用户名
	* @param @return
	* @param @throws Exception    参数
	* @return String    返回类型
	* @throws
	 */
	public static String getUserByUserName(String username) throws Exception {
		Map<String,String> params = new HashMap<String,String>();
		params.put("username", username);
		return G7Util.getRest("/v1/base/User/getUserByUserName", params);
	}
	
	/**
	 * 
	* @Title: validate
	* @Description: TODO(接口权限验证 权限验证：根据用户token和url，subsystem来验证)
	* @param @param subsystem 产品code
	* @param @param _TOKEN 用户token
	* @param @param url 需要验证的路径
	* @param @return
	* @param @throws Exception    参数
	* @return String    返回类型
	* @throws
	 */
	public static String validate(String subsystem,String _TOKEN,String url) throws Exception {
		Map<String,String> params = new HashMap<String,String>();
		params.put("subsystem", subsystem);
		params.put("_TOKEN", _TOKEN);
		params.put("url", url);
		return G7Util.postRest("/v1/base/auth/validate", getBodyJsonString.getBodyParams(params));
	}
	
	/**
	 * 
	* @Title: create
	* @Description: TODO(创建用户)
	* @param @param orgcode 机构号
	* @param @param roleId 角色id
	* @param @param username 用户名/登陆名
	* @param @param password 	密码
	* @param @param realname 	真实姓名,10字以内
	* @param @return
	* @param @throws Exception    参数
	* @return String    返回类型
	* @throws
	 */
	public static String create(String orgcode,String roleId,String username,String password,String realname) throws Exception {
		Map<String,String> params = new HashMap<String,String>();
		params.put("orgcode", orgcode);
		params.put("roleId", roleId);
		params.put("username", username);
		params.put("password", password);
		params.put("realname", realname);
		return G7Util.postRest("/v1/ucenter/user/create", getBodyJsonString.getBodyParams(params));
	}
	
	/**
	 * 
	* @Title: createSubOrgan
	* @Description: TODO(创建子机构)
	* @param @param parent 	上级机构号
	* @param @param name 机构名,50字以内
	* @param @param contact 机构联系人,50字以内
	* @param @param tel 	机构联系号码
	* @param @param address 	机构地址,100字以内
	* @param @param remark 备注,100字以内
	* @param @return
	* @param @throws Exception    参数
	* @return String    返回类型
	* @throws
	 */
	public static String createSubOrgan(String parent,String name,String contact,String tel,String address,String remark) throws Exception {
		Map<String,String> params = new HashMap<String,String>();
		params.put("parent", parent);
		params.put("name", name);
		params.put("contact", contact);
		params.put("tel", tel);
		params.put("address", address);
		params.put("remark", remark);
		return G7Util.postRest("/v1/ucenter/organ/createSubOrgan", getBodyJsonString.getBodyParams(params));
	}
	
	/**
	 * 
	* @Title: getRoleSubsystem
	* @Description: TODO(获取角色子系统  获取角色子系统（顶级菜单）)
	* @param @param roleid 角色id
	* @param @return
	* @param @throws Exception    参数
	* @return String    返回类型
	* @throws
	 */
	public static String getRoleSubsystem(String roleid) throws Exception {
		Map<String,String> params = new HashMap<String,String>();
		params.put("roleid", roleid);
		return G7Util.postRest("/v1/base/RoleResource/getRoleSubsystem", getBodyJsonString.getBodyParams(params));
	}
	
	/**
	 * 
	* @Title: getRoleResourceByParentId
	* @Description: TODO(获取子级菜单列表 根据父资源ID获取子级菜单列表（二级或者二级以下的菜单列表）)
	* @param @param roleid 角色id
	* @param @param product_code 产品编码
	* @param @param parent_resource_id 父级资源ID
	* @param @return
	* @param @throws Exception    参数
	* @return String    返回类型
	* @throws
	 */
	public static String getRoleResourceByParentId(String roleid,String product_code,String parent_resource_id) throws Exception {
		Map<String,String> params = new HashMap<String,String>();
		params.put("roleid", roleid);
		params.put("product_code", product_code);
		params.put("parent_resource_id", parent_resource_id);
		return G7Util.postRest("/v1/base/RoleResource/getRoleResourceByParentId", getBodyJsonString.getBodyParams(params));
	}
	
	/**
	 * 
	* @Title: getUserByToken
	* @Description: TODO(获取用户信息(token) 根据token获取用户信息)
	* @param @param _TOKEN 用户TOKEN
	* @param @return
	* @param @throws Exception    参数
	* @return String    返回类型
	* @throws
	 */
	public static String getUserByToken(String _TOKEN) throws Exception {
		Map<String,String> params = new HashMap<String,String>();
		params.put("_TOKEN", _TOKEN);
		return G7Util.getRest("/v1/base/User/getUserByToken", params);
	}
	
	/**
	 * 
	* @Title: getUserByIdList
	* @Description: TODO(获取用户信息(id) 根据id获取用户信息，支持批量)
	* @param @param id 用户帐号id，多个用英文,隔开,最多50个
	* @param @return
	* @param @throws Exception    参数
	* @return String    返回类型
	* @throws
	 */
	public static String getUserByIdList(String id) throws Exception {
		Map<String,String> params = new HashMap<String,String>();
		params.put("id", id);
		return G7Util.postRest("/v1/base/User/getUserByIdList", getBodyJsonString.getBodyParams(params));
	}
	
	/**
	 * 
	* @Title: delete
	* @Description: TODO(删除用户)
	* @param @param uid 用户id
	* @param @return
	* @param @throws Exception    参数
	* @return String    返回类型
	* @throws
	 */
	public static String delete(String uid) throws Exception {
		Map<String,String> params = new HashMap<String,String>();
		params.put("uid", uid);
		return G7Util.postRest("/v1/ucenter/user/delete", getBodyJsonString.getBodyParams(params));
	}
	
	/**
	 * 
	* @Title: getAllByOrgcodee
	* @Description: TODO(查询机构的角色 返回角色列表)
	* @param @param uid
	* @param @return
	* @param @throws Exception    参数
	* @return String    返回类型
	* @throws
	 */
	public static String getAllByOrgcodee(String orgcode,String marker,String limit) throws Exception {
		Map<String,String> params = new HashMap<String,String>();
		params.put("orgcode", orgcode);
		params.put("marker", marker);
		params.put("limit", limit);
		return G7Util.getRest("/v1/ucenter/role/getAllByOrgcodee", params);
	}
	
	/**
	 * 
	* @Title: getAllSubOrgans
	* @Description: TODO(查询子机构 支持跨级查询子机构)
	* @param @param parent 父级机构号
	* @param @param marker 分页标识符
	* @param @param limit 分页数，最大100，默认10
	* @param @return
	* @param @throws Exception    参数
	* @return String    返回类型
	* @throws
	 */
	public static String getAllSubOrgans(String parent,String marker,String limit) throws Exception {
		Map<String,String> params = new HashMap<String,String>();
		params.put("parent", parent);
		params.put("marker", marker);
		params.put("limit", limit);
		return G7Util.getRest("/v1/ucenter/organ/getAllSubOrgans", params);
	}


}
