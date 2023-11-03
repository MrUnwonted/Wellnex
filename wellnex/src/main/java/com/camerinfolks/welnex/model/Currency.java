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
    @Column(name = "CURRENCYID")
    private Integer id;


}
