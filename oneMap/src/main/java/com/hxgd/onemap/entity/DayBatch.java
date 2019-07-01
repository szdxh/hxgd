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
@Table(name = "day_batch")
public class DayBatch {
    /**
     * 主键
     */
    @Id
    private Integer id;

    /**
     * 当日批次
     */
    private Integer current;

 
}