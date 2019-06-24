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

   
}