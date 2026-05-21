package ies.alcores.persistence.repositories;

import ies.alcores.persistence.model.character;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CharacterRepository extends MongoRepository<character, String> {
}
