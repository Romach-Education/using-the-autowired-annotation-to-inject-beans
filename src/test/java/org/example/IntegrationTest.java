package org.example;

import org.example.controller.BookController;
import org.example.entity.Author;
import org.example.entity.Book;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = ApplicationConfiguration.class)
public class IntegrationTest {
    @Autowired
    private BookController bookController;

    @Test
    void fetchesBook() {
        Book actual = bookController.getBook();
        Book expected = new Book("The Great Gatsby", new Author("F. Scott Fitzgerald"));

        assertEquals(expected, actual);
    }
}
