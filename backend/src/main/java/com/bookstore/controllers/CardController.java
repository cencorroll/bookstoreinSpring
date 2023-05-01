package com.bookstore.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bookstore.entities.Card;
import com.bookstore.entities.User;
import com.bookstore.services.CardService;

import jakarta.servlet.http.HttpSession;

@Controller
public class CardController {

  @Autowired
  private CardService cardService;

  @GetMapping("/addcard")
  public String addCard() {
    return "addcard";
  }

  @GetMapping("/removecard")
  public String removeCard() {
    return "removecard";
  }

  @PostMapping("/addcard")
  public String addCardProcess(
    @RequestParam("cardNumber") Long cardNumber,
    @RequestParam("cardHolderName") String cardHolderName,
    @RequestParam("expiryDate") String expiryDate,
    @RequestParam("cvv") int cvv,
    HttpSession session
  ) {

    User user = (User) session.getAttribute("user");

    Card c = new Card();

    c.setUser(user);
    c.setCardNumber(cardNumber);
    c.setCardHolderName(cardHolderName);
    c.setExpiryDate(expiryDate);
    c.setCvv(cvv);
    
    Card savedInfo = cardService.addCard(c);

    if (savedInfo != null) {
      return "addcard";
    } else {
      return "home";
    }
  }

  @PutMapping("/removecard")
  public String removeCardProcess(
    @RequestParam("cardId") int cardId,
    HttpSession session
  ) {

    User user = (User) session.getAttribute("user");

    Card c = cardService.findByCardId(cardId);

    if (c.getUser().getUserId() == user.getUserId()) {
      cardService.removeCard(cardId);
      return "removecard";
    } else {
      return "home";
    }
  }

  
}
