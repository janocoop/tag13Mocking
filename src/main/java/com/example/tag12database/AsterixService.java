package com.example.tag12database;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor

public class AsterixService {

    private final AsterixRepository repository;

    public List<Character> getAllCharacters() {
        return repository.findAll();
    }



    public Optional<Character> getCharacterById(String id) {
        return repository.findById(id);
    }

    public void addCharacter(Character character) {
        repository.save(character);
    }

    public void updateCharacter(Character character) {

        repository.save(character);
    }
}


