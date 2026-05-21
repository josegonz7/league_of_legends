package ies.alcores.services;

import ies.alcores.persistence.model.character;
import ies.alcores.persistence.repositories.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class CharacterService {

    @Autowired
    private CharacterRepository characterRepository;

    public List<character> findAll() {
        return this.characterRepository.findAll();
    }

    public Optional<character> findById(final String id) {
        return this.characterRepository.findById(id);
    }
}
