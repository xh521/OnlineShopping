package com.example.onlineshopping.entity;

import lombok.Data;
import org.hibernate.annotations.Proxy;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Proxy(lazy = false)
@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true,nullable = false)
    @Size(min = 3,max = 10)
    private String userName;

    @Column(unique = true,nullable = false)
    @Size(min = 6,max = 18)
    private String password;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public User() {
    }
}
