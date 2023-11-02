package com.camerinfolks.welnex.model;

import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(name = "Department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "DEPARTMENT_TYPE",nullable = false)
    private String departmentType;
    @Column(name = "SITE",nullable = false)
    private String site;
    @Column(name = "DEPARTMENT_NAME",nullable = false)
    private String departmentName;
    @Column(name = "STARTED_ON",nullable = false)
    private Date startedOn;
    @Column(name = "IS_ACTIVE",nullable = false)
    private Boolean isActive;
    @Column(name = "DESCRIPTION",nullable = false)
    private String description;
    @Column(name = "HOD",nullable = false)
    private String HOD;

}
