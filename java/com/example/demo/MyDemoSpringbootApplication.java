package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MyDemoSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyDemoSpringbootApplication.class, args);
	}
	
	@GetMapping("/trigger")
	public String getMessage() {
		return "This is a test message!";
	}
	
	
	@GetMapping("/{input}")
	public String getMessage(String input) {
		return "Hi " + input;
	}


}
