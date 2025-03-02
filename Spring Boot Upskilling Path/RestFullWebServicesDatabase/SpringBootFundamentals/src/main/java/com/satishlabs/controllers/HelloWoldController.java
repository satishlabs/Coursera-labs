package com.satishlabs.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWoldController {

	// Get HTTP method
	// http://localhost:8090
	@GetMapping("/")
	public String message() {
		return "Welcome to Spring Boot Application";
	}

	// http://localhost:8090/hello-world
	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello World!";
	}

}
