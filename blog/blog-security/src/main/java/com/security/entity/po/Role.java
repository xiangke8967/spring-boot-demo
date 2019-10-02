package com.security.entity.po;

import javax.persistence.*;
import lombok.Data;

@Data
@Table(name = "`role`")
public class Role {
    /**
     * 主键
     */
    @Id
    @Column(name = "`id`")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 角色名称
     */
    @Column(name = "`name`")
    private String name;

    /**
     * 角色描述
     */
    @Column(name = "`description`")
    private String description;
}