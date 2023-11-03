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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EMPLOYEE_ID",nullable = false)
    private Integer employeeId;

    @Column(name = "STATUS")
    private Integer status;

    @Column(name = "DOB")
    private LocalDate dateOfBirth;

    @Column(name = "DESIGNATION")
    private Integer designation;

    @Column(name = "DATEOFJOIN")
    private LocalDate dateOfJoin;

    @Column(name = "PREFIX")
    private Integer prefix;

    @Column(name = "LASTNAME")
    private String lastName;

    @Column(name = "DEPARTMENT_ID")
    private Integer department;

    @Column(name = "REPORTING_AUTHORITY")
    private Integer reportingAuthority;

    @Column(name = "BRANCHID")
    private Integer branchId;

    @Column(name = "EMPLOYEETYPE")
    private Integer employeeType;

    @Column(name = "LEAVERULETYPEID")
    private Integer leaveRuleTypeId;

    @Column(name = "FIRSTNAME")
    private String firstName;

    @Column(name = "GENDERS")
    private Integer genders;

    @Column(name = "MOBILE_NUMBER")
    private Long mobileNumber;

    @Column(name = "EMPLOYEE_CATEGORY")
    private Integer employeeCategory;

}
