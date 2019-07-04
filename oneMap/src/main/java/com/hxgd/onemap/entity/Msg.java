package com.hxgd.onemap.entity;

import java.util.Date;
import javax.persistence.*;

public class Msg {
    @Id
    private Integer id;

    /**
     * 通知内容
     */
    private String context;

    /**
     * 通知类型
     */
    private Integer type;

    /**
     * 通知对象
     */
    private String target;

    private Date time;

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
     * 获取通知内容
     *
     * @return context - 通知内容
     */
    public String getContext() {
        return context;
    }

    /**
     * 设置通知内容
     *
     * @param context 通知内容
     */
    public void setContext(String context) {
        this.context = context;
    }

    /**
     * 获取通知类型
     *
     * @return type - 通知类型
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置通知类型
     *
     * @param type 通知类型
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取通知对象
     *
     * @return target - 通知对象
     */
    public String getTarget() {
        return target;
    }

    /**
     * 设置通知对象
     *
     * @param target 通知对象
     */
    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * @return time
     */
    public Date getTime() {
        return time;
    }

    /**
     * @param time
     */
    public void setTime(Date time) {
        this.time = time;
    }
}