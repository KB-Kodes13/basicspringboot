package com.javaassignment.basicspringboot.repository;


import com.javaassignment.basicspringboot.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
