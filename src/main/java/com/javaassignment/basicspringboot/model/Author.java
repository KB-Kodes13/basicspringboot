package com.javaassignment.basicspringboot.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import org.springframework.data.annotation.Id;
import jakarta.validation.constraints.Size;
import java.util.List;

@Entity
public class Author {

    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(min=2, max=100)
    private String name;

    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
    private List<com.javaassignment.basicspringboot.model.Book> books;

    public Author() {
    }

    public Author(String name) {

        this.name = name;
    }


    // Getters and setters
    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}