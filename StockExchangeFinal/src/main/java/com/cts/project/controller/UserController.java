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
	UserRepo ur;
	
	@Autowired
	JavaMailSender jms;
	
	@GetMapping("/user")
	public List<User> findAll(){
		return ur.findAll();
	}
	
	@GetMapping("/user/{id}")
	public User findOne(@PathVariable int id) {
		Optional<User> user=ur.findById(id);
		User u=user.get();
		return u;
	}
	
	@PostMapping("/user")
	public User save(@RequestBody User user) {
		User u=ur.save(user);
		//Sending Mail Code
		return u;
	}
	
	@DeleteMapping("/user/{id}")
	public void delete(@PathVariable int id) {
		ur.deleteById(id);
	}
	
	@PutMapping("/user")
	public User update(@RequestBody User user) {
		User u=ur.save(user);
		return u;
	}

}
