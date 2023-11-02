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
@Table(name = "EmployeeMaster")
public class  EmployeeMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "EMPLOYEE_ID")
    private Number employeeId;

    @Column(name = "STATUS",nullable = false)
    private Number status;

    @Column(name = "DATE_OF_BIRTH",nullable = false)
    private LocalDate dateOfBirth;

    @Column(name = "DESIGNATION",nullable = false)
    private Number designation;

    @Column(name = "DATE_OF_JOIN",nullable = false)
    private LocalDate dateOfJoin;

    @Column(name = "PREFIX",nullable = false)
    private Number prefix;

    @Column(name = "LAST_NAME",nullable = false)
    private String lastName;

    @Column(name = "DEPARTMENT_ID",nullable = false)
    private Number department;

    @Column(name = "FIRST_REPORTING_AUTHORITY",nullable = false)
    private Number firstReportingAuthority;

    @Column(name = "BRANCH_ID",nullable = false)
    private Number branchId;

    @Column(name = "EMPLOYEE_TYPE",nullable = false)
    private Number employeeType;

    @Column(name = "LEAVERULETYPE_ID",nullable = false)
    private Number leaveRuleTypeId;

    @Column(name = "FIRST_NAME",nullable = false)
    private String firstName;

    @Column(name = "GENDERS",nullable = false)
    private Number genders;

    @Column(name = "MOBILE_NUMBER",nullable = false,unique = true)
    private Integer mobileNumber;

    @Column(name = "EMPLOYEE_CATEGORY",nullable = false)
    private Number employeeCategory;

}
