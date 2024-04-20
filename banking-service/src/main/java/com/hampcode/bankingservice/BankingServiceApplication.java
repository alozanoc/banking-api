package com.hampcode.bankingservice;

import com.hampcode.bankingservice.controllers.AccountController;
import com.hampcode.bankingservice.repository.AccountRepository;
import com.hampcode.bankingservice.services.AccountService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.HashMap;

@SpringBootApplication
public class BankingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankingServiceApplication.class, args);
	}

}
