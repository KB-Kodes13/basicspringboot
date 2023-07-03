package com.javaassignment.basicspringboot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import org.springframework.data.annotation.Id;
import jakarta.validation.constraints.Size;

@Entity
public class Book {

    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(min=2, max=100)
    private String title;

    @ManyToOne
    private com.javaassignment.basicspringboot.model.Author author;

    public Book() {
    }

    public Book(String title, com.javaassignment.basicspringboot.model.Author author) {
        this.title = title;
        this.author = author;
    }

    // Getters and setters
    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {

        this.title = title;
    }
    public Long getId() {

        return id;
    }

    public void setId(Long id) {

        this.id = id;
    }


    public com.javaassignment.basicspringboot.model.Author getAuthor() {

        return author;
    }

    public void setAuthor(com.javaassignment.basicspringboot.model.Author author) {

        this.author = author;
    }

}