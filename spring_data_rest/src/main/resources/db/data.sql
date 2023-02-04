-- Authors

INSERT INTO author(author_name) VALUES ('Agatha Christie');
INSERT INTO author(author_name) VALUES ('Amish Tripathi');
INSERT INTO author(author_name) VALUES ('Jason Fried');

-- Borrowers

INSERT INTO borrower(borrower_name, borrower_address, start_date, end_date) VALUES ('Aishwarya Parab', 'Porvorim', '01-02-2023', '28-02-2023');
INSERT INTO borrower(borrower_name, borrower_address, start_date, end_date) VALUES ('Shridhar Maskeri', 'Panjim', '01-02-2023', '28-02-2023');
INSERT INTO borrower(borrower_name, borrower_address, start_date, end_date) VALUES ('Saisha Parab', 'Mapusa', '01-02-2023', '28-02-2023');
INSERT INTO borrower(borrower_name, borrower_address, start_date, end_date) VALUES ('Kirtan Kamkar', 'Thivim', '01-02-2023', '28-02-2023');

-- Books

INSERT INTO book(book_name, borrower_name, publisher_name, b_id) VALUES ('Crooked House', 'Aishwarya Parab', 'Harper Collins', 1);
INSERT INTO book(book_name, borrower_name, publisher_name, b_id) VALUES ('Immortals of Meluha', 'Aishwarya Parab', 'Harper Collins', 1);
INSERT INTO book(book_name, borrower_name, publisher_name, b_id) VALUES ('And Then There Were None', 'Shridhar Maskeri', 'Harper Collins', 2);
INSERT INTO book(book_name, borrower_name, publisher_name, b_id) VALUES ('Raavan', 'Kirtan Kamkar', 'Harper Collins', 4);
INSERT INTO book(book_name, borrower_name, publisher_name, b_id) VALUES ('Rework', 'Kirtan Kamkar', 'Harper Collins', 4);

-- ManyToMany

INSERT INTO book_authors(books_id, authors_author_id) VALUES (1, 1);
INSERT INTO book_authors(books_id, authors_author_id) VALUES (1, 2);

INSERT INTO book_authors(books_id, authors_author_id) VALUES (2, 1);
INSERT INTO book_authors(books_id, authors_author_id) VALUES (2, 2);

INSERT INTO book_authors(books_id, authors_author_id) VALUES (3, 1);
INSERT INTO book_authors(books_id, authors_author_id) VALUES (3, 3);

INSERT INTO book_authors(books_id, authors_author_id) VALUES (4, 2);

INSERT INTO book_authors(books_id, authors_author_id) VALUES (5, 3);



