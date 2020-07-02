package com.ubdi.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.sql.Timestamp;

@Data
public class User {

    /**
     * 主键
     */
    @Id
    private Long id;

    /**
     * 用户名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 登陆名
     */
    @Column(name = "login_name")
    private String loginName;

    /**
     * 密码
     */
    private String password;

    /**
     * 身份证号
     */
    @Column(name = "id_card")
    private String idCard;

    /**
     * 手机号
     */
    @Column(name = "cell_phone")
    private String cellPhone;

    /**
     * 街道ID
     */
    @Column(name = "street_id")
    private Long streetId;

    /**
     * 社区ID
     */
    @Column(name = "community_id")
    private Long communityId;

    /**
     * 创建人
     */
    @Column(name = "create_user")
    private Long createUser;

    /**
     * 修改人
     */
    @Column(name = "update_user")
    private Long updateUser;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Timestamp createTime;

    /**
     * 修改时间
     */
    @Column(name = "update_time")
    private Timestamp updateTime;

    /**
     * 用户状态 0 失效 1 有效
     */
    @Column(name = "status")
    private String status;

}