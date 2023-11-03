package com.camerinfolks.welnex.model;

import com.camerinfolks.welnex.model.domain.BaseDomain;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "WELLNEX_USER")
public class User extends BaseDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USERID",nullable = false)
    private Integer userId;

    @Column(name = "LOGIN")
    private String login;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "USERNAME")
    private String emailId;

    @Column(name = "EMAILID")
    private String username;

    @Column(name = "ISACTIVE")
    private Integer isActive;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "TIMEZONE")
    private String timezone;

    @Column(name = "USERTYPE")
    private Integer userType;

    @Column(name = "PASSWORDMODIFIEDDATE")
    private Integer passwordModificationDate;

    @Column(name = "MAXFAILEDLOGINATTEMPT")
    private Integer maxFailedLoginAttempt;

    @Column(name = "ISPASSWORDEXPIRES")
    private Integer isPasswordExpires;

    @Column(name = "PASSWORDEXPIRYDAYS")
    private Integer passwordExpiryDays;

    @Column(name = "PASSWORDCHANGEREQD")
    private Integer passwordChangerEqd;

    @Column(name = "DEFAULTDEPARTMENT_ID")
    private Integer defaultDepartmentId;

    @Column(name = "EMPLOYEE_ID")
    private Integer employeeId;

    @Column(name = "TEMPLATEUSER")
    private Integer templateUser;

    @Column(name = "IS_EXTERNALUSER")
    private Integer isExternalUser;

    @Column(name = "INTRABRANCHID")
    private Integer intraBranchId;



}
