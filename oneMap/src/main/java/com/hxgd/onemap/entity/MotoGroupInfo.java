package com.hxgd.onemap.entity;

import javax.persistence.*;

@Table(name = "moto_group_info")
public class MotoGroupInfo {
    /**
     * 主键
     */
    @Id
    private Integer id;

    /**
     * 车队组
     */
    private Integer gid;

    /**
     * 车队
     */
    private Integer mid;

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
     * @return gid - 车队组
     */
    public Integer getGid() {
        return gid;
    }

    /**
     * 设置车队组
     *
     * @param gid 车队组
     */
    public void setGid(Integer gid) {
        this.gid = gid;
    }

    /**
     * 获取车队
     *
     * @return mid - 车队
     */
    public Integer getMid() {
        return mid;
    }

    /**
     * 设置车队
     *
     * @param mid 车队
     */
    public void setMid(Integer mid) {
        this.mid = mid;
    }
}