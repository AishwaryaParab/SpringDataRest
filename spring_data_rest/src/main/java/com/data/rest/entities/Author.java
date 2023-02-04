package com.data.rest.entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class Author {
	
	@Id
	@NotNull
	@Column(name = "author_id", unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int authorId;
	
	@NotNull
	@NotEmpty(message = "Please enter the name of the author.")
	private String authorName;
	
	@ManyToMany(mappedBy = "authors")
	private List<Book> books = new ArrayList<>();
}
