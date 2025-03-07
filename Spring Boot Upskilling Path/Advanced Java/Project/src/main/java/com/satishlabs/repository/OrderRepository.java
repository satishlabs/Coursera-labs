package com.satishlabs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.satishlabs.model.Order;

public interface OrderRepository extends JpaRepository<Order, Integer>{

}
