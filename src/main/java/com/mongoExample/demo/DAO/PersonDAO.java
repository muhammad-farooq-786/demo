package com.mongoExample.demo.DAO;

import com.mongoExample.demo.Model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface PersonDAO extends MongoRepository<Person,String> {

    @Query("{'name' : ?0}")
    Optional<Person> findByName(String name);
}
