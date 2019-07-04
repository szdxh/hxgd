package com.hxgd.onemap.entity;

import javax.persistence.*;

public class Car {
    /**
     * id
     */
    @Id
    private Integer id;

    /**
     * 所属车队
     */
    @Column(name = "moto_id")
    private Integer motoId;

    /**
     * 车辆类型
     */
    private Integer type;

    /**
     * 车牌号
     */
    private String license;

    /**
     * 驾驶员
     */
    private Integer driver;

    /**
     * 车辆状态
     */
    private Integer state;

    /**
     * 位置
     */
    private String position;

    /**
     * 区域
     */
    private String area;

    /**
     * 区域车型
     */
    @Column(name = "area_carid")
    private String areaCarid;

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
     * 获取所属车队
     *
     * @return moto_id - 所属车队
     */
    public Integer getMotoId() {
        return motoId;
    }

    /**
     * 设置所属车队
     *
     * @param motoId 所属车队
     */
    public void setMotoId(Integer motoId) {
        this.motoId = motoId;
    }

    /**
     * 获取车辆类型
     *
     * @return type - 车辆类型
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置车辆类型
     *
     * @param type 车辆类型
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取车牌号
     *
     * @return license - 车牌号
     */
    public String getLicense() {
        return license;
    }

    /**
     * 设置车牌号
     *
     * @param license 车牌号
     */
    public void setLicense(String license) {
        this.license = license;
    }

    /**
     * 获取驾驶员
     *
     * @return driver - 驾驶员
     */
    public Integer getDriver() {
        return driver;
    }

    /**
     * 设置驾驶员
     *
     * @param driver 驾驶员
     */
    public void setDriver(Integer driver) {
        this.driver = driver;
    }

    /**
     * 获取车辆状态
     *
     * @return state - 车辆状态
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置车辆状态
     *
     * @param state 车辆状态
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 获取位置
     *
     * @return position - 位置
     */
    public String getPosition() {
        return position;
    }

    /**
     * 设置位置
     *
     * @param position 位置
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * 获取区域
     *
     * @return area - 区域
     */
    public String getArea() {
        return area;
    }

    /**
     * 设置区域
     *
     * @param area 区域
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * 获取区域车型
     *
     * @return area_carid - 区域车型
     */
    public String getAreaCarid() {
        return areaCarid;
    }

    /**
     * 设置区域车型
     *
     * @param areaCarid 区域车型
     */
    public void setAreaCarid(String areaCarid) {
        this.areaCarid = areaCarid;
    }
}