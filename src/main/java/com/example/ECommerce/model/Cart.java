package com.example.ECommerce.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
public class Cart implements Serializable {

    @OneToOne(cascade=CascadeType.ALL)
    @Id
    private Customer customer;

    private int quantity;
    private boolean is_wishlist_item;
}