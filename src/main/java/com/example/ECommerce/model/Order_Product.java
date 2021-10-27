package com.example.ECommerce.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Order_Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    int quantity;
    int price;
    int product_variation_id;

    @ManyToOne
    @JoinColumn(name ="order_id")
    private Orders orders;

    @OneToOne(mappedBy = "orderProduct")
    private Order_status order_status;
}
