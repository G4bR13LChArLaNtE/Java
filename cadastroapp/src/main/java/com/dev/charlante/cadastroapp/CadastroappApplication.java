package com.dev.charlante.cadastroapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.dev.charlante.cadastroapp.controllers")
public class CadastroappApplication {

	public static void main(String[] args) {
		SpringApplication.run(CadastroappApplication.class, args);
	}

}
