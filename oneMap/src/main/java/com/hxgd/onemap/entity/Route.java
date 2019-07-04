package com.hxgd.onemap.entity;

import javax.persistence.*;

public class Route {
    @Id
    private Integer id;

    /**
     * 路线名称
     */
    private String name;

    /**
     * 路线描述
     */
    private String content;

    /**
     * 水泥厂
     */
    private Integer cement;

    /**
     * 标段
     */
    private Integer section;

    /**
     * 打印水泥厂
     */
    private String prnsection;

    /**
     * 车辆类型
     */
    @Column(name = "car_type")
    private Integer carType;

    /**
     * 标准里程（km）
     */
    private Float mile;

    /**
     * 单趟承运时间（min）
     */
    private Float time;

    /**
     * 装货超时（min）
     */
    @Column(name = "up_time")
    private Float upTime;

    /**
     * 卸货超时（min）
     */
    @Column(name = "down_time")
    private Float downTime;

    /**
     * 单趟工资（元）
     */
    private Float wage;

    /**
     * 单趟油耗（L）
     */
    private Float oil;

    /**
     * 收费
     */
    private Float fee;

    /**
     * 物资公司
     */
    @Column(name = "mat_id")
    private Integer matId;

    /**
     * 是否可用
     */
    private Integer fit;

    /**
     * 负责车队
     */
    @Column(name = "moto_id")
    private Integer motoId;

    /**
     * 提货账号
     */
    private String accout;

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
     * 获取路线名称
     *
     * @return name - 路线名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置路线名称
     *
     * @param name 路线名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取路线描述
     *
     * @return content - 路线描述
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置路线描述
     *
     * @param content 路线描述
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取水泥厂
     *
     * @return cement - 水泥厂
     */
    public Integer getCement() {
        return cement;
    }

    /**
     * 设置水泥厂
     *
     * @param cement 水泥厂
     */
    public void setCement(Integer cement) {
        this.cement = cement;
    }

    /**
     * 获取标段
     *
     * @return section - 标段
     */
    public Integer getSection() {
        return section;
    }

    /**
     * 设置标段
     *
     * @param section 标段
     */
    public void setSection(Integer section) {
        this.section = section;
    }

    /**
     * 获取打印水泥厂
     *
     * @return prnsection - 打印水泥厂
     */
    public String getPrnsection() {
        return prnsection;
    }

    /**
     * 设置打印水泥厂
     *
     * @param prnsection 打印水泥厂
     */
    public void setPrnsection(String prnsection) {
        this.prnsection = prnsection;
    }

    /**
     * 获取车辆类型
     *
     * @return car_type - 车辆类型
     */
    public Integer getCarType() {
        return carType;
    }

    /**
     * 设置车辆类型
     *
     * @param carType 车辆类型
     */
    public void setCarType(Integer carType) {
        this.carType = carType;
    }

    /**
     * 获取标准里程（km）
     *
     * @return mile - 标准里程（km）
     */
    public Float getMile() {
        return mile;
    }

    /**
     * 设置标准里程（km）
     *
     * @param mile 标准里程（km）
     */
    public void setMile(Float mile) {
        this.mile = mile;
    }

    /**
     * 获取单趟承运时间（min）
     *
     * @return time - 单趟承运时间（min）
     */
    public Float getTime() {
        return time;
    }

    /**
     * 设置单趟承运时间（min）
     *
     * @param time 单趟承运时间（min）
     */
    public void setTime(Float time) {
        this.time = time;
    }

    /**
     * 获取装货超时（min）
     *
     * @return up_time - 装货超时（min）
     */
    public Float getUpTime() {
        return upTime;
    }

    /**
     * 设置装货超时（min）
     *
     * @param upTime 装货超时（min）
     */
    public void setUpTime(Float upTime) {
        this.upTime = upTime;
    }

    /**
     * 获取卸货超时（min）
     *
     * @return down_time - 卸货超时（min）
     */
    public Float getDownTime() {
        return downTime;
    }

    /**
     * 设置卸货超时（min）
     *
     * @param downTime 卸货超时（min）
     */
    public void setDownTime(Float downTime) {
        this.downTime = downTime;
    }

    /**
     * 获取单趟工资（元）
     *
     * @return wage - 单趟工资（元）
     */
    public Float getWage() {
        return wage;
    }

    /**
     * 设置单趟工资（元）
     *
     * @param wage 单趟工资（元）
     */
    public void setWage(Float wage) {
        this.wage = wage;
    }

    /**
     * 获取单趟油耗（L）
     *
     * @return oil - 单趟油耗（L）
     */
    public Float getOil() {
        return oil;
    }

    /**
     * 设置单趟油耗（L）
     *
     * @param oil 单趟油耗（L）
     */
    public void setOil(Float oil) {
        this.oil = oil;
    }

    /**
     * 获取收费
     *
     * @return fee - 收费
     */
    public Float getFee() {
        return fee;
    }

    /**
     * 设置收费
     *
     * @param fee 收费
     */
    public void setFee(Float fee) {
        this.fee = fee;
    }

    /**
     * 获取物资公司
     *
     * @return mat_id - 物资公司
     */
    public Integer getMatId() {
        return matId;
    }

    /**
     * 设置物资公司
     *
     * @param matId 物资公司
     */
    public void setMatId(Integer matId) {
        this.matId = matId;
    }

    /**
     * 获取是否可用
     *
     * @return fit - 是否可用
     */
    public Integer getFit() {
        return fit;
    }

    /**
     * 设置是否可用
     *
     * @param fit 是否可用
     */
    public void setFit(Integer fit) {
        this.fit = fit;
    }

    /**
     * 获取负责车队
     *
     * @return moto_id - 负责车队
     */
    public Integer getMotoId() {
        return motoId;
    }

    /**
     * 设置负责车队
     *
     * @param motoId 负责车队
     */
    public void setMotoId(Integer motoId) {
        this.motoId = motoId;
    }

    /**
     * 获取提货账号
     *
     * @return accout - 提货账号
     */
    public String getAccout() {
        return accout;
    }

    /**
     * 设置提货账号
     *
     * @param accout 提货账号
     */
    public void setAccout(String accout) {
        this.accout = accout;
    }
}