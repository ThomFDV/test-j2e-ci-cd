package com.example.J2Eproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class J2EProjectApplication {

	@RequestMapping("/")
	public String home() {
		return "This is a test";
	}

	public static void main(String[] args) {
		SpringApplication.run(J2EProjectApplication.class, args);
	}

}
