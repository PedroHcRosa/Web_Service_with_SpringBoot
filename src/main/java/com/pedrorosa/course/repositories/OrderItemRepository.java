package com.pedrorosa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrorosa.course.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
	
	
	
}
