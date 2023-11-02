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
    @Column(name = "DEPARTMENT_ID")
    private Long id;
    @Column(name = "DEPARTMENT_TYPE",nullable = false)
    private String departmentType;
    @Column(name = "CREATEDBY")
    private Number createdBy;
    @Column(name = "CREATEDDATETIME",nullable = false)
    private Date createdDateTime;
    @Column(name = "UPDATEDBY",nullable = false)
    private Number updatedBy;
    @Column(name = "UPDATEDDATETIME",nullable = false)
    private Number updatedDateTime;
    @Column(name = "HIBVERSION",nullable = false)
    private Date hibVersion;
    @Column(name = "DEPARTMENT_CODE",nullable = false)
    private Number departmentCode;
    @Column(name = "COST_CENTER_ACCODE",nullable = false)
    private String costCenterAccode;
    @Column(name = "DEPARTMENT_TYPE_ID",nullable = false)
    private Number departmentTypeId;
    @Column(name = "DISPLAYNAME",nullable = false)
    private String displayName;
    @Column(name = "HODID",nullable = false)
    private Number hodID;
    @Column(name = "INTRABRANCHID",nullable = false)
    private Number inChargeId;
    @Column(name = "SITE",nullable = false)
    private String site;
    @Column(name = "DEPARTMENT_NAME",nullable = false)
    private String departmentName;
    @Column(name = "STARTED_ON",nullable = false)
    private Date startedOn;
    @Column(name = "IS_ACTIVE")
    private Number isActive;
    @Column(name = "DESCRIPTION",nullable = false)
    private String description;
    @Column(name = "HOD",nullable = false)
    private String HOD;

}
