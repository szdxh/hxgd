package com.hxgd.onemap.entity;

import javax.persistence.*;

public class Cement {
    /**
     * id
     */
    @Id
    private Integer id;

    /**
     * 厂家名称
     */
    private String name;

    /**
     * 具体位置
     */
    private String position;

    /**
     * 地理坐标
     */
    private String location;

    /**
     * 所属区域
     */
    private Integer area;

    /**
     * 联系人
     */
    private String contact;

    /**
     * 联系电话
     */
    private String tel;

    /**
     * 接单范围
     */
    private Double radio;

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
     * 获取厂家名称
     *
     * @return name - 厂家名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置厂家名称
     *
     * @param name 厂家名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取具体位置
     *
     * @return position - 具体位置
     */
    public String getPosition() {
        return position;
    }

    /**
     * 设置具体位置
     *
     * @param position 具体位置
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * 获取地理坐标
     *
     * @return location - 地理坐标
     */
    public String getLocation() {
        return location;
    }

    /**
     * 设置地理坐标
     *
     * @param location 地理坐标
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * 获取所属区域
     *
     * @return area - 所属区域
     */
    public Integer getArea() {
        return area;
    }

    /**
     * 设置所属区域
     *
     * @param area 所属区域
     */
    public void setArea(Integer area) {
        this.area = area;
    }

    /**
     * 获取联系人
     *
     * @return contact - 联系人
     */
    public String getContact() {
        return contact;
    }

    /**
     * 设置联系人
     *
     * @param contact 联系人
     */
    public void setContact(String contact) {
        this.contact = contact;
    }

    /**
     * 获取联系电话
     *
     * @return tel - 联系电话
     */
    public String getTel() {
        return tel;
    }

    /**
     * 设置联系电话
     *
     * @param tel 联系电话
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * 获取接单范围
     *
     * @return radio - 接单范围
     */
    public Double getRadio() {
        return radio;
    }

    /**
     * 设置接单范围
     *
     * @param radio 接单范围
     */
    public void setRadio(Double radio) {
        this.radio = radio;
    }
}