package com.cts.training.userservice.controller;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

import com.cts.training.userservice.entity.User;
import com.cts.training.userservice.service.UserService;

@CrossOrigin(origins="*")
@RestController
public class UserRestController {
	
	Logger logger=LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	UserService userService;
	
	@PostMapping("/user")
	public ResponseEntity<User> saveUser(@RequestBody User user) {
		userService.insert(user);
		return new ResponseEntity<User>(user,HttpStatus.OK);
	}
	
	@DeleteMapping("/user/{id}")
	public void deleteUser(@PathVariable int id) {
		userService.remove(id);
	}
	
	@PutMapping("/user")
	public ResponseEntity<User> updateUser(@RequestBody User user) {
		userService.update(user);
		return new ResponseEntity<User>(user,HttpStatus.OK);
	}
	
	@GetMapping(value="/user",produces="application/json")
	public ResponseEntity<?> getAllUsers(){
		List<User> users=userService.getAll();
		if(users.size()>0) {
			return new ResponseEntity<List<User>>(users,HttpStatus.OK);
		}else {
			return new ResponseEntity<String>("No User Found",HttpStatus.OK);
		}
	}
	
	@GetMapping("/user/{id}")
	public ResponseEntity<?> getUserById(@PathVariable int id) {
		User user=userService.getById(id);
		if(user!=null) {
			return new ResponseEntity<User>(user,HttpStatus.OK);
		}else{
			return new ResponseEntity<String>("User Not Found",HttpStatus.OK);
		}
	}
	
	@GetMapping("/user/code/{code}")
	public ResponseEntity<?> getUserByCode(@PathVariable long code) {
		User user=userService.getUserByCode(code);
		if(user!=null) {
			return new ResponseEntity<User>(user,HttpStatus.OK);
		}else {
			return new ResponseEntity<String>("User Not Found",HttpStatus.OK);
		}
	}
	
	@GetMapping("/user/email/{email}")
	public User getUserByEmail(@PathVariable String email) {
		return userService.getUserByEmail(email);
	}
	
	@GetMapping("/user/username/{username}")
	public User getUserByUsername(@PathVariable String username) {
		return userService.getUserByUsername(username);
	}
	
	@GetMapping("/user/phone/{phone}")
	public User getUserByPhone(@PathVariable long phone) {
		return userService.getUserByPhone(phone);
	}
	
	@GetMapping("/user/username-password/{username}/{password}")
	public User getUserByUsernameAndPassword(@PathVariable String username,@PathVariable String password) {
		return userService.getUserByUsernameAndPassword(username,password);
	}
	
	@GetMapping("/user/reset-password/{email}")
	public ResponseEntity<?> resetPassword(@PathVariable String email)
	{
		User user=userService.getUserByEmail(email);
		user=userService.sendResetMail(user);
		if(user!=null) {
			return new ResponseEntity<User>(user,HttpStatus.OK);
		}else{
			return new ResponseEntity<String>("Unable to send mail",HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping("/login")
	public ResponseEntity<?> login(HttpServletRequest request){
		String authToken=request.getHeader("Authorization");
		logger.info("Login using Authentication Token --> {}",authToken);
		String username=null;
		String password=null;
		if(authToken!=null && authToken.startsWith("Basic")) {
			String base64Credentials=authToken.substring("Basic".length()).trim();
			byte[] decodedCredentials=Base64.getDecoder().decode(base64Credentials);
			String credentials=new String(decodedCredentials, StandardCharsets.UTF_8);
			username=credentials.split(":")[0];
			password=credentials.split(":")[1];
		}
		try {
			User user=userService.getUserByUsernameAndPassword(username, password);
			logger.info("User Logged in Successfully with username ---> {}",username);
			return new ResponseEntity<User>(user,HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e.getStackTrace());
			logger.info("Unauthorized Access ---> {}",e.getStackTrace().toString());
			return new ResponseEntity<String>("No user found",HttpStatus.NOT_FOUND);
		}
	}

}
