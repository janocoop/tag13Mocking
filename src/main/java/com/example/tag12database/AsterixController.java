package com.example.tag12database;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/asterix/characters")


public class AsterixController {


   private final AsterixRepository repo;

    public AsterixController(CharacterRepo repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Character> characters() {
        return repo.findAll();

    }

}
