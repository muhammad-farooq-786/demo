package com.example.server.DAO;

import com.example.server.Model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class PersonDAO {

    private String[] persons = {"M.Farooq","M.Ali","M.Hasnain"};

    private List<Person> personsList = Arrays.asList(
            new Person("M.Farooq",123)
    );

    public String[] getAllPersons(){
        return persons;
    }

    public List<Person> getPersonsList(){return personsList;}
}
