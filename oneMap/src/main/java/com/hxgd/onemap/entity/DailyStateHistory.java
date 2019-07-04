package com.hxgd.onemap.entity;

import javax.persistence.*;

@Table(name = "daily_state_history")
public class DailyStateHistory {
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
     * 未下发
     */
    @Column(name = "not_is")
    private Double notIs;

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
     * @return daily_id
     */
    public Integer getDailyId() {
        return dailyId;
    }

    /**
     * @param dailyId
     */
    public void setDailyId(Integer dailyId) {
        this.dailyId = dailyId;
    }

    /**
     * 获取水泥厂
     *
     * @return cement - 水泥厂
     */
    public String getCement() {
        return cement;
    }

    /**
     * 设置水泥厂
     *
     * @param cement 水泥厂
     */
    public void setCement(String cement) {
        this.cement = cement;
    }

    /**
     * 获取站点
     *
     * @return section - 站点
     */
    public String getSection() {
        return section;
    }

    /**
     * 设置站点
     *
     * @param section 站点
     */
    public void setSection(String section) {
        this.section = section;
    }

    /**
     * 获取计划
     *
     * @return plan - 计划
     */
    public Double getPlan() {
        return plan;
    }

    /**
     * 设置计划
     *
     * @param plan 计划
     */
    public void setPlan(Double plan) {
        this.plan = plan;
    }

    /**
     * 获取未下发
     *
     * @return not_is - 未下发
     */
    public Double getNotIs() {
        return notIs;
    }

    /**
     * 设置未下发
     *
     * @param notIs 未下发
     */
    public void setNotIs(Double notIs) {
        this.notIs = notIs;
    }

    /**
     * 获取在途
     *
     * @return on_road - 在途
     */
    public Double getOnRoad() {
        return onRoad;
    }

    /**
     * 设置在途
     *
     * @param onRoad 在途
     */
    public void setOnRoad(Double onRoad) {
        this.onRoad = onRoad;
    }

    /**
     * 获取已完成
     *
     * @return finish - 已完成
     */
    public Double getFinish() {
        return finish;
    }

    /**
     * 设置已完成
     *
     * @param finish 已完成
     */
    public void setFinish(Double finish) {
        this.finish = finish;
    }

    /**
     * 获取日计划编号
     *
     * @return code - 日计划编号
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置日计划编号
     *
     * @param code 日计划编号
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取日期
     *
     * @return riqi - 日期
     */
    public String getRiqi() {
        return riqi;
    }

    /**
     * 设置日期
     *
     * @param riqi 日期
     */
    public void setRiqi(String riqi) {
        this.riqi = riqi;
    }

    /**
     * 获取异常单数
     *
     * @return e_task - 异常单数
     */
    public Integer geteTask() {
        return eTask;
    }

    /**
     * 设置异常单数
     *
     * @param eTask 异常单数
     */
    public void seteTask(Integer eTask) {
        this.eTask = eTask;
    }

    /**
     * 获取状态，0 预编任务 1 任务跟踪 2 完成
     *
     * @return statue - 状态，0 预编任务 1 任务跟踪 2 完成
     */
    public Integer getStatue() {
        return statue;
    }

    /**
     * 设置状态，0 预编任务 1 任务跟踪 2 完成
     *
     * @param statue 状态，0 预编任务 1 任务跟踪 2 完成
     */
    public void setStatue(Integer statue) {
        this.statue = statue;
    }

    /**
     * 获取调整计划，初始值和计划吨吨数相同
     *
     * @return edit_plan - 调整计划，初始值和计划吨吨数相同
     */
    public Double getEditPlan() {
        return editPlan;
    }

    /**
     * 设置调整计划，初始值和计划吨吨数相同
     *
     * @param editPlan 调整计划，初始值和计划吨吨数相同
     */
    public void setEditPlan(Double editPlan) {
        this.editPlan = editPlan;
    }

    /**
     * 获取修改备注
     *
     * @return remark - 修改备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置修改备注
     *
     * @param remark 修改备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取当天生成批次
     *
     * @return batch - 当天生成批次
     */
    public String getBatch() {
        return batch;
    }

    /**
     * 设置当天生成批次
     *
     * @param batch 当天生成批次
     */
    public void setBatch(String batch) {
        this.batch = batch;
    }

    /**
     * 获取货物id
     *
     * @return huowu_id - 货物id
     */
    public Integer getHuowuId() {
        return huowuId;
    }

    /**
     * 设置货物id
     *
     * @param huowuId 货物id
     */
    public void setHuowuId(Integer huowuId) {
        this.huowuId = huowuId;
    }

    /**
     * 获取货物名称
     *
     * @return huowu_name - 货物名称
     */
    public String getHuowuName() {
        return huowuName;
    }

    /**
     * 设置货物名称
     *
     * @param huowuName 货物名称
     */
    public void setHuowuName(String huowuName) {
        this.huowuName = huowuName;
    }
}