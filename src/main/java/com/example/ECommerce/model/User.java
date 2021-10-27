package com.example.ECommerce.model;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

@Entity
@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "users")
public class User {
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id" ,referencedColumnName = "id" )
    Set<Address> address;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name="user_role",
            joinColumns = { @JoinColumn(name = "user_id",referencedColumnName = "id") },
            inverseJoinColumns = { @JoinColumn(name = "role_id",referencedColumnName ="role_id") }
    )
    Set<Role> role;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Email(message = "Email is not valid", regexp="{(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])}")
    @NotEmpty(message = "Email cannot be empty")
    private String email;
    @NotEmpty
    @Column(name = "first_name")
    private String firstName;
    @NotEmpty
    @Column(name = "last_name")
    private String lastName;

    public Set<Address> getAddress() {
        return address;
    }

    public void setAddress(Set<Address> address) {
        this.address = address;
    }

    public Set<Role> getRole() {
        return role;
    }

    public void setRole(Set<Role> role) {
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isIs_Deleted() {
        return is_Deleted;
    }

    public void setIs_Deleted(boolean is_Deleted) {
        this.is_Deleted = is_Deleted;
    }

    public boolean isIs_Active() {
        return is_Active;
    }

    public void setIs_Active(boolean is_Active) {
        this.is_Active = is_Active;
    }

    public boolean isIs_Expired() {
        return is_Expired;
    }

    public void setIs_Expired(boolean is_Expired) {
        this.is_Expired = is_Expired;
    }

    public boolean isIs_Locked() {
        return is_Locked;
    }

    public void setIs_Locked(boolean is_Locked) {
        this.is_Locked = is_Locked;
    }

    public int getInvalid_Attempt_Count() {
        return invalid_Attempt_Count;
    }

    public void setInvalid_Attempt_Count(int invalid_Attempt_Count) {
        this.invalid_Attempt_Count = invalid_Attempt_Count;
    }

    @NotEmpty
    private String password;
    private boolean is_Deleted;
    private boolean is_Active;
    private boolean is_Expired;
    private boolean is_Locked;
    private int invalid_Attempt_Count;

}