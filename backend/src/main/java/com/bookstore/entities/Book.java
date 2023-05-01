package com.bookstore.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "books")
public class Book {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "book_id")
	private int bookId;

  @Column(name = "author")
	private String author;

  @Column(name = "book_name")
	private String bookName;

  @Column(name = "book_overview")
	private String bookOverview;

  @Column(name = "book_category")
  private String bookCategory;
  
  @Column(name = "price")
	private double price;
    
  @Column(name = "image_url")
	private String imageUrl;
	
}

/*  | book_id       | int(11)       | YES  |     | NULL    |       |
	| author        | varchar(30)   | YES  |     | NULL    |       |
	| book_name     | varchar(20)   | YES  |     | NULL    |       |
	| book_overview | varchar(3000) | YES  |     | NULL    |       |
	| price         | double        | YES  |     | NULL    |       |
	| image_url     | varchar(2000) | YES  |     | NULL    |       |*/
