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
@Table(name = "Lookup_Category")
public class LookupCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CATEGORYID",nullable = false)
    private Integer categpryId;

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

    @Column(name = "CATEGORYNAME")
    private String categoryName;

    @Column(name = "MODIFIABLE")
    private Integer modifiable;

    @Column(name = "INTRABRANCHID")
    private Integer intraBranchId;

}
