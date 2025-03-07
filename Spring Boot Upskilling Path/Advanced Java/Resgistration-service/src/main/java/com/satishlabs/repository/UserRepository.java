package com.satishlabs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.satishlabs.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	public List<User> findByEmail(String email);
}
