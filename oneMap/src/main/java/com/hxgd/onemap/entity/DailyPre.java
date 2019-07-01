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
@Table(name = "daily_pre")
public class DailyPre {
    @Id
    private Integer id;

    @Column(name = "daily_id")
    private Integer dailyId;

    /**
     * 水泥厂
     */
    private String cement;

    /**
     * 站点
     */
    private String section;

    /**
     * 计划
     */
    private Double plan;

    /**
     * 在途
     */
    @Column(name = "on_road")
    private Double onRoad;

    /**
     * 已完成
     */
    private Double finish;

    /**
     * 日计划编号
     */
    private String code;

    /**
     * 日期
     */
    private String riqi;

    /**
     * 异常单数
     */
    @Column(name = "e_task")
    private Integer eTask;

    /**
     * 状态，0 预编任务 1 任务跟踪 2 完成
     */
    private Integer statue;

    /**
     * 调整计划，初始值和计划吨吨数相同
     */
    @Column(name = "edit_plan")
    private Double editPlan;

    /**
     * 修改备注
     */
    private String remark;

    /**
     * 插入时间
     */
    @Column(name = "in_date")
    private Date inDate;

    /**
     * 当天生成批次
     */
    private String batch;

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

   
}