package com.pedrorosa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrorosa.course.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {
	
	
	
	
}
