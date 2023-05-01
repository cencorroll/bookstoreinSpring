package com.bookstore.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "cards")
public class Card {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "card_id")
  private int cardId;

  @Column(name = "card_number" , unique = true)
  private Long cardNumber;

  @Column(name = "card_holder_name" )
  private String cardHolderName;

  @Column(name = "expiry_date" )
  private String expiryDate;

  @Column(name = "card_cvv" )
  private int cvv;

  @Column(name = "card_type" )
  private String cardType;

  @ManyToOne
  @JoinColumn(name = "user_id")
  private User user;
  
}
