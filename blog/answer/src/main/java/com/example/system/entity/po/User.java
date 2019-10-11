package com.example.system.entity.po;

import javax.persistence.*;
import lombok.Data;

@Data
@Table(name = "`t_user`")
public class User {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    @Column(name = "`account`")
    private String account;

    @Column(name = "`password`")
    private String password;
}