package com.camerinfolks.welnex.model;

import com.camerinfolks.welnex.model.domain.BaseDomain;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Currency extends BaseDomain {

    @Id
    @Column(name = "CURRENCYID",nullable = false)
    private Integer id;


    @Column(name = "ALIASNAME")
    private String  aliasName;

    @Column(name = "ISBASECURRENCY")
    private Integer isBaseCurrency;

    @Column(name = "CURRENCYCODE")
    private String currencyCode;

    @Column(name = "CURRENCYNAME")
    private String currencyName;

    @Column(name = "LOWERDENOMNAME")
    private String lowerDenomeName;

    @Column(name = "ISPREFIX")
    private Integer isPrefix;

    @Column(name = "CURRENCYSYMBOL")
    private String currencySymbol;


}
