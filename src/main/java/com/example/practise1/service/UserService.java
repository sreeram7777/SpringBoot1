package com.example.practise1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.practise1.entity.User;
import com.example.practise1.repo.UserRepo;

@Service
public class UserService {

	@Autowired
	public UserRepo repo;
	
	public List<User> findall() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return repo.save(user);
	}

	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		User user = repo.findById(id).orElse(null);
		repo.delete(user);
	}

}
