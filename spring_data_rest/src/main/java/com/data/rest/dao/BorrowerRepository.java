package com.data.rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.data.rest.entities.Borrower;

public interface BorrowerRepository extends JpaRepository<Borrower, Integer> {

}
