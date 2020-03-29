package io.github.czliu.spring5webapp.repositories;

import io.github.czliu.spring5webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
