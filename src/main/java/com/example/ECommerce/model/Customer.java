package com.example.ECommerce.model;

import lombok.Data;
import lombok.NonNull;
import javax.persistence.*;
import java.util.List;

@Entity
@PrimaryKeyJoinColumn(name = "user_id")
@Data
public class Customer extends User {
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "customer")
    private List<Orders> orders;
    @MapsId
    @OneToOne(mappedBy="customer")
    private Cart cart;



    @NonNull
    private Long contact;


}
