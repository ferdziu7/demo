package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table (name = "Word")
public class Word {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    public String wordpl;
    public String wordeng;

}
