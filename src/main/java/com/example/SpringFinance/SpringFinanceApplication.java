package com.example.SpringFinance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.SpringFinance")
public class SpringFinanceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringFinanceApplication.class, args);
	}
}
