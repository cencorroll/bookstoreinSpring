package com.bookstore.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookstore.entities.Book;

public interface BookRepo extends JpaRepository<Book, Integer>{

  List<Book> findByAuthor(String author);

  List<Book> findByBookName(String bookName);

  List<Book> findByBookId(int bookId);

  List<Book> findByCategory(String bookCategory);
  
}
