package org.example.controller;

import org.example.entity.Author;
import org.example.entity.Book;
import org.example.service.BookService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
public class BookControllerTest {
    @Mock
    private BookService bookService;

    @Test
    void fetchesBook() {
        // given
        given(bookService.getBook()).willReturn(new Book("title", new Author("author")));
        BookController bookController = new BookController(bookService);

        // when
        Book actual = bookController.getBook();
        Book expected = new Book("title", new Author("author"));

        // then
        assertEquals(expected, actual);
    }
}
