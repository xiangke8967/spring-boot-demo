package com.security.entity.po;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "`authority`")
public class Authority {
    /**
     * 主键ID
     */
    @Id
    @Column(name = "`id`")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 权限名称
     */
    @Column(name = "`authority_name`")
    private String authorityName;

    /**
     * 权限描述
     */
    @Column(name = "`authority_dec`")
    private String authorityDec;

    /**
     * 前端路由
     */
    @Column(name = "`route`")
    private String route;
}