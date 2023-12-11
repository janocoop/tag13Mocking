package com.example.tag12database;

import com.example.tag12database.AsterixService;
import com.example.tag12database.Character;
import com.example.tag12database.CharacterRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

public class AsterixServiceTest {
    @Test
    public void TestFindAllCharacters() {
        AsterixRepository repo = Mockito.mock(AsterixRepository.class);
        AsterixService service = new AsterixService(repo);

        List<Character> actual = service.getAllCharacters();

        List<Character> expected = List.of(
                new Character("1","erster", 23, "beruf");
    }
    @Test
    public void test2FindCharacterById() {


    }
    @Test
    public void Test3UpdateCharacter() {


    }
    @Test
    public void Test4DeleteCharacter() {


    }

}
