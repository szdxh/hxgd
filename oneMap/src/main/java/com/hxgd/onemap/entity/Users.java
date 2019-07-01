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
public class Users {
    @Id
    private Integer id;

    @Column(name = "eova_id")
    private Integer eovaId;

    /**
     * 登录账户
     */
    @Column(name = "login_id")
    private String loginId;

    /**
     * 录登密码
     */
    @Column(name = "login_pwd")
    private String loginPwd;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 角色id
     */
    private Integer rid;

    private String shenfenid;

  
}