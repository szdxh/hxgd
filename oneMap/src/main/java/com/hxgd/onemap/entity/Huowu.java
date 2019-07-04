package com.hxgd.onemap.entity;

import javax.persistence.*;

public class Huowu {
    @Id
    private Integer id;

    /**
     * 品名
     */
    private String name;

    /**
     * 类型
     */
    private Integer type;

    /**
     * 包装
     */
    private String baozhuang;

    /**
     * 规格
     */
    private String guige;

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
     * 获取品名
     *
     * @return name - 品名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置品名
     *
     * @param name 品名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取类型
     *
     * @return type - 类型
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置类型
     *
     * @param type 类型
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取包装
     *
     * @return baozhuang - 包装
     */
    public String getBaozhuang() {
        return baozhuang;
    }

    /**
     * 设置包装
     *
     * @param baozhuang 包装
     */
    public void setBaozhuang(String baozhuang) {
        this.baozhuang = baozhuang;
    }

    /**
     * 获取规格
     *
     * @return guige - 规格
     */
    public String getGuige() {
        return guige;
    }

    /**
     * 设置规格
     *
     * @param guige 规格
     */
    public void setGuige(String guige) {
        this.guige = guige;
    }
}