package com.example.demo.model;

import javax.persistence.*;

@Entity(name = "User")
@Table(name="user_2")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;


    public String name;

}

