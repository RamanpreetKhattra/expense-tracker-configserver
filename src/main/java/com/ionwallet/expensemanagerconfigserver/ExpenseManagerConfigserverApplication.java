package com.ionwallet.expensemanagerconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ExpenseManagerConfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExpenseManagerConfigserverApplication.class, args);
	}
}
