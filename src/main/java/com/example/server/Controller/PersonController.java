package com.example.server.Controller;

import com.example.server.Model.Person;
import com.example.server.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/personsString")
    public String[] getAllPersons(){
        return personService.getAllPersons();
    }

    @GetMapping("/personObject")
    public Person getPerson(){
        return new Person("M.Farooq",123456);
    }

    @GetMapping("/personsList")
    public List<Person> getPersonsList(){
        return personService.getPersonsList();
    }
}
