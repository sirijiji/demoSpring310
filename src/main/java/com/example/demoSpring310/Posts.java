package com.example.demoSpring310;

import jakarta.persistence.*;

@Entity
@Table(name = "posts")
public class Posts {

    /*
    * CREATE TABLE IF NOT EXISTS posts(
  id      SERIAL PRIMARY KEY,
  user_id INTEGER NOT NULL REFERENCES users(id),
  title   VARCHAR(100) NOT NULL UNIQUE
);
    * */

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, length = 40)
    private Integer userId;

    @Column(nullable = false, length = 100)
    private String title;
}
