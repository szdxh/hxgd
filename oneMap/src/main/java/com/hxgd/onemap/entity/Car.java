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
public class Car {
    /**
     * id
     */
    @Id
    private Integer id;

    /**
     * 所属车队
     */
    @Column(name = "moto_id")
    private Integer motoId;

    /**
     * 车辆类型
     */
    private Integer type;

    /**
     * 车牌号
     */
    private String license;

    /**
     * 驾驶员
     */
    private Integer driver;

    /**
     * 车辆状态
     */
    private Integer state;

    /**
     * 位置
     */
    private String position;

 
}