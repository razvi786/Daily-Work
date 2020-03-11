package com.cts.training.userservice;

import java.util.List;

import com.cts.training.userservice.model.UserDTO;

public interface UserService{
	
	public User insert(User user);
	
	public User sendResetMail(User user);
	
	public void remove(int id);
	
	public User update(User user);
	
	public User getById(int id);
	
	public List<User> getAll();
	
	public User getUserByCode(long code);
	
	public User getUserByEmail(String email);
	
	public User decrypt(String authToken);

	public UserDTO getUserByUsernameAndPassword(String username, String password);
	
}