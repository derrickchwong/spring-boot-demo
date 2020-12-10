package com.example.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ContactController {
    @Autowired ContactRepository contactRepository;

    @GetMapping("/contacts")
    public List<Contact> getAllContacts(){
        return contactRepository.findAll();
    }

    @PostMapping("/contact")
    public Contact createContact(@RequestBody Contact contact){
        return contactRepository.save(contact);
    }
}
