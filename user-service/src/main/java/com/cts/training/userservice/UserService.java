package com.cts.training.userservice;

import java.util.List;

public interface UserService {
	
	public User insert(User user);
	
	public void remove(int id);
	
	public User update(User user);
	
	public User getById(int id);
	
	public List<User> getAll();
	
	public User getUserByCode(long code);
	
	public User reset(User user);
	
}
