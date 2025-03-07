package com.satishlabs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.satishlabs.model.Order;
import com.satishlabs.model.User;
import com.satishlabs.repository.OrderRepository;
import com.satishlabs.repository.UserRepository;

@SpringBootApplication
public class ProjectApplication {
	
	private JdbcTemplate jdbcTemplate;
	
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@PostMapping("/register")
	public String register(@RequestBody User user) {
		userRepository.save(user);
		return "Hi "+ user.getUsername()+" Your registration completed";
	}
	
	@PostMapping("/order")
	public String register(@RequestBody Order order) {
		orderRepository.save(order);
		return "Hi "+ order.getUsername()+" Your order has been done";
	}
	
	
	@GetMapping("/valid/{username}")
	public List<User> findUser(@PathVariable String username){
		return userRepository.findByUsername(username);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}

}
