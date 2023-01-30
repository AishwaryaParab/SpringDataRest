package com.data.rest.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Borrower {
	
	@Id
	@Column(unique = true)
	@NotNull
	private int borrowerId;
	
	@NotNull
	@NotEmpty(message = "Please enter the name of the borrower.")
	private String borrowerName;
	
	private String borrowerAddress;
	
	@NotNull
	@NotEmpty(message = "Please enter the start date.")
	private String startDate;
	
	@NotNull
	@NotEmpty(message = "Please enter the end date.")
	private String endDate;
	
	@OneToMany(mappedBy = "borrower", cascade = CascadeType.ALL)
	private List<Book> bookList;
}
