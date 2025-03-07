package com.satishlabs.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.satishlabs.model.Greeting;

@RestController
public class GreetingController {
	private static final String template = "Hello, %$!";
	private static final AtomicLong counter = new AtomicLong();
	
	@GetMapping("/greeting")
	public Greeting greet(@RequestParam(value = "names", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
}
