package com.cts.training.userservice.service;

import java.util.List;

import com.cts.training.userservice.entity.User;

public interface UserService{
	
	public User insert(User user);
	
	public void remove(int id);
	
	public User update(User user);
	
	public List<User> getAll();
	
	public User getById(int id);
	
	public User getUserByCode(long code);
	
	public User getUserByEmail(String email);
	
	public User getUserByUsername(String username);
	
	public User getUserByPhone(long phone);

	public User getUserByUsernameAndPassword(String username, String password);
	
	public User sendResetMail(User user);
	
}