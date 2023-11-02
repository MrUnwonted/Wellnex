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
@Table(name = "EmployeeMaster")
public class LookupCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

}
