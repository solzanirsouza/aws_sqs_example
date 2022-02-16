package com.codesqsspring.controller;

import com.codesqsspring.model.dto.PersonDTO;
import com.codesqsspring.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/person")
public class PersonController {

    @Autowired
    private PersonService service;

    @PostMapping
    public void putMessagedToQueue(@RequestBody PersonDTO person) {
        service.send(person.getName(), person.getAge());
    }
}
