package org.example.repository;

import org.example.entity.Author;
import org.springframework.stereotype.Repository;

@Repository
public class AuthorRepository {
    public Author getAuthor() {
        return new Author("F. Scott Fitzgerald");
    }
}
