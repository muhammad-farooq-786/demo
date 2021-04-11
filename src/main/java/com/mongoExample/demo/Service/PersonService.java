package com.mongoExample.demo.Service;

import com.mongoExample.demo.DAO.PersonDAO;
import com.mongoExample.demo.Model.Person;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    private final PersonDAO personDAO;

    public PersonService(PersonDAO personDAO){this.personDAO = personDAO;}


    public void addPerson(Person person){
        personDAO.insert(person);
    }

    public void updatePerson(Person person){
        Person savedPerson = personDAO.findById(person.getID()).orElseThrow(() -> new RuntimeException(
                String.format("Cannot find person based on ID:" , person.getID())));

        savedPerson.setName(person.getName());
        savedPerson.setEmail(person.getEmail());
        savedPerson.setAddress(person.getAddress());

        personDAO.save(savedPerson);
    }

    public List<Person> getAllPersons(){
        return personDAO.findAll();
    }

    public Person getPersonByName(String name) {
        return personDAO.findByName(name).orElseThrow(() -> new RuntimeException(
                String.format("Cannot find person based on name %s",name)));
    }

    public Person getPersonByID(String id) {
        return personDAO.findById(id).orElseThrow(() -> new RuntimeException(
                String.format("Cannot find person based on ID ",id)));
    }

    public void deletePerson(String id){
        personDAO.deleteById(id);
    }


}
