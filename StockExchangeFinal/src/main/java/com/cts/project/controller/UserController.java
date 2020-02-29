package com.cts.project.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.project.bean.User;
import com.cts.project.dto.UserDTO;
import com.cts.project.repo.UserRepo;
import com.cts.project.service.UserService;

@CrossOrigin(origins="*")
@RestController
public class UserController {
	
	@Autowired
	UserRepo userRepo;
	
	@Autowired
	UserService userService;
	
	@GetMapping("/user")
	public ResponseEntity<List<UserDTO>> getAllUsers(){
		List<UserDTO> userDTOs=userService.getAll();
		return new ResponseEntity<List<UserDTO>>(userDTOs,HttpStatus.CREATED);
	}
	
	@GetMapping("/user/{id}")
	public ResponseEntity<UserDTO getUserById(@PathVariable int id) {
		UserDTO userDTO=userService.getById(id);
		return new ResponseEntity<UserDTO>(userDTO,HttpStatus.CREATED);
	}
	
	@PostMapping("/user")
	public ResponseEntity<UserDTO> saveUser(@RequestBody UserDTO userDTO) {
//		User u=userRepo.save(user);
		userService.insert(userDTO);
		return new ResponseEntity<UserDTO>(userDTO,HttpStatus.CREATED);
	}
	
	@DeleteMapping("/user/{id}")
	public void deleteUser(@PathVariable int id) {
		userService.remove(id);
	}
	
	@PutMapping("/user")
	public ResponseEntity<UserDTO> updateUser(@RequestBody UserDTO userDTO) {
//		User u=userRepo.save(user);
		userService.update(userDTO);
		return new ResponseEntity<UserDTO>(userDTO,HttpStatus.CREATED);
	}
	
	@GetMapping("/user/activate/{code}")
	public User getUserByCode(@PathVariable long code) {
		User u=userRepo.findByCode(code);
		return u;
	}

}
