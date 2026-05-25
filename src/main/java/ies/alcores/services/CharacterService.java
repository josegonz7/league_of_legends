package ies.alcores.services;

import ies.alcores.persistence.model.Character;
import ies.alcores.persistence.repositories.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CharacterService {

    @Autowired
    private CharacterRepository characterRepository;

    public List<Character> findAll() {
        return this.characterRepository.findAll();
    }

    public Optional<Character> findById(final String id) {
        return this.characterRepository.findById(id);
    }
    
    public Character save(final Character character) {
        return this.characterRepository.save(character);
    }

    //Dado un id de character lo elimina
    public boolean delete(final String id) {
        return this.characterRepository.findById(id)
                .map((Character character) -> {
                    this.characterRepository.delete(character);
                    return true;
                })
                .orElse(false);
    }
}
//this.characterRepository.findById(id);
//                .ifPresent(this.characterRepository::delete);