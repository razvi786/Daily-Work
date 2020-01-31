package com.cts.activity.dao;

import java.util.List;

import com.cts.activity.bean.User;

public interface UserDAO{
	
	public boolean saveUser(User user);
	
	public boolean updateUser(User user);
	
	public boolean removeUser(User user);
	
	public User getUserById(int id);
	
	public List<User> getAllUsers();
	
}
