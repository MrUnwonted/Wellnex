package com.camerinfolks.welnex.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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

    @Column(name = "CATEGORYNAME")
    private String categoryName;

    @Column(name = "MODIFIABLE")
    private Integer modifiable;

    @Column(name = "INTRABRANCHID")
    private Integer intraBranchId;

}
