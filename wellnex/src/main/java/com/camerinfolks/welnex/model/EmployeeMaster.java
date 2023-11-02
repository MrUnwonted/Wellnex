package com.camerinfolks.welnex.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "Employee")
public class  EmployeeMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "EMPLOYEE_ID")
    private Integer employeeId;

    @Column(name = "STATUS",nullable = false)
    private Integer status;

    @Column(name = "DATE_OF_BIRTH",nullable = false)
    private LocalDate dateOfBirth;

    @Column(name = "DESIGNATION",nullable = false)
    private Integer designation;

    @Column(name = "DATE_OF_JOIN",nullable = false)
    private LocalDate dateOfJoin;

    @Column(name = "PREFIX",nullable = false)
    private Integer prefix;

    @Column(name = "LAST_NAME",nullable = false)
    private String lastName;

    @Column(name = "DEPARTMENT_ID",nullable = false)
    private Integer department;

    @Column(name = "FIRST_REPORTING_AUTHORITY",nullable = false)
    private Integer firstReportingAuthority;

    @Column(name = "BRANCH_ID",nullable = false)
    private Integer branchId;

    @Column(name = "EMPLOYEE_TYPE",nullable = false)
    private Integer employeeType;

    @Column(name = "LEAVERULETYPE_ID",nullable = false)
    private Integer leaveRuleTypeId;

    @Column(name = "FIRST_NAME",nullable = false)
    private String firstName;

    @Column(name = "GENDERS",nullable = false)
    private Integer genders;

    @Column(name = "MOBILE_NUMBER",nullable = false,unique = true)
    private Integer mobileNumber;

    @Column(name = "EMPLOYEE_CATEGORY",nullable = false)
    private Integer employeeCategory;

}
