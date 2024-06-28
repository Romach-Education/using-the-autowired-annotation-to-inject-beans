package org.example;

import org.example.controller.BookController;
import org.example.entity.Book;
import org.example.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        Book book = context.getBean(BookController.class).getBook();
        System.out.println("The book is: " + book.getTitle() + " by " + book.getAuthor().getName());
    }
}
