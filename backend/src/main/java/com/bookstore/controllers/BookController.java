package com.bookstore.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.bookstore.services.BookService;

@Controller
public class BookController {

  @Autowired
  private BookService bookService;
  
}
