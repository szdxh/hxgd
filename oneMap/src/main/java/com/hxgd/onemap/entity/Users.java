package com.hxgd.onemap.entity;

import javax.persistence.*;

public class Users {
    @Id
    private Integer id;

    @Column(name = "eova_id")
    private Integer eovaId;

    /**
     * 登录账户
     */
    @Column(name = "login_id")
    private String loginId;

    /**
     * 录登密码
     */
    @Column(name = "login_pwd")
    private String loginPwd;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 角色id
     */
    private Integer rid;

    private String shenfenid;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return eova_id
     */
    public Integer getEovaId() {
        return eovaId;
    }

    /**
     * @param eovaId
     */
    public void setEovaId(Integer eovaId) {
        this.eovaId = eovaId;
    }

    /**
     * 获取登录账户
     *
     * @return login_id - 登录账户
     */
    public String getLoginId() {
        return loginId;
    }

    /**
     * 设置登录账户
     *
     * @param loginId 登录账户
     */
    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    /**
     * 获取录登密码
     *
     * @return login_pwd - 录登密码
     */
    public String getLoginPwd() {
        return loginPwd;
    }

    /**
     * 设置录登密码
     *
     * @param loginPwd 录登密码
     */
    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    /**
     * 获取昵称
     *
     * @return nickname - 昵称
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 设置昵称
     *
     * @param nickname 昵称
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * 获取角色id
     *
     * @return rid - 角色id
     */
    public Integer getRid() {
        return rid;
    }

    /**
     * 设置角色id
     *
     * @param rid 角色id
     */
    public void setRid(Integer rid) {
        this.rid = rid;
    }

    /**
     * @return shenfenid
     */
    public String getShenfenid() {
        return shenfenid;
    }

    /**
     * @param shenfenid
     */
    public void setShenfenid(String shenfenid) {
        this.shenfenid = shenfenid;
    }
}