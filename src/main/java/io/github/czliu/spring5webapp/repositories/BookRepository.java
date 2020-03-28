package io.github.czliu.spring5webapp.repositories;

import io.github.czliu.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
