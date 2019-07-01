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
public class Materials {
    @Id
    private Integer id;

    /**
     * 公司名称
     */
    private String name;

    /**
     * 地址
     */
    private String position;

    /**
     * 联系人
     */
    private String contact;

    /**
     * 联系电话
     */
    private String phone;

 
}