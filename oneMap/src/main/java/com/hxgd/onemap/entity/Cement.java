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
public class Cement {
    /**
     * id
     */
    @Id
    private Integer id;

    /**
     * 厂家名称
     */
    private String name;

    /**
     * 具体位置
     */
    private String position;

    /**
     * 地理坐标
     */
    private String location;

    /**
     * 所属区域
     */
    private Integer area;

    /**
     * 联系人
     */
    private String contact;

    /**
     * 联系电话
     */
    private String tel;

    /**
     * 接单范围
     */
    private Double radio;

 
}