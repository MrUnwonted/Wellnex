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
@Table(name = "Lookup_Category")
public class LookupEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "LOOKUPID")
    private Number lookupId;
    @Column(name = "CREATEDBY")
    private Number createdBy;
    @Column(name = "CREATEDDATETIME",nullable = false)
    private Date createdDateTime;
    @Column(name = "CREATEDDATETIME",nullable = false)
    private Number updatedBy;
    @Column(name = "UPDATEDDATETIME",nullable = false)
    private Date updatedDateTime;
    @Column(name = "HIBVERSION",nullable = false)
    private Number hibversion;
    @Column(name = "ACTIVE")
    private Number active;
    @Column(name = "DESCRIPTION",nullable = false)
    private String description;
    @Column(name = "LOOKUPCODE")
    private String lookupCode;
    @Column(name = "LOOKUPVALUE")
    private String lookupValue;
    @Column(name = "SORTORDER",nullable = false)
    private Number sortOrder;
    @Column(name = "LOOKUPCATEGORY",nullable = false)
    private Number lookupCategory;
    @Column(name = "INTRABRANCHID",nullable = false)
    private Number intraBranchId;

}
