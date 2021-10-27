package com.example.ECommerce.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    int amount_paid;
    @Temporal(TemporalType.TIMESTAMP)
    private Date date_created;
    private String customer_address_city;
    private String customer_address_state;
    private String customer_address_country;
    private String customer_addressLine;
    private int customer_address_zip_code;
    private String customer_address_label;
    @ManyToOne
    @JoinColumn(name="customer_id")
    private Customer customer;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "orders")
    private List<Order_Product> orderProduct;
}
