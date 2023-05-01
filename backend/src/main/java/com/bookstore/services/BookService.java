package com.bookstore.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.entities.Book;
import com.bookstore.repos.BookRepo;

@Service
public class BookService {

  @Autowired
  private BookRepo bookRepo;

  public List<Book> findAllBooks() {
    return bookRepo.findAll();
  }

  public Book addBook(Book book) {
    return bookRepo.save(book);
  }

  public List<Book> findByAuthor(String author) {
    return bookRepo.findByAuthor(author);
  }

  public List<Book> findByBookName(String bookName) {
    return bookRepo.findByBookName(bookName);
  }

  public List<Book> findByBookId(int bookId) {
    return bookRepo.findByBookId(bookId);
  }

  public List<Book> findByCategory(String bookCategory) {
    return bookRepo.findByCategory(bookCategory);
  }

  public void deleteBook(int bookId) {
    bookRepo.deleteById(bookId);
  }

  public Book updateBook(Book book) {
    return bookRepo.save(book);
  }
  
}
