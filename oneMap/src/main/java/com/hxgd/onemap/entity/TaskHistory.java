package com.hxgd.onemap.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "task_history")
public class TaskHistory {
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

    /**
     * 实装审核备注
     */
    @Column(name = "remarkUp")
    private String remarkup;

    /**
     * 实卸审核备注
     */
    @Column(name = "remarkDown")
    private String remarkdown;

    /**
     * 质保书编号
     */
    private String zhibao;

    /**
     * 审核拒绝备注
     */
    @Column(name = "refuse_text")
    private String refuseText;

    /**
     * 手工单号
     */
    private String sgdh;

    /**
     * 备注
     */
    private String beizhu;

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
     * 获取任务单编码
     *
     * @return code - 任务单编码
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置任务单编码
     *
     * @param code 任务单编码
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取所属计划
     *
     * @return daily_id - 所属计划
     */
    public Integer getDailyId() {
        return dailyId;
    }

    /**
     * 设置所属计划
     *
     * @param dailyId 所属计划
     */
    public void setDailyId(Integer dailyId) {
        this.dailyId = dailyId;
    }

    /**
     * 获取水泥厂
     *
     * @return cement_id - 水泥厂
     */
    public Integer getCementId() {
        return cementId;
    }

    /**
     * 设置水泥厂
     *
     * @param cementId 水泥厂
     */
    public void setCementId(Integer cementId) {
        this.cementId = cementId;
    }

    /**
     * 获取标段
     *
     * @return section_id - 标段
     */
    public Integer getSectionId() {
        return sectionId;
    }

    /**
     * 设置标段
     *
     * @param sectionId 标段
     */
    public void setSectionId(Integer sectionId) {
        this.sectionId = sectionId;
    }

    /**
     * 获取车辆
     *
     * @return car_id - 车辆
     */
    public Integer getCarId() {
        return carId;
    }

    /**
     * 设置车辆
     *
     * @param carId 车辆
     */
    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    /**
     * 获取路线ID
     *
     * @return route_id - 路线ID
     */
    public Integer getRouteId() {
        return routeId;
    }

    /**
     * 设置路线ID
     *
     * @param routeId 路线ID
     */
    public void setRouteId(Integer routeId) {
        this.routeId = routeId;
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
     * 获取运输任务
     *
     * @return tasks - 运输任务
     */
    public Integer getTasks() {
        return tasks;
    }

    /**
     * 设置运输任务
     *
     * @param tasks 运输任务
     */
    public void setTasks(Integer tasks) {
        this.tasks = tasks;
    }

    /**
     * 获取实装（吨）
     *
     * @return real_up - 实装（吨）
     */
    public Double getRealUp() {
        return realUp;
    }

    /**
     * 设置实装（吨）
     *
     * @param realUp 实装（吨）
     */
    public void setRealUp(Double realUp) {
        this.realUp = realUp;
    }

    /**
     * 获取实装凭据
     *
     * @return real_up_img - 实装凭据
     */
    public String getRealUpImg() {
        return realUpImg;
    }

    /**
     * 设置实装凭据
     *
     * @param realUpImg 实装凭据
     */
    public void setRealUpImg(String realUpImg) {
        this.realUpImg = realUpImg;
    }

    /**
     * 获取实卸（吨）
     *
     * @return real_down - 实卸（吨）
     */
    public Double getRealDown() {
        return realDown;
    }

    /**
     * 设置实卸（吨）
     *
     * @param realDown 实卸（吨）
     */
    public void setRealDown(Double realDown) {
        this.realDown = realDown;
    }

    /**
     * 获取实卸凭据
     *
     * @return real_down_img - 实卸凭据
     */
    public String getRealDownImg() {
        return realDownImg;
    }

    /**
     * 设置实卸凭据
     *
     * @param realDownImg 实卸凭据
     */
    public void setRealDownImg(String realDownImg) {
        this.realDownImg = realDownImg;
    }

    /**
     * 获取审核
     *
     * @return isOK - 审核
     */
    public Integer getIsok() {
        return isok;
    }

    /**
     * 设置审核
     *
     * @param isok 审核
     */
    public void setIsok(Integer isok) {
        this.isok = isok;
    }

    /**
     * 获取状态
     *
     * @return state - 状态
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置状态
     *
     * @param state 状态
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 获取权重2
     *
     * @return weight2 - 权重2
     */
    public Integer getWeight2() {
        return weight2;
    }

    /**
     * 设置权重2
     *
     * @param weight2 权重2
     */
    public void setWeight2(Integer weight2) {
        this.weight2 = weight2;
    }

    /**
     * 获取权重
     *
     * @return weight - 权重
     */
    public Double getWeight() {
        return weight;
    }

    /**
     * 设置权重
     *
     * @param weight 权重
     */
    public void setWeight(Double weight) {
        this.weight = weight;
    }

    /**
     * 获取一级审核
     *
     * @return pass1 - 一级审核
     */
    public Integer getPass1() {
        return pass1;
    }

    /**
     * 设置一级审核
     *
     * @param pass1 一级审核
     */
    public void setPass1(Integer pass1) {
        this.pass1 = pass1;
    }

    /**
     * 获取二级审核
     *
     * @return pass2 - 二级审核
     */
    public Integer getPass2() {
        return pass2;
    }

    /**
     * 设置二级审核
     *
     * @param pass2 二级审核
     */
    public void setPass2(Integer pass2) {
        this.pass2 = pass2;
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
     * 获取完成时间
     *
     * @return fin_time - 完成时间
     */
    public Date getFinTime() {
        return finTime;
    }

    /**
     * 设置完成时间
     *
     * @param finTime 完成时间
     */
    public void setFinTime(Date finTime) {
        this.finTime = finTime;
    }

    /**
     * 获取所属批次
     *
     * @return pici - 所属批次
     */
    public Integer getPici() {
        return pici;
    }

    /**
     * 设置所属批次
     *
     * @param pici 所属批次
     */
    public void setPici(Integer pici) {
        this.pici = pici;
    }

    /**
     * 获取车辆
     *
     * @return license - 车辆
     */
    public String getLicense() {
        return license;
    }

    /**
     * 设置车辆
     *
     * @param license 车辆
     */
    public void setLicense(String license) {
        this.license = license;
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
     * 获取任务单生成日期，自动生成
     *
     * @return gen_date - 任务单生成日期，自动生成
     */
    public Date getGenDate() {
        return genDate;
    }

    /**
     * 设置任务单生成日期，自动生成
     *
     * @param genDate 任务单生成日期，自动生成
     */
    public void setGenDate(Date genDate) {
        this.genDate = genDate;
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

    /**
     * 获取凭证路径
     *
     * @return voucher - 凭证路径
     */
    public String getVoucher() {
        return voucher;
    }

    /**
     * 设置凭证路径
     *
     * @param voucher 凭证路径
     */
    public void setVoucher(String voucher) {
        this.voucher = voucher;
    }

    /**
     * 获取接单时间
     *
     * @return accept_time - 接单时间
     */
    public Date getAcceptTime() {
        return acceptTime;
    }

    /**
     * 设置接单时间
     *
     * @param acceptTime 接单时间
     */
    public void setAcceptTime(Date acceptTime) {
        this.acceptTime = acceptTime;
    }

    /**
     * 获取装货时间
     *
     * @return up_time - 装货时间
     */
    public Date getUpTime() {
        return upTime;
    }

    /**
     * 设置装货时间
     *
     * @param upTime 装货时间
     */
    public void setUpTime(Date upTime) {
        this.upTime = upTime;
    }

    /**
     * 获取卸货时间
     *
     * @return down_time - 卸货时间
     */
    public Date getDownTime() {
        return downTime;
    }

    /**
     * 设置卸货时间
     *
     * @param downTime 卸货时间
     */
    public void setDownTime(Date downTime) {
        this.downTime = downTime;
    }

    /**
     * 获取装货提交时间
     *
     * @return up_submit_time - 装货提交时间
     */
    public Date getUpSubmitTime() {
        return upSubmitTime;
    }

    /**
     * 设置装货提交时间
     *
     * @param upSubmitTime 装货提交时间
     */
    public void setUpSubmitTime(Date upSubmitTime) {
        this.upSubmitTime = upSubmitTime;
    }

    /**
     * 获取卸货提交时间
     *
     * @return down_submit_time - 卸货提交时间
     */
    public Date getDownSubmitTime() {
        return downSubmitTime;
    }

    /**
     * 设置卸货提交时间
     *
     * @param downSubmitTime 卸货提交时间
     */
    public void setDownSubmitTime(Date downSubmitTime) {
        this.downSubmitTime = downSubmitTime;
    }

    /**
     * 获取是否装货审核
     *
     * @return isUp - 是否装货审核
     */
    public Integer getIsup() {
        return isup;
    }

    /**
     * 设置是否装货审核
     *
     * @param isup 是否装货审核
     */
    public void setIsup(Integer isup) {
        this.isup = isup;
    }

    /**
     * 获取是否卸货审核
     *
     * @return isDown - 是否卸货审核
     */
    public Integer getIsdown() {
        return isdown;
    }

    /**
     * 设置是否卸货审核
     *
     * @param isdown 是否卸货审核
     */
    public void setIsdown(Integer isdown) {
        this.isdown = isdown;
    }

    /**
     * 获取是否车辆改派
     *
     * @return isChangeCar - 是否车辆改派
     */
    public Integer getIschangecar() {
        return ischangecar;
    }

    /**
     * 设置是否车辆改派
     *
     * @param ischangecar 是否车辆改派
     */
    public void setIschangecar(Integer ischangecar) {
        this.ischangecar = ischangecar;
    }

    /**
     * 获取改派前车辆
     *
     * @return beforeCar - 改派前车辆
     */
    public String getBeforecar() {
        return beforecar;
    }

    /**
     * 设置改派前车辆
     *
     * @param beforecar 改派前车辆
     */
    public void setBeforecar(String beforecar) {
        this.beforecar = beforecar;
    }

    /**
     * 获取装货超时时间
     *
     * @return upOverTime - 装货超时时间
     */
    public Date getUpovertime() {
        return upovertime;
    }

    /**
     * 设置装货超时时间
     *
     * @param upovertime 装货超时时间
     */
    public void setUpovertime(Date upovertime) {
        this.upovertime = upovertime;
    }

    /**
     * 获取运输超时时间
     *
     * @return traverOverTime - 运输超时时间
     */
    public Date getTraverovertime() {
        return traverovertime;
    }

    /**
     * 设置运输超时时间
     *
     * @param traverovertime 运输超时时间
     */
    public void setTraverovertime(Date traverovertime) {
        this.traverovertime = traverovertime;
    }

    /**
     * 获取异常信息
     *
     * @return errorMsg - 异常信息
     */
    public String getErrormsg() {
        return errormsg;
    }

    /**
     * 设置异常信息
     *
     * @param errormsg 异常信息
     */
    public void setErrormsg(String errormsg) {
        this.errormsg = errormsg;
    }

    /**
     * 获取异常附件
     *
     * @return errorFile - 异常附件
     */
    public String getErrorfile() {
        return errorfile;
    }

    /**
     * 设置异常附件
     *
     * @param errorfile 异常附件
     */
    public void setErrorfile(String errorfile) {
        this.errorfile = errorfile;
    }

    /**
     * 获取是否装货超时
     *
     * @return isUpOver - 是否装货超时
     */
    public Integer getIsupover() {
        return isupover;
    }

    /**
     * 设置是否装货超时
     *
     * @param isupover 是否装货超时
     */
    public void setIsupover(Integer isupover) {
        this.isupover = isupover;
    }

    /**
     * 获取是否运输超时
     *
     * @return isTraverOver - 是否运输超时
     */
    public Integer getIstraverover() {
        return istraverover;
    }

    /**
     * 设置是否运输超时
     *
     * @param istraverover 是否运输超时
     */
    public void setIstraverover(Integer istraverover) {
        this.istraverover = istraverover;
    }

    /**
     * 获取实装审核备注
     *
     * @return remarkUp - 实装审核备注
     */
    public String getRemarkup() {
        return remarkup;
    }

    /**
     * 设置实装审核备注
     *
     * @param remarkup 实装审核备注
     */
    public void setRemarkup(String remarkup) {
        this.remarkup = remarkup;
    }

    /**
     * 获取实卸审核备注
     *
     * @return remarkDown - 实卸审核备注
     */
    public String getRemarkdown() {
        return remarkdown;
    }

    /**
     * 设置实卸审核备注
     *
     * @param remarkdown 实卸审核备注
     */
    public void setRemarkdown(String remarkdown) {
        this.remarkdown = remarkdown;
    }

    /**
     * 获取质保书编号
     *
     * @return zhibao - 质保书编号
     */
    public String getZhibao() {
        return zhibao;
    }

    /**
     * 设置质保书编号
     *
     * @param zhibao 质保书编号
     */
    public void setZhibao(String zhibao) {
        this.zhibao = zhibao;
    }

    /**
     * 获取审核拒绝备注
     *
     * @return refuse_text - 审核拒绝备注
     */
    public String getRefuseText() {
        return refuseText;
    }

    /**
     * 设置审核拒绝备注
     *
     * @param refuseText 审核拒绝备注
     */
    public void setRefuseText(String refuseText) {
        this.refuseText = refuseText;
    }

    /**
     * 获取手工单号
     *
     * @return sgdh - 手工单号
     */
    public String getSgdh() {
        return sgdh;
    }

    /**
     * 设置手工单号
     *
     * @param sgdh 手工单号
     */
    public void setSgdh(String sgdh) {
        this.sgdh = sgdh;
    }

    /**
     * 获取备注
     *
     * @return beizhu - 备注
     */
    public String getBeizhu() {
        return beizhu;
    }

    /**
     * 设置备注
     *
     * @param beizhu 备注
     */
    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu;
    }
}