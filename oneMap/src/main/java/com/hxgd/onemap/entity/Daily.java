package com.hxgd.onemap.entity;

import java.util.Date;
import javax.persistence.*;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Daily {
    @Id
    private Integer id;

    /**
     * 编码
     */
    private String code;

    /**
     * 标段ID
     */
    @Column(name = "section_id")
    private Integer sectionId;

    /**
     * 站点
     */
    private String section;

    /**
     * 库容量
     */
    private Double capacity;

    /**
     * 库存量（吨）
     */
    private Double stock;

    /**
     * 库存数据来源
     */
    @Column(name = "stock_source")
    private Integer stockSource;

    /**
     * 库容库存比
     */
    private Double bite;

    /**
     * 库存红线（吨）
     */
    @Column(name = "stock_line")
    private Integer stockLine;

    /**
     * 库存实际询问时间
     */
    @Column(name = "stock_ask_time")
    private Date stockAskTime;

    /**
     * 日用量询问方式
     */
    @Column(name = "day_dosage_ask")
    private Integer dayDosageAsk;

    /**
     * 半月日均用量（吨）
     */
    @Column(name = "half_month")
    private Double halfMonth;

    /**
     * 工地上报日用量（吨）
     */
    @Column(name = "day_dosage")
    private Double dayDosage;

    /**
     * 当前在途数量（吨）
     */
    @Column(name = "on_road")
    private Double onRoad;

    /**
     * 预计发货量（吨）
     */
    @Column(name = "estimated_shipments")
    private Double estimatedShipments;

    /**
     * 单趟时长（分钟）
     */
    @Column(name = "route_time")
    private Double routeTime;

    /**
     * 优先车型
     */
    @Column(name = "car_type")
    private Integer carType;

    /**
     * 优先车型（吨）
     */
    @Column(name = "car_type_weight")
    private Double carTypeWeight;

    /**
     * 计划任务单数
     */
    @Column(name = "task_nums")
    private Integer taskNums;

    /**
     * 第一批次任务
     */
    @Column(name = "first_task")
    private Integer firstTask;

    /**
     * 一批次剩余
     */
    @Column(name = "first_overplus")
    private Integer firstOverplus;

    /**
     * 第二批次任务
     */
    @Column(name = "second_task")
    private Integer secondTask;

    /**
     * 二批次剩余
     */
    @Column(name = "second_overplus")
    private Integer secondOverplus;

    /**
     * 第三批次任务
     */
    @Column(name = "third_task")
    private Integer thirdTask;

    /**
     * 备注
     */
    private String remark;

    /**
     * 生成时间
     */
    @Column(name = "add_time")
    private Date addTime;

    /**
     * 审核
     */
    @Column(name = "is_OK")
    private Integer isOk;

    /**
     * 状态
     */
    private Integer statue;

    /**
     * 计划库存
     */
    @Column(name = "planeStock")
    private Double planestock;

    /**
     * 物资公司id
     */
    private Integer materia;

    /**
     * 当天生成批次
     */
    private String batch;

    /**
     * 货物品名id
     */
    @Column(name = "huowu_id")
    private Integer huowuId;

    /**
     * 货物名称
     */
    @Column(name = "huowu_name")
    private String huowuName;

  
}