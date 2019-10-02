package com.security.entity.po;

import javax.persistence.*;
import lombok.Data;

@Data
@Table(name = "`people_role`")
public class PeopleRole {
    /**
     * 主键ID
     */
    @Id
    @Column(name = "`id`")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 角色ID
     */
    @Column(name = "`role_id`")
    private Integer roleId;

    /**
     * 用户ID
     */
    @Column(name = "`people_id`")
    private Integer peopleId;
}