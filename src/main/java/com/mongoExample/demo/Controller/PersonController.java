package com.mongoExample.demo.Controller;

import com.mongoExample.demo.Model.Person;
import com.mongoExample.demo.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class PersonController {

    @Autowired
    PersonService personService;

    @PostMapping("addPerson")
    public ResponseEntity addPerson(@RequestBody Person person){
        personService.addPerson(person);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping("updatePerson")
    public ResponseEntity<Object> updatePerson(@RequestBody Person person){
        personService.updatePerson(person);
        return ResponseEntity.ok().build();
    }

    @GetMapping("getAllPersons")
    public ResponseEntity<List<Person>> getAllPersons(){
        return ResponseEntity.ok(personService.getAllPersons());
    }

    @GetMapping("getPersonByName/{name}")
    public ResponseEntity<Person> getPersonByName(@PathVariable String name){
        return ResponseEntity.ok(personService.getPersonByName(name));
    }

    @GetMapping("getPersonById/{id}")
    public ResponseEntity<Person> getPersonByID(@PathVariable String id){
        return ResponseEntity.ok(personService.getPersonByID(id));
    }

    @DeleteMapping("deletePerson/{id}")
    public ResponseEntity deletePerson(@PathVariable String id){
        personService.deletePerson(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
