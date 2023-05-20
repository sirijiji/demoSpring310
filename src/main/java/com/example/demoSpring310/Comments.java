package com.example.demoSpring310;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "comments")
public class Comments {
    /*
    *  id      SERIAL PRIMARY KEY,
  user_id INTEGER NOT NULL REFERENCES users(id),
  post_id INTEGER NOT NULL REFERENCES posts(id),
  body    VARCHAR(500) NOT NULL
    * */

    @Id
    @GeneratedValue
    private Long id;
}
