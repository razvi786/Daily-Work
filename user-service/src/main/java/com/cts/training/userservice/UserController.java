package com.cts.training.userservice;

import java.util.List;

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

@CrossOrigin(origins="*")
@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping(value="/user",produces="application/json")
	public ResponseEntity<?> getAllUsers(){
		List<User> users=userService.getAll();
		if(users.size()>0) {
			return new ResponseEntity<List<User>>(users,HttpStatus.OK);
		}else {
			return new ResponseEntity<String>("No User Found",HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/user/{id}")
	public ResponseEntity<?> getUserById(@PathVariable int id) {
		User user=userService.getById(id);
		if(user!=null) {
			return new ResponseEntity<User>(user,HttpStatus.OK);
		}else{
			return new ResponseEntity<String>("User Not Found",HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/user")
	public ResponseEntity<User> saveUser(@RequestBody User user) {
//		User u=userRepo.save(user);
		userService.insert(user);
		return new ResponseEntity<User>(user,HttpStatus.OK);
	}
	
	@DeleteMapping("/user/{id}")
	public void deleteUser(@PathVariable int id) {
		userService.remove(id);
	}
	
	@PutMapping("/user")
	public ResponseEntity<User> updateUser(@RequestBody User user) {
//		User u=userRepo.save(user);
		userService.update(user);
		return new ResponseEntity<User>(user,HttpStatus.OK);
	}
	
	@GetMapping("/user/activate/{code}")
	public ResponseEntity<?> getUserByCode(@PathVariable long code) {
		User user=userService.getUserByCode(code);
		if(user!=null) {
			return new ResponseEntity<User>(user,HttpStatus.OK);
		}else {
			return new ResponseEntity<String>("User Not Found",HttpStatus.NOT_FOUND);
		}
	}

}
