package com.example.server.Controller;

import com.example.server.Model.Person;
import com.example.server.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
        return new Person(1,"M.Farooq");
    }

    @GetMapping("/personsList")
    public List<Person> getPersonsList(){
        return personService.getPersonsList();
    }

    @GetMapping("/person/{id}")
    public Person getPersonById(@PathVariable("id") int id){
        return personService.getPersonById(id);
    }

    @PostMapping("insertPersonURL/{id}/{name}")
    public void insertPersonURL(@PathVariable int id,@PathVariable String name){
        personService.insertPersonURL(id,name);
    }

    @PostMapping("/insertPerson")
    public void insertPerson(@RequestBody Person person){
        personService.insertPerson(person);
    }
}
