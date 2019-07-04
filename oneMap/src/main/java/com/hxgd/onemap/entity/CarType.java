package com.hxgd.onemap.entity;

import javax.persistence.*;

@Table(name = "car_type")
public class CarType {
    @Id
    private Integer id;

    /**
     * 类型名称
     */
    private String name;

    /**
     * 载重（吨）
     */
    private Integer transport;

    /**
     * 有效容积（m³）
     */
    private Float bulk;

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
     * 获取类型名称
     *
     * @return name - 类型名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置类型名称
     *
     * @param name 类型名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取载重（吨）
     *
     * @return transport - 载重（吨）
     */
    public Integer getTransport() {
        return transport;
    }

    /**
     * 设置载重（吨）
     *
     * @param transport 载重（吨）
     */
    public void setTransport(Integer transport) {
        this.transport = transport;
    }

    /**
     * 获取有效容积（m³）
     *
     * @return bulk - 有效容积（m³）
     */
    public Float getBulk() {
        return bulk;
    }

    /**
     * 设置有效容积（m³）
     *
     * @param bulk 有效容积（m³）
     */
    public void setBulk(Float bulk) {
        this.bulk = bulk;
    }
}