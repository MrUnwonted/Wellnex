package com.camerinfolks.welnex.model;

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
@Table(name = "Lookup_Entity")
public class LookupEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "LOOKUPID",nullable = false)
    private Integer lookupId;

    @Column(name = "CREATEDBY",nullable = false)
    private Integer createdBy;

    @Column(name = "CREATEDDATETIME")
    private Timestamp createdDateTime;

    @Column(name = "UPDATEDBY")
    private Integer updatedBy;

    @Column(name = "UPDATEDDATETIME")
    private Timestamp updatedDateTime;

    @Column(name = "HIBVERSION")
    private Integer hibversion;

    @Column(name = "ACTIVE",nullable = false)
    private Integer active;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "LOOKUPCODE",nullable = false)
    private String lookupCode;

    @Column(name = "LOOKUPVALUE",nullable = false)
    private String lookupValue;

    @Column(name = "SORTORDER")
    private Integer sortOrder;

    @Column(name = "LOOKUPCATEGORY")
    private Integer lookupCategory;

    @Column(name = "INTRABRANCHID")
    private Integer intraBranchId;

}
