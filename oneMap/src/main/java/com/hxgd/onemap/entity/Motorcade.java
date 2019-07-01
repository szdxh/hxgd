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
public class Motorcade {
    /**
     * id
     */
    @Id
    private Integer id;

    /**
     * 车队名称
     */
    private String name;

    /**
     * 队长
     */
    private Integer captain;

    /**
     * 区域
     */
    private Integer area;

  
}