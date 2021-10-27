package com.example.ECommerce.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity
@Data
public class Role {
    @ManyToMany(mappedBy = "role")
    private Set<User> User;
    @Id
    private Long role_id;
    String Authority;

}
