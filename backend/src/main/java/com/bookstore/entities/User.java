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
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private int userId;

	@Column(name = "username", nullable = false)
	private String username;

	@Column(name = "first_name", nullable = false)
	private String firstName;

	@Column(name = "last_name", nullable = false)
	private String lastName;

	@Column(name = "email", nullable = false, unique = true)
	private String email;

	@Column(name = "password", nullable = false)
	private String password;

  @Column(name = "card_number" , unique = true)
  private Long cardNumber;

  @Column(name = "card_name" )
  private String cardName;

  @Column(name = "card_expiry" )
  private String cardExpiry;

  @Column(name = "card_cvv" )
  private int cardCvv;

  @Column(name = "card_type" )
  private String cardType;

  @Column(name = "date_opened")
  private String dateOpened;

  @Column(name = "role")
  private String role;

  // Setting specific admin role
  public void setAdmin() {
    this.role = "admin";
  }

}
