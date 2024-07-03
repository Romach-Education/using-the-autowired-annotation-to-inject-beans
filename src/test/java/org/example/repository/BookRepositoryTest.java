package org.example.repository;

import org.example.entity.Author;
import org.example.entity.Book;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BookRepositoryTest {

    @Test
    @DisplayName("Fetches the book")
    void getBook() {
        BookRepository bookRepository = new BookRepository();

        Book actual = bookRepository.getBook(new Author("Author"));
        Book expected = new Book("The Great Gatsby", new Author("Author"));

        assertEquals(expected, actual);
    }
}
