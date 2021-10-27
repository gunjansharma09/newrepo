package com.example.ECommerce.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
@Data
public class Address {
    @Id
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    private String city;
    private String state;
    private String country;
    private String address_lone;
    private Integer zip_code;
    private String label;

}
