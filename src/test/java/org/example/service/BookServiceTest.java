package org.example.service;

import org.example.entity.Author;
import org.example.entity.Book;
import org.example.repository.AuthorRepository;
import org.example.repository.BookRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;


@ExtendWith(MockitoExtension.class)
class BookServiceTest {
    @Mock
    private BookRepository bookRepository;

    @Mock
    private AuthorRepository authorRepository;

    @Test
    @DisplayName("Combines the author and book to get the book")
    void getBook() {
        given(authorRepository.getAuthor()).willReturn(new Author("author"));
        given(bookRepository.getBook(new Author("author"))).willReturn(new Book("book", new Author("author")));

        BookService bookService = new BookService();
        bookService.bookRepository = bookRepository;
        bookService.setAuthorRepository(authorRepository);

        Book actual = bookService.getBook();
        Book expected = new Book("book", new Author("author"));

        assertEquals(expected, actual);
    }
}
