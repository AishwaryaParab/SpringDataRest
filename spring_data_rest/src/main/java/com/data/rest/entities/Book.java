package com.data.rest.entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
//@Table(name = "book_collection") // creating a table with this name
@Data // generates getters, setters, constructors, overrides toString() and more!
//@AllArgsConstructor
//@NoArgsConstructor
public class Book {

	@Id
	@Column(unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@NotNull
	@NotEmpty(message = "Please enter a book name.")
	@Column(unique = true) // only unique bookNames will be injected in the DB
	private String bookName;

//	@NotNull
//	@NotEmpty(message = "Please enter the name of the author.")
//	private String authorName;

	@NotNull
	@NotEmpty(message = "Please enter the name of the borrower.")
	private String borrowerName;

	private String publisherName;

	@ManyToMany(cascade = CascadeType.ALL)
	private List<Author> authors = new ArrayList<>();

	// Many books can be borrowed by one borrower

	@ManyToOne
	@JoinColumn(name = "b_id", referencedColumnName = "borrowerId")
	private Borrower borrower;
}
