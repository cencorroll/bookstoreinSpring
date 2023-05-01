package com.bookstore.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.entities.User;
import com.bookstore.repos.UserRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserService {

  @Autowired
  private UserRepo userRepo;

  public User addUser(User user) {

		List<User> existingUser = userRepo.findByEmail(user.getEmail());
		if (!existingUser.isEmpty()) {
			throw new RuntimeException("User already exists");
		}

		User newUser = new User();

		newUser.setUsername(user.getUsername());
		newUser.setFirstName(user.getFirstName());
		newUser.setLastName(user.getLastName());
		newUser.setEmail(user.getEmail());
		newUser.setPassword(user.getPassword());

		System.out.println(newUser.toString());

		return userRepo.save(newUser);
	}

	public User loginUser(User user) {

		User existingUser = userRepo.findByUsername(user.getUsername());

		if (existingUser == null || !existingUser.getPassword().equals(user.getPassword())) {
			throw new RuntimeException("Invalid email or password");
		}

		return existingUser;
	}

	public User findByUsername(String username) {
		return userRepo.findByUsername(username);
	}

	public List<User> findByEmail(String email) {
		return userRepo.findByEmail(email);
	}
  
}
