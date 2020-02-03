package com.cts.activity.dao;

import java.util.List;

import com.cts.activity.bean.User;

public interface UserDAO{
	
	public boolean saveUser(User user);
	
	public boolean updateUser(User user);
	
	public boolean removeUser(User user);
	
	public User getUserById(int id);
	
	public List<User> getAllUsers();
	
	public boolean isValidUser(String username,String password);
	
	public boolean isAdmin(int id);
	
	public boolean isActivated(int id);
	
}
