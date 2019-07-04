package com.hxgd.onemap.entity;

import javax.persistence.*;

public class Area {
    /**
     * id
     */
    @Id
    private Integer id;

    /**
     * 区域编码
     */
    private String code;

    /**
     * 区域名称
     */
    private String name;

    /**
     * 区域描述
     */
    private String content;

    /**
     * 接单范围（km）
     */
    private Integer meters;

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
     * 获取区域编码
     *
     * @return code - 区域编码
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置区域编码
     *
     * @param code 区域编码
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取区域名称
     *
     * @return name - 区域名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置区域名称
     *
     * @param name 区域名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取区域描述
     *
     * @return content - 区域描述
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置区域描述
     *
     * @param content 区域描述
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取接单范围（km）
     *
     * @return meters - 接单范围（km）
     */
    public Integer getMeters() {
        return meters;
    }

    /**
     * 设置接单范围（km）
     *
     * @param meters 接单范围（km）
     */
    public void setMeters(Integer meters) {
        this.meters = meters;
    }
}