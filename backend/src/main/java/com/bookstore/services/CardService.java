package com.bookstore.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.entities.Card;
import com.bookstore.repos.CardRepo;

@Service
public class CardService {
  
  @Autowired
  private CardRepo cardRepo;

  public Card addCard(Card card) {
    return cardRepo.save(card);
  }

  public void removeCard(int cardId) {
    cardRepo.deleteById(cardId);
  }

  public Card findByCardId(int cardId) {
    return cardRepo.findByCardId(cardId);
  }
  
}
