package com.hxgd.onemap.entity;

import javax.persistence.*;

public class Motorcade {
    /**
     * id
     */
    @Id
    private Integer id;

    /**
     * 车队名称
     */
    private String name;

    /**
     * 队长
     */
    private Integer captain;

    /**
     * 区域
     */
    private Integer area;

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
     * 获取车队名称
     *
     * @return name - 车队名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置车队名称
     *
     * @param name 车队名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取队长
     *
     * @return captain - 队长
     */
    public Integer getCaptain() {
        return captain;
    }

    /**
     * 设置队长
     *
     * @param captain 队长
     */
    public void setCaptain(Integer captain) {
        this.captain = captain;
    }

    /**
     * 获取区域
     *
     * @return area - 区域
     */
    public Integer getArea() {
        return area;
    }

    /**
     * 设置区域
     *
     * @param area 区域
     */
    public void setArea(Integer area) {
        this.area = area;
    }
}