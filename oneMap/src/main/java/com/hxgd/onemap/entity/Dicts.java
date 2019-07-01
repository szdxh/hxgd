package com.hxgd.onemap.entity;

import javax.persistence.*;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
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

 
}