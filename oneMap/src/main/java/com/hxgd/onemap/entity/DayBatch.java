package com.hxgd.onemap.entity;

import javax.persistence.*;

@Table(name = "day_batch")
public class DayBatch {
    /**
     * 主键
     */
    @Id
    private Integer id;

    /**
     * 当日批次
     */
    private Integer current;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取当日批次
     *
     * @return current - 当日批次
     */
    public Integer getCurrent() {
        return current;
    }

    /**
     * 设置当日批次
     *
     * @param current 当日批次
     */
    public void setCurrent(Integer current) {
        this.current = current;
    }
}