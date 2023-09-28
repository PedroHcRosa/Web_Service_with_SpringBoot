package com.pedrorosa.course.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pedrorosa.course.entities.User;
import com.pedrorosa.course.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository Repository;
	
	
	public List<User> findAll() {
		
		return Repository.findAll();
		
	}
	
	public User findById(Long id) {
		
		Optional<User> obj = Repository.findById(id);
		return obj.get();
		
	}
	
	public User insert(User obj) {
		
		return Repository.save(obj);
		
	}
	
	public void delete(Long id) {
		
		Repository.deleteById(id);
		
	}
	
	
	public User update(Long id, User obj) {
		
		User entity = Repository.getReferenceById(id);
		updateData(entity, obj);
		return Repository.save(entity);
		
	}

	private void updateData(User entity, User obj) {
		
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
		
	}
}

