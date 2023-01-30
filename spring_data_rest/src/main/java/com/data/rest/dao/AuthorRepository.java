package com.data.rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.data.rest.entities.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

}
