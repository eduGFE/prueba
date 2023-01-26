package dev.egomezfe.climby.repository;

import dev.egomezfe.climby.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Integer> {
    Author findByUsername(String username);
}
