package com.example.sampledemo.controller;

import com.example.sampledemo.model.Person;
import com.example.sampledemo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {
@Autowired
    PersonRepository personRepository;
@GetMapping("/person")
public List<Person> getAllPersons(){
    return personRepository.findAll();
}

    }

