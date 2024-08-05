package com.example.practise1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.practise1.entity.User;
import com.example.practise1.service.UserService;

@RestController
public class UserController {

	@Autowired
	public UserService service;
	
	
	@GetMapping("/findAll")
	public List<User> findAll()
	{
		return service.findall();
	}
	
	@PostMapping("/saveUser")
	public User saveUser(@RequestBody User user)
	{
		return service.saveUser(user);
	}
	
	@DeleteMapping("/deleteUser/{id}")
	public void deleteUser(@PathVariable int id)
	{
		service.deleteUser(id);
	}
	
}
