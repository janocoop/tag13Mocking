package com.example.tag12database;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterRepo extends MongoRepository <Character, String> {

}
