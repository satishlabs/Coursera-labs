package com.satishlabs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.satishlabs.model.Person;

@Controller
public class SpringSecurityHelloWorldController {
	
	@RequestMapping("/public/pages")
	public String helloWorld(@ModelAttribute("person") Person person, BindingResult result, Model model) {
		model.addAttribute("message", "Hi user, Great !!, welcome to Secured Hello World");
		model.addAttribute("person", new Person());
		
		return "/helloWorld";
		
	}
	
	@RequestMapping("/secured/pages")
	public String helloWorldSecured(Model model) {
		model.addAttribute("message", "Hi user, Great !!, welcome to Secured Hello World");
		return "/secured/securedHelloWorld";
	}
	
	@PostMapping("/public/ShowUserDetails")
	public String showUserDetails(@ModelAttribute("person") Person person, BindingResult result, Model model) {
		System.out.println("name passed from request is "+person.getName());
		System.out.println("age passed from request is "+person.getAge());
		model.addAttribute("name","kbc");
		model.addAttribute("age", 30);
		
		return "personDetails";
	}
}
