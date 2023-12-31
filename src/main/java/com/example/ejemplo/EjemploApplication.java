package com.example.ejemplo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EjemploApplication {

	@GetMapping("/message")
	public String message() {
		return "Hola virgulilleros perreadores";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(EjemploApplication.class, args);
	}

}
