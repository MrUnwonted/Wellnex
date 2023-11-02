package com.camerinfolks.welnex.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "EmployeeMaster")
public class  EmployeeMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "STATUS",nullable = false)
    private String status;
    @Column(name = "DATE_OF_BIRTH",nullable = false)
    private Date dateOfBirth;
    @Column(name = "DESIGNATION",nullable = false)
    private String designation;
    @Column(name = "DATE_OF_JOIN",nullable = false)
    private Date dateOfJoin;
    @Column(name = "PREFIX",nullable = false)
    private String prefix;
    @Column(name = "LAST_NAME",nullable = false)
    private String lastName;
    @Column(name = "DEPARTMENT",nullable = false)
    private String department;
    @Column(name = "FIRST_REPORTING_AUTHORITY",nullable = false)
    private String firstReportingAuthority;
    @Column(name = "BRANCH",nullable = false)
    private String branch;
    @Column(name = "EMPLOYEE_TYPE",nullable = false)
    private String employeeType;
    @Column(name = "LEAVE_RULE",nullable = false)
    private String leaveRule;
    @Column(name = "FIRST_NAME",nullable = false)
    private String firstName;
    @Column(name = "GENDER",nullable = false)
    private String gender;
    @Column(name = "MOBILE_NUMBER",nullable = false,unique = true)
    private Integer mobileNumber;
    @Column(name = "EMPLOYEE_CATEGORY",nullable = false)
    private String employeeCategory;

}
