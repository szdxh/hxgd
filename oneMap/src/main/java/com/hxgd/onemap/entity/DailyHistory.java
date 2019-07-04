package com.hxgd.onemap.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "daily_history")
public class DailyHistory {
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

    /**
     * 审核时间
     */
    @Column(name = "gen_date")
    private Date genDate;

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
     * 获取编码
     *
     * @return code - 编码
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置编码
     *
     * @param code 编码
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取标段ID
     *
     * @return section_id - 标段ID
     */
    public Integer getSectionId() {
        return sectionId;
    }

    /**
     * 设置标段ID
     *
     * @param sectionId 标段ID
     */
    public void setSectionId(Integer sectionId) {
        this.sectionId = sectionId;
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
     * 获取库存量（吨）
     *
     * @return stock - 库存量（吨）
     */
    public Double getStock() {
        return stock;
    }

    /**
     * 设置库存量（吨）
     *
     * @param stock 库存量（吨）
     */
    public void setStock(Double stock) {
        this.stock = stock;
    }

    /**
     * 获取库存数据来源
     *
     * @return stock_source - 库存数据来源
     */
    public Integer getStockSource() {
        return stockSource;
    }

    /**
     * 设置库存数据来源
     *
     * @param stockSource 库存数据来源
     */
    public void setStockSource(Integer stockSource) {
        this.stockSource = stockSource;
    }

    /**
     * 获取库容库存比
     *
     * @return bite - 库容库存比
     */
    public Double getBite() {
        return bite;
    }

    /**
     * 设置库容库存比
     *
     * @param bite 库容库存比
     */
    public void setBite(Double bite) {
        this.bite = bite;
    }

    /**
     * 获取库存红线（吨）
     *
     * @return stock_line - 库存红线（吨）
     */
    public Integer getStockLine() {
        return stockLine;
    }

    /**
     * 设置库存红线（吨）
     *
     * @param stockLine 库存红线（吨）
     */
    public void setStockLine(Integer stockLine) {
        this.stockLine = stockLine;
    }

    /**
     * 获取库存实际询问时间
     *
     * @return stock_ask_time - 库存实际询问时间
     */
    public Date getStockAskTime() {
        return stockAskTime;
    }

    /**
     * 设置库存实际询问时间
     *
     * @param stockAskTime 库存实际询问时间
     */
    public void setStockAskTime(Date stockAskTime) {
        this.stockAskTime = stockAskTime;
    }

    /**
     * 获取日用量询问方式
     *
     * @return day_dosage_ask - 日用量询问方式
     */
    public Integer getDayDosageAsk() {
        return dayDosageAsk;
    }

    /**
     * 设置日用量询问方式
     *
     * @param dayDosageAsk 日用量询问方式
     */
    public void setDayDosageAsk(Integer dayDosageAsk) {
        this.dayDosageAsk = dayDosageAsk;
    }

    /**
     * 获取半月日均用量（吨）
     *
     * @return half_month - 半月日均用量（吨）
     */
    public Double getHalfMonth() {
        return halfMonth;
    }

    /**
     * 设置半月日均用量（吨）
     *
     * @param halfMonth 半月日均用量（吨）
     */
    public void setHalfMonth(Double halfMonth) {
        this.halfMonth = halfMonth;
    }

    /**
     * 获取工地上报日用量（吨）
     *
     * @return day_dosage - 工地上报日用量（吨）
     */
    public Double getDayDosage() {
        return dayDosage;
    }

    /**
     * 设置工地上报日用量（吨）
     *
     * @param dayDosage 工地上报日用量（吨）
     */
    public void setDayDosage(Double dayDosage) {
        this.dayDosage = dayDosage;
    }

    /**
     * 获取当前在途数量（吨）
     *
     * @return on_road - 当前在途数量（吨）
     */
    public Double getOnRoad() {
        return onRoad;
    }

    /**
     * 设置当前在途数量（吨）
     *
     * @param onRoad 当前在途数量（吨）
     */
    public void setOnRoad(Double onRoad) {
        this.onRoad = onRoad;
    }

    /**
     * 获取预计发货量（吨）
     *
     * @return estimated_shipments - 预计发货量（吨）
     */
    public Double getEstimatedShipments() {
        return estimatedShipments;
    }

    /**
     * 设置预计发货量（吨）
     *
     * @param estimatedShipments 预计发货量（吨）
     */
    public void setEstimatedShipments(Double estimatedShipments) {
        this.estimatedShipments = estimatedShipments;
    }

    /**
     * 获取单趟时长（分钟）
     *
     * @return route_time - 单趟时长（分钟）
     */
    public Double getRouteTime() {
        return routeTime;
    }

    /**
     * 设置单趟时长（分钟）
     *
     * @param routeTime 单趟时长（分钟）
     */
    public void setRouteTime(Double routeTime) {
        this.routeTime = routeTime;
    }

    /**
     * 获取优先车型
     *
     * @return car_type - 优先车型
     */
    public Integer getCarType() {
        return carType;
    }

    /**
     * 设置优先车型
     *
     * @param carType 优先车型
     */
    public void setCarType(Integer carType) {
        this.carType = carType;
    }

    /**
     * 获取优先车型（吨）
     *
     * @return car_type_weight - 优先车型（吨）
     */
    public Double getCarTypeWeight() {
        return carTypeWeight;
    }

    /**
     * 设置优先车型（吨）
     *
     * @param carTypeWeight 优先车型（吨）
     */
    public void setCarTypeWeight(Double carTypeWeight) {
        this.carTypeWeight = carTypeWeight;
    }

    /**
     * 获取计划任务单数
     *
     * @return task_nums - 计划任务单数
     */
    public Integer getTaskNums() {
        return taskNums;
    }

    /**
     * 设置计划任务单数
     *
     * @param taskNums 计划任务单数
     */
    public void setTaskNums(Integer taskNums) {
        this.taskNums = taskNums;
    }

    /**
     * 获取第一批次任务
     *
     * @return first_task - 第一批次任务
     */
    public Integer getFirstTask() {
        return firstTask;
    }

    /**
     * 设置第一批次任务
     *
     * @param firstTask 第一批次任务
     */
    public void setFirstTask(Integer firstTask) {
        this.firstTask = firstTask;
    }

    /**
     * 获取一批次剩余
     *
     * @return first_overplus - 一批次剩余
     */
    public Integer getFirstOverplus() {
        return firstOverplus;
    }

    /**
     * 设置一批次剩余
     *
     * @param firstOverplus 一批次剩余
     */
    public void setFirstOverplus(Integer firstOverplus) {
        this.firstOverplus = firstOverplus;
    }

    /**
     * 获取第二批次任务
     *
     * @return second_task - 第二批次任务
     */
    public Integer getSecondTask() {
        return secondTask;
    }

    /**
     * 设置第二批次任务
     *
     * @param secondTask 第二批次任务
     */
    public void setSecondTask(Integer secondTask) {
        this.secondTask = secondTask;
    }

    /**
     * 获取二批次剩余
     *
     * @return second_overplus - 二批次剩余
     */
    public Integer getSecondOverplus() {
        return secondOverplus;
    }

    /**
     * 设置二批次剩余
     *
     * @param secondOverplus 二批次剩余
     */
    public void setSecondOverplus(Integer secondOverplus) {
        this.secondOverplus = secondOverplus;
    }

    /**
     * 获取第三批次任务
     *
     * @return third_task - 第三批次任务
     */
    public Integer getThirdTask() {
        return thirdTask;
    }

    /**
     * 设置第三批次任务
     *
     * @param thirdTask 第三批次任务
     */
    public void setThirdTask(Integer thirdTask) {
        this.thirdTask = thirdTask;
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取生成时间
     *
     * @return add_time - 生成时间
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * 设置生成时间
     *
     * @param addTime 生成时间
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * 获取审核
     *
     * @return is_OK - 审核
     */
    public Integer getIsOk() {
        return isOk;
    }

    /**
     * 设置审核
     *
     * @param isOk 审核
     */
    public void setIsOk(Integer isOk) {
        this.isOk = isOk;
    }

    /**
     * 获取状态
     *
     * @return statue - 状态
     */
    public Integer getStatue() {
        return statue;
    }

    /**
     * 设置状态
     *
     * @param statue 状态
     */
    public void setStatue(Integer statue) {
        this.statue = statue;
    }

    /**
     * 获取计划库存
     *
     * @return planeStock - 计划库存
     */
    public Double getPlanestock() {
        return planestock;
    }

    /**
     * 设置计划库存
     *
     * @param planestock 计划库存
     */
    public void setPlanestock(Double planestock) {
        this.planestock = planestock;
    }

    /**
     * 获取物资公司id
     *
     * @return materia - 物资公司id
     */
    public Integer getMateria() {
        return materia;
    }

    /**
     * 设置物资公司id
     *
     * @param materia 物资公司id
     */
    public void setMateria(Integer materia) {
        this.materia = materia;
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
     * 获取货物品名id
     *
     * @return huowu_id - 货物品名id
     */
    public Integer getHuowuId() {
        return huowuId;
    }

    /**
     * 设置货物品名id
     *
     * @param huowuId 货物品名id
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

    /**
     * 获取审核时间
     *
     * @return gen_date - 审核时间
     */
    public Date getGenDate() {
        return genDate;
    }

    /**
     * 设置审核时间
     *
     * @param genDate 审核时间
     */
    public void setGenDate(Date genDate) {
        this.genDate = genDate;
    }
}