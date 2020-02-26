package com.cts.project.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.project.bean.User;
import com.cts.project.repo.UserRepo;

@CrossOrigin(origins="*")
@RestController
public class UserController {
	
	@Autowired
	UserRepo userRepo;
	
//	@Autowired
//	JavaMailSender jms;
	
	@GetMapping("/user")
	public List<User> getAllUsers(){
		return userRepo.findAll();
	}
	
	@GetMapping("/user/{id}")
	public User getUserById(@PathVariable int id) {
		Optional<User> user=userRepo.findById(id);
		User u=user.get();
		return u;
	}
	
	@PostMapping("/user")
	public User saveUser(@RequestBody User user) {
		User u=userRepo.save(user);
		//Sending Mail Code
		return u;
	}
	
	@DeleteMapping("/user/{id}")
	public void deleteUser(@PathVariable int id) {
		userRepo.deleteById(id);
	}
	
	@PutMapping("/user")
	public User updateUser(@RequestBody User user) {
		User u=userRepo.save(user);
		return u;
	}

}
