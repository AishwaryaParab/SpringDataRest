package com.data.rest.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.data.rest.entities.Book;

//@RepositoryRestResource(path = "mybooks", collectionResourceRel = "books_collection")
public interface BookRepository extends JpaRepository<Book, Integer> {
	public List<Book> findByBookName(@Param("book") String name); // this behaves like a query method within 'search'
	public List<Book> findByPublisherName(@Param("book") String name); 
}
