package com.camerinfolks.welnex.model.domain;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@MappedSuperclass
@Getter
@Setter
public class BaseDomain {

    @Column(name = "ISACTIVE",nullable = false)
    private Integer isActive;

    @Column(name = "INTRABRANCHID")
    private Integer intraBranchId;

    @Column(name = "CREATEDBY", nullable = false)
    private Integer createdBy;

    @Column(name = "CREATEDDATETIME")
    private Timestamp createdDateTime;

    @Column(name = "UPDATEDBY")
    private Integer updatedBy;

    @Column(name = "UPDATEDDATETIME")
    private Timestamp updatedDateTime;

    @Column(name = "HIBVERSION")
    private Integer hibVersion;

}
