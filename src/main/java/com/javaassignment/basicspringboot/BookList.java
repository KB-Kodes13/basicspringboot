package com.javaassignment.basicspringboot;

import com.javaassignment.basicspringboot.model.Book;
import com.javaassignment.basicspringboot.model.Author;
import com.javaassignment.basicspringboot.repository.AuthorRepository;
import com.javaassignment.basicspringboot.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BookList implements CommandLineRunner {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    @Autowired
    public BookList(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) {
        Author author1 = new Author("David Goggins");
        Author author2 = new Author("Paulo Coelho");
        authorRepository.save(author1);
        authorRepository.save(author2);

        Book book1 = new Book("Cant Hurt Me", author1);
        Book book2 = new Book("The Alchemist", author2);
        bookRepository.save(book1);
        bookRepository.save(book2);
    }
}
