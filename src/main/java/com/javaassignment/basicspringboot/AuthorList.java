package com.javaassignment.basicspringboot;

import com.javaassignment.basicspringboot.model.Author;
import com.javaassignment.basicspringboot.repository.AuthorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AuthorList implements CommandLineRunner {
    private final AuthorRepository authorRepository;

    public AuthorList(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public void run(String... args) {
        Author author1 = new Author("David Goggins");
        Author author2 = new Author("Paulo Coelho");

    }
}