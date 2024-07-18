package com.kanishka.springwebapp.repositories;

import com.kanishka.springwebapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
