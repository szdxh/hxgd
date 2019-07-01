package com.hxgd.onemap.entity;

import java.util.Date;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Msg {
    @Id
    private Integer id;

    /**
     * 通知内容
     */
    private String context;

    /**
     * 通知类型
     */
    private Integer type;

    /**
     * 通知对象
     */
    private String target;

    private Date time;

 
}