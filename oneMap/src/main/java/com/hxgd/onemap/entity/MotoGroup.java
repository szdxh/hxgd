package com.hxgd.onemap.entity;

import javax.persistence.*;

@Table(name = "moto_group")
public class MotoGroup {
    /**
     * 主键
     */
    @Id
    private Integer id;

    /**
     * 车队组
     */
    private String name;

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
     * 获取车队组
     *
     * @return name - 车队组
     */
    public String getName() {
        return name;
    }

    /**
     * 设置车队组
     *
     * @param name 车队组
     */
    public void setName(String name) {
        this.name = name;
    }
}