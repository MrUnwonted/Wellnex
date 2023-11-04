package com.camerinfolks.welnex.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "COUNTRY_MASTER")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COUNTRY_ID",nullable = false)
    private Integer countryId;

    @Column(name = "CODE",nullable = false)
    private String code;

    @Column(name = "PHONECODE")
    private String phoneCode;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "ISGROUP",nullable = false)
    private Integer isGroup;

    @Column(name = "TYPENUM")
    private Integer typeNum;

    @Column(name = "PARENT_ID")
    private Integer parentId;

    @Column(name = "NATIONALITY")
    private String nationality;


}
