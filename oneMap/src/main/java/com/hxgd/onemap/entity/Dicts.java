package com.hxgd.onemap.entity;

import javax.persistence.*;

public class Dicts {
    @Id
    private Integer id;

    /**
     * 字典值
     */
    private String value;

    /**
     * 字典中文
     */
    private String name;

    /**
     * 表名
     */
    private String object;

    /**
     * 字段名
     */
    private String field;

    /**
     * 扩展Json
     */
    private String ext;

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
     * 获取字典值
     *
     * @return value - 字典值
     */
    public String getValue() {
        return value;
    }

    /**
     * 设置字典值
     *
     * @param value 字典值
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * 获取字典中文
     *
     * @return name - 字典中文
     */
    public String getName() {
        return name;
    }

    /**
     * 设置字典中文
     *
     * @param name 字典中文
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取表名
     *
     * @return object - 表名
     */
    public String getObject() {
        return object;
    }

    /**
     * 设置表名
     *
     * @param object 表名
     */
    public void setObject(String object) {
        this.object = object;
    }

    /**
     * 获取字段名
     *
     * @return field - 字段名
     */
    public String getField() {
        return field;
    }

    /**
     * 设置字段名
     *
     * @param field 字段名
     */
    public void setField(String field) {
        this.field = field;
    }

    /**
     * 获取扩展Json
     *
     * @return ext - 扩展Json
     */
    public String getExt() {
        return ext;
    }

    /**
     * 设置扩展Json
     *
     * @param ext 扩展Json
     */
    public void setExt(String ext) {
        this.ext = ext;
    }
}