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
public class Section {
    /**
     * id
     */
    @Id
    private Integer id;

    /**
     * 标段名称
     */
    private String name;

    /**
     * 所属施工方
     */
    @Column(name = "carry_id")
    private Integer carryId;

    /**
     * 地理坐标
     */
    private String location;

    /**
     * 所属区域
     */
    private Integer area;

    /**
     * 库容量
     */
    private Double capacity;

    /**
     * 库存量
     */
    private Double stock;

    /**
     * 日消耗量
     */
    private Double daily;

    /**
     * 库存红线
     */
    @Column(name = "red_line")
    private Double redLine;

    /**
     * 调度主管
     */
    private Integer contact;

    /**
     * 调度员
     */
    private Integer control;

    /**
     * 数据处理员
     */
    private Integer deal;

  
}