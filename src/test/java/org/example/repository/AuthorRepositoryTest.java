package org.example.repository;

import org.example.entity.Author;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorRepositoryTest {

    @Test
    @DisplayName("Fetches the author")
    void getAuthor() {
        AuthorRepository authorRepository = new AuthorRepository();

        Author actual = authorRepository.getAuthor();
        Author expected = new Author("F. Scott Fitzgerald");

        assertEquals(expected, actual);
    }
}
