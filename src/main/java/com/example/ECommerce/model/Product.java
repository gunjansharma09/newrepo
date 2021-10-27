package com.example.ECommerce.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Product {
    @Id
    int id;
    int seller_user_id;
    String name;
    String description;
    int category_id;
    boolean is_cancellable;
    boolean is_returnable;
    String Brand;
    boolean is_active;
   /* @OneToOne(mappedBy = "product")
    private Category category;*/
}
