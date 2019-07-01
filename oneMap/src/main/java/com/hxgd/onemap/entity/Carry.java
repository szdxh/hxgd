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
public class Carry {
    /**
     * id
     */
    @Id
    private Integer id;

    /**
     * 施工方名称
     */
    private String name;

    /**
     * 负责人
     */
    private Integer contact;

    /**
     * 所属公司
     */
    private String company;

    /**
     * 所在地
     */
    private String position;

    /**
     * 默认货物 id
     */
    @Column(name = "huowu_id")
    private Integer huowuId;

  
}