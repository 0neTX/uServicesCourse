package com.example.emailvalidationuservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.emailvalidationuservice.EmailValidationResponse;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@SpringBootApplication
@RestController
public class EmailValidationUserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmailValidationUserviceApplication.class, args);
	}


	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
	return String.format("Hello %s!", name);
	}

	@PostMapping("/validate-email")
	public EmailValidationResponse validateEmail(@RequestBody String email) {
		EmailValidationResponse res = new EmailValidationResponse();
		res.email = email;
		res.valid_email = (email.contains("@"));
		res.score = email.length();
		return res;
  	}
}

