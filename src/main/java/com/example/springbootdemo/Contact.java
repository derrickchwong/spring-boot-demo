package com.example.springbootdemo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data @Entity
public class Contact {
    @Id @GeneratedValue
    Long id;
    String firstName, lastName, phone, address, country, city, district, email, website;
    String linkedIn;
    String facebook;
    String ig;
}
