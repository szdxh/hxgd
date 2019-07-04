package com.hxgd.onemap.entity;

import javax.persistence.*;

public class Section {
    /**
     * id
     */
    @Id
    private Integer id;

    /**
     * 标段名称
     */
    private String name;

    /**
     * 所属施工方
     */
    @Column(name = "carry_id")
    private Integer carryId;

    /**
     * 地理坐标
     */
    private String location;

    /**
     * 所属区域
     */
    private Integer area;

    /**
     * 库容量
     */
    private Double capacity;

    /**
     * 比例
     */
    private Double bite;

    /**
     * 库存量
     */
    private Double stock;

    /**
     * 日消耗量
     */
    private Double daily;

    /**
     * 库存红线
     */
    @Column(name = "red_line")
    private Double redLine;

    /**
     * 调度主管
     */
    private Integer contact;

    /**
     * 调度员
     */
    private Integer control;

    /**
     * 数据处理员
     */
    private Integer deal;

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
     * 获取标段名称
     *
     * @return name - 标段名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置标段名称
     *
     * @param name 标段名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取所属施工方
     *
     * @return carry_id - 所属施工方
     */
    public Integer getCarryId() {
        return carryId;
    }

    /**
     * 设置所属施工方
     *
     * @param carryId 所属施工方
     */
    public void setCarryId(Integer carryId) {
        this.carryId = carryId;
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
     * 获取库容量
     *
     * @return capacity - 库容量
     */
    public Double getCapacity() {
        return capacity;
    }

    /**
     * 设置库容量
     *
     * @param capacity 库容量
     */
    public void setCapacity(Double capacity) {
        this.capacity = capacity;
    }

    /**
     * 获取比例
     *
     * @return bite - 比例
     */
    public Double getBite() {
        return bite;
    }

    /**
     * 设置比例
     *
     * @param bite 比例
     */
    public void setBite(Double bite) {
        this.bite = bite;
    }

    /**
     * 获取库存量
     *
     * @return stock - 库存量
     */
    public Double getStock() {
        return stock;
    }

    /**
     * 设置库存量
     *
     * @param stock 库存量
     */
    public void setStock(Double stock) {
        this.stock = stock;
    }

    /**
     * 获取日消耗量
     *
     * @return daily - 日消耗量
     */
    public Double getDaily() {
        return daily;
    }

    /**
     * 设置日消耗量
     *
     * @param daily 日消耗量
     */
    public void setDaily(Double daily) {
        this.daily = daily;
    }

    /**
     * 获取库存红线
     *
     * @return red_line - 库存红线
     */
    public Double getRedLine() {
        return redLine;
    }

    /**
     * 设置库存红线
     *
     * @param redLine 库存红线
     */
    public void setRedLine(Double redLine) {
        this.redLine = redLine;
    }

    /**
     * 获取调度主管
     *
     * @return contact - 调度主管
     */
    public Integer getContact() {
        return contact;
    }

    /**
     * 设置调度主管
     *
     * @param contact 调度主管
     */
    public void setContact(Integer contact) {
        this.contact = contact;
    }

    /**
     * 获取调度员
     *
     * @return control - 调度员
     */
    public Integer getControl() {
        return control;
    }

    /**
     * 设置调度员
     *
     * @param control 调度员
     */
    public void setControl(Integer control) {
        this.control = control;
    }

    /**
     * 获取数据处理员
     *
     * @return deal - 数据处理员
     */
    public Integer getDeal() {
        return deal;
    }

    /**
     * 设置数据处理员
     *
     * @param deal 数据处理员
     */
    public void setDeal(Integer deal) {
        this.deal = deal;
    }
}