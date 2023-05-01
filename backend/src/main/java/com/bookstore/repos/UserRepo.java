package com.bookstore.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookstore.entities.User;

public interface UserRepo extends JpaRepository<User, Integer>{

  List<User> findByEmail(String email);
  
  User findByUsername(String username);
  
  User findByUserId(int userId);
  
}
