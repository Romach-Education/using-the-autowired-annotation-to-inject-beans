package org.example.service;

import org.example.entity.Author;
import org.example.entity.Book;
import org.example.repository.AuthorRepository;
import org.example.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    public BookRepository bookRepository;
    private AuthorRepository authorRepository;

    @Autowired
    public void setAuthorRepository(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Book getBook() {
        final Author author = authorRepository.getAuthor();
        return bookRepository.getBook(author);
    }
}
