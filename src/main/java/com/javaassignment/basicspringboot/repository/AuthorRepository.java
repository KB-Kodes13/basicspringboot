package com.javaassignment.basicspringboot.repository;

import com.javaassignment.basicspringboot.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}