package com.pedrorosa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrorosa.course.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {
	
	
	
	
}
