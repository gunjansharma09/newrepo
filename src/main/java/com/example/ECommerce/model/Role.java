package com.example.ECommerce.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity
public class Role {
    @ManyToMany(mappedBy = "role")
    private Set<User> User;
    @Id
    private Long role_id;
    String Authority;

}
