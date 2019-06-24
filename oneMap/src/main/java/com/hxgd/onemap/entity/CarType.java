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

 
}