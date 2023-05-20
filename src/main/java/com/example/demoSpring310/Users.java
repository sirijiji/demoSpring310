package com.example.demoSpring310;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class Users {

    /*
    * CREATE  TABLE IF NOT EXISTS users(
  id    SERIAL PRIMARY KEY,
  email VARCHAR(40) NOT NULL UNIQUE
);
    * */
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, length = 40)
    private String email;

}
