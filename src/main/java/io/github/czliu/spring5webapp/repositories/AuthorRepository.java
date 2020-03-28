package io.github.czliu.spring5webapp.repositories;

import io.github.czliu.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
