package com.camerinfolks.welnex.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "Lookup_Category")
public class LookupCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CATEGORYID")
    private Number categpryId;

    @Column(name = "CREATEDBY")
    private Number createdBy;

    @Column(name = "CREATEDDATETIME")
    private Date createdDateTime;

    @Column(name = "CREATEDDATETIME",nullable = false)
    private Number updatedBy;

    @Column(name = "UPDATEDDATETIME",nullable = false)
    private Date updatedDateTime;

    @Column(name = "HIBVERSION",nullable = false)
    private Number hibversion;

    @Column(name = "ACTIVE")
    private Number active;

    @Column(name = "CATEGORYNAME",nullable = false)
    private String categoryName;

    @Column(name = "MODIFIABLE",nullable = false)
    private Number modifiable;

    @Column(name = "INTRABRANCHID",nullable = false)
    private Number intraBranchId;

}
