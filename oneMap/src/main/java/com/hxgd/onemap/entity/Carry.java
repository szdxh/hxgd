package com.hxgd.onemap.entity;

import javax.persistence.*;

public class Carry {
    /**
     * id
     */
    @Id
    private Integer id;

    /**
     * 施工方名称
     */
    private String name;

    /**
     * 负责人
     */
    private Integer contact;

    /**
     * 所属公司
     */
    private String company;

    /**
     * 所在地
     */
    private String position;

    /**
     * 默认货物 id
     */
    @Column(name = "huowu_id")
    private Integer huowuId;

    /**
     * 获取id
     *
     * @return id - id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取施工方名称
     *
     * @return name - 施工方名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置施工方名称
     *
     * @param name 施工方名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取负责人
     *
     * @return contact - 负责人
     */
    public Integer getContact() {
        return contact;
    }

    /**
     * 设置负责人
     *
     * @param contact 负责人
     */
    public void setContact(Integer contact) {
        this.contact = contact;
    }

    /**
     * 获取所属公司
     *
     * @return company - 所属公司
     */
    public String getCompany() {
        return company;
    }

    /**
     * 设置所属公司
     *
     * @param company 所属公司
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * 获取所在地
     *
     * @return position - 所在地
     */
    public String getPosition() {
        return position;
    }

    /**
     * 设置所在地
     *
     * @param position 所在地
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * 获取默认货物 id
     *
     * @return huowu_id - 默认货物 id
     */
    public Integer getHuowuId() {
        return huowuId;
    }

    /**
     * 设置默认货物 id
     *
     * @param huowuId 默认货物 id
     */
    public void setHuowuId(Integer huowuId) {
        this.huowuId = huowuId;
    }
}