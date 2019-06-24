package com.hxgd.onemap.entity;

import javax.persistence.*;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
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

}