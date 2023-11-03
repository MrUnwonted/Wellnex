package com.camerinfolks.welnex.model;

import com.camerinfolks.welnex.model.domain.BaseDomain;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "Department")
public class Department extends BaseDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DEPARTMENT_ID",nullable = false)
    private Long departmentId;

    @Column(name = "DEPARTMENT_CODE")
    private String departmentCode;

    @Column(name = "COST_CENTER_ACCODE")
    private String costCenterAccode;

    @Column(name = "DEPARTMENT_TYPE_ID")
    private Integer departmentTypeId;

    @Column(name = "DISPLAYNAME")
    private String displayName;

    @Column(name = "HODID")
    private Integer hodID;

    @Column(name = "INCHARGEID")
    private Integer inChargeId;

    @Column(name = "SITEID")
    private String siteId;

    @Column(name = "DEPARTMENT_NAME")
    private String departmentName;

    @Column(name = "STARTED_ON")
    private Timestamp startedOn;

    @Column(name = "DESCRIPTION")
    private String description;


}
