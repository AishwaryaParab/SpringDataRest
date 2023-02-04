package com.data.rest;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.swing.text.AbstractDocument.BranchElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.data.rest.dao.AuthorRepository;
import com.data.rest.dao.BookRepository;
import com.data.rest.dao.BorrowerRepository;
import com.data.rest.entities.Author;
import com.data.rest.entities.Book;
import com.data.rest.entities.Borrower;

@SpringBootApplication
public class SpringDataRestApplication implements CommandLineRunner {
	 
	@Autowired   //rather than using context.getBean(BookRepository.class)
	private BookRepository bookRepository;
	
	@Autowired
	private BorrowerRepository borrowerRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataRestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		// Authors
		
//		Author author1 = new Author();
////		author1.setAuthorId(1);
//		author1.setAuthorName("Agatha Christie");
//		
//		Author author2 = new Author();
////		author2.setAuthorId(2);
//		author2.setAuthorName("Amish Tripathi");
//		
//		Author author3 = new Author();
////		author3.setAuthorId(3);
//		author3.setAuthorName("Jason Fried");
//		
//		// Borrowers
//		
//		Borrower br1 = new Borrower();
//		br1.setBorrowerId(1);
//		br1.setBorrowerName("Aishwarya Parab");
//		br1.setBorrowerAddress("Porvorim");
//		br1.setStartDate("01-02-2023");
//		br1.setEndDate("28-02-2023");
//		
//		Borrower br2 = new Borrower();	
//		br2.setBorrowerId(2);
//		br2.setBorrowerName("Shridhar Maskeri");
//		br2.setBorrowerAddress("Panjim");
//		br2.setStartDate("01-02-2023");
//		br2.setEndDate("28-02-2023");
//		
//		Borrower br3 = new Borrower();
//		br3.setBorrowerId(3);
//		br3.setBorrowerName("Saisha Parab");
//		br3.setBorrowerAddress("Mapusa");
//		br3.setStartDate("01-02-2023");
//		br3.setEndDate("28-02-2023");
//		
//		Borrower br4 = new Borrower();
//		br4.setBorrowerId(4);
//		br4.setBorrowerName("Kirtan Kamkar");
//		br4.setBorrowerAddress("Thivim");
//		br4.setStartDate("01-02-2023");
//		br4.setEndDate("28-02-20	23");
//		
//		
//		// Books
//		
//		Book book1 = new Book();
//		book1.setBookName("Crooked House");
//		book1.setBorrowerName("Aishwarya Parab");
//		book1.setPublisherName("Harper Collins");
//
//		List<Author> authors1 = new ArrayList<>();
//		authors1.add(author1);
//		authors1.add(author2);
//		
//		book1.setAuthors(authors1);
//		
//		Book book2 = new Book();
//		book2.setBookName("Immortals of Meluha");
//		book2.setBorrowerName("Aishwarya Parab");
//		book2.setPublisherName("Harper Collins");
//		
//		List<Author> authors2 = new ArrayList<>();
//		authors2.add(author1);
//		authors2.add(author2);
//		
//		book2.setAuthors(authors2);
//		
//		Book book3 = new Book();
//		book3.setBookName("And Then There Were None");
//		book3.setBorrowerName("Shridhar Maskeri");
//		book3.setPublisherName("Harper Collins");
//
//		List<Author> authors3 = new ArrayList<>();
//		authors3.add(author1);
//		authors3.add(author3);
//		
//		book3.setAuthors(authors3);
//		
//		Book book4 = new Book();
//		book4.setBookName("Raavan");
//		book4.setBorrowerName("Kirtan Kamkar");
//		book4.setPublisherName("Harper Collins");
//		
//		List<Author> authors4 = new ArrayList<>();
//		authors4.add(author2);
//		
//		book4.setAuthors(authors4);
//		
//		Book book5 = new Book();
//		book5.setBookName("Rework");
//		book5.setBorrowerName("Kirtan Kamkar");
//		book5.setPublisherName("Harper Collins");
//		
//		List<Author> authors5 = new ArrayList<>();
//		authors5.add(author3);
//		
//		book5.setAuthors(authors5);
// 		
//
//		List<Book> books = List.of(book1, book2, book3, book4, book5);
//		bookRepository.saveAll(books);
//
////		 Alloting books to borrowers
//		
//		List<Book> br1Books = new ArrayList<>();
//		br1Books.add(book1);
//		br1Books.add(book2);
//		
//		List<Book> br2Books = new ArrayList<>();
//		br2Books.add(book3);
//		
//		List<Book> br4Books = new ArrayList<>();
//		br4Books.add(book4);
//		br4Books.add(book5);
//
//		br1.setBookList(br1Books);
//		br2.setBookList(br2Books);
//		br4.setBookList(br4Books);
//		
//		
//
//		
//		// Alloting borrowers to books
//		
//		book1.setBorrower(br1);
//		book2.setBorrower(br1);
//		book3.setBorrower(br2);
//		book4.setBorrower(br4);
//		book5.setBorrower(br4);
//		
//
//		List<Borrower> borrowers = List.of(br1, br2, br3, br4);		
//		borrowerRepository.saveAll(borrowers);
	}
}
