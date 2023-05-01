package com.bookstore.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookstore.entities.Card;

public interface CardRepo extends JpaRepository<Card, Integer>{

  Card findByCardId(int cardId);
  
  Card findByCardNumber(String cardNumber);
  
  Card findByCardHolderName(String cardHolderName);
  
}
