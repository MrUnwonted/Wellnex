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
@Table(name = "Lookup_Entity")
public class LookupEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "LOOKUPID",nullable = false)
    private Integer lookupId;

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

}
