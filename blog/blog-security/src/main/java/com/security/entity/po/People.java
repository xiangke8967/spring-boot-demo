package com.security.entity.po;

import javax.persistence.*;
import lombok.Data;

@Data
@Table(name = "`people`")
public class People {
    /**
     * 主键ID
     */
    @Id
    @Column(name = "`id`")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    @Column(name = "`name`")
    private String name;

    @Column(name = "`account`")
    private String account;

    @Column(name = "`password`")
    private String password;
}