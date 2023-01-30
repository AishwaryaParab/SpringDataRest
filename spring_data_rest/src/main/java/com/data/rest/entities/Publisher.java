package com.data.rest.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Entity
@Data
public class Publisher {
	
	@Id
	@Column(name = "publisher_id")
	private int PublisherId;
	
	@NotEmpty(message = "Please enter the name of the publisher.")
	private String publisherName;
}