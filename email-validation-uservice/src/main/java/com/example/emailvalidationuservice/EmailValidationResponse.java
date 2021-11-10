package com.example.emailvalidationuservice;

import javax.persistence.Entity;



@Entity
public class EmailValidationResponse{
	public String email;
	public Boolean valid_email;
	public int score;

	EmailValidationResponse(){}

	EmailValidationResponse(String email, Boolean valid, int score){
		this.email = email;
		this.valid_email = valid;
		this.score = score;
	}
}