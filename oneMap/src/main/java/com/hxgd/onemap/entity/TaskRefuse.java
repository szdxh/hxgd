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
@Table(name = "task_refuse")
public class TaskRefuse {
    /**
     * id
     */
    @Id
    private Integer id;

    /**
     * 任务单编码
     */
    private String code;

    /**
     * 所属计划
     */
    @Column(name = "daily_id")
    private Integer dailyId;

    /**
     * 水泥厂
     */
    @Column(name = "cement_id")
    private Integer cementId;

    /**
     * 标段
     */
    @Column(name = "section_id")
    private Integer sectionId;

    /**
     * 车辆
     */
    @Column(name = "car_id")
    private Integer carId;

    /**
     * 路线ID
     */
    @Column(name = "route_id")
    private Integer routeId;

    /**
     * 驾驶员
     */
    private Integer driver;

    /**
     * 运输任务
     */
    private Integer tasks;

    /**
     * 实装（吨）
     */
    @Column(name = "real_up")
    private Double realUp;

    /**
     * 实装凭据
     */
    @Column(name = "real_up_img")
    private String realUpImg;

    /**
     * 实卸（吨）
     */
    @Column(name = "real_down")
    private Double realDown;

    /**
     * 实卸凭据
     */
    @Column(name = "real_down_img")
    private String realDownImg;

    /**
     * 审核
     */
    @Column(name = "isOK")
    private Integer isok;

    /**
     * 状态
     */
    private Integer state;

    /**
     * 权重2
     */
    private Integer weight2;

    /**
     * 权重
     */
    private Double weight;

    /**
     * 一级审核
     */
    private Integer pass1;

    /**
     * 二级审核
     */
    private Integer pass2;

    /**
     * 备注
     */
    private String remark;

    /**
     * 完成时间
     */
    @Column(name = "fin_time")
    private Date finTime;

    /**
     * 所属批次
     */
    private Integer pici;

    /**
     * 车辆
     */
    private String license;

    /**
     * 日期
     */
    private String riqi;

    /**
     * 当天生成批次
     */
    private String batch;

    /**
     * 任务单生成日期，自动生成
     */
    @Column(name = "gen_date")
    private Date genDate;

    /**
     * 货物id
     */
    @Column(name = "huowu_id")
    private Integer huowuId;

    /**
     * 货物名称
     */
    @Column(name = "huowu_name")
    private String huowuName;

    /**
     * 凭证路径
     */
    private String voucher;

    /**
     * 接单时间
     */
    @Column(name = "accept_time")
    private Date acceptTime;

    /**
     * 装货时间
     */
    @Column(name = "up_time")
    private Date upTime;

    /**
     * 卸货时间
     */
    @Column(name = "down_time")
    private Date downTime;

    /**
     * 装货提交时间
     */
    @Column(name = "up_submit_time")
    private Date upSubmitTime;

    /**
     * 卸货提交时间
     */
    @Column(name = "down_submit_time")
    private Date downSubmitTime;

    /**
     * 是否装货审核
     */
    @Column(name = "isUp")
    private Integer isup;

    /**
     * 是否卸货审核
     */
    @Column(name = "isDown")
    private Integer isdown;

    /**
     * 装货审核备注
     */
    @Column(name = "remarkUp")
    private String remarkup;

    /**
     * 卸货审核备注
     */
    @Column(name = "remarkDown")
    private String remarkdown;

    /**
     * 是否车辆改派
     */
    @Column(name = "isChangeCar")
    private Integer ischangecar;

    /**
     * 改派前车辆
     */
    @Column(name = "beforeCar")
    private String beforecar;

    /**
     * 装货超时时间
     */
    @Column(name = "upOverTime")
    private Date upovertime;

    /**
     * 运输超时时间
     */
    @Column(name = "traverOverTime")
    private Date traverovertime;

    /**
     * 异常信息
     */
    @Column(name = "errorMsg")
    private String errormsg;

    /**
     * 异常附件
     */
    @Column(name = "errorFile")
    private String errorfile;

    /**
     * 是否装货超时
     */
    @Column(name = "isUpOver")
    private Integer isupover;

    /**
     * 是否运输超时
     */
    @Column(name = "isTraverOver")
    private Integer istraverover;

}