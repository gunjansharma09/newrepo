package com.example.ECommerce.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Order_status implements Serializable {
    @Id
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="order_product_id")
    private Order_Product orderProduct;
    int from_status;
    int to_status;
    String transition_notes_comments;
}
