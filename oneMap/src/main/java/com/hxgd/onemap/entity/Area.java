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
public class Area {
    /**
     * id
     */
    @Id
    private Integer id;

    /**
     * 区域编码
     */
    private String code;

    /**
     * 区域名称
     */
    private String name;

    /**
     * 区域描述
     */
    private String content;

    /**
     * 接单范围（km）
     */
    private Integer meters;


}