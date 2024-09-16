package com.example.server.Service;

import com.example.server.DAO.PersonDAO;
import com.example.server.Model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonDAO personDAO;

    public String[] getAllPersons(){
        return personDAO.getAllPersons();
    }

    public List<Person> getPersonsList() {
        return personDAO.getPersonsList();
    }

    public Person getPersonById(int id){
        return personDAO.getPersonById(id);
    }

    public void insertPerson(Person person) {
        personDAO.insertPerson(person);
    }

    public void insertPersonURL(int id, String name) {
        personDAO.insertPersonURL(id,name);
    }
}
