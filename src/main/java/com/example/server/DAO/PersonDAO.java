package com.example.server.DAO;

import com.example.server.Model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class PersonDAO {

    private String[] persons = {"M.Farooq","M.Ali","M.Hasnain"};

    private List<Person> personsList = new ArrayList<Person>(){
        {
            add(new Person(111,"M.Farooq"));
            add(new Person(222,"Asad Ullah"));
            add(new Person(333,"Hasnain"));
        }
    };


    public String[] getAllPersons(){
        return persons;
    }

    public List<Person> getPersonsList(){
        return personsList;
    }

    public Person getPersonById(int id){
        return personsList.get(id);
    }

    public void insertPerson(Person person) {
        personsList.add(person);
    }

    public void insertPersonURL(int id, String name) {
        personsList.add(new Person(id,name));
    }
}
