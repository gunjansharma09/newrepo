package com.example.ECommerce.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name = "user_id")
@Data
public class Seller  extends User{
    private Integer gst;
    private Integer company_contact;
    private String company_name;
}
