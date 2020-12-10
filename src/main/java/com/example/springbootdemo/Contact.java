package com.example.springbootdemo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data @Entity
public class Contact {
    @Id @GeneratedValue
    Long id;
    String name, phone, address, country, city;
}
