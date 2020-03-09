package com.cts.training.userservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer>{
	
	public User findByEmail(String email);
	
	public User findByUsername(String username);
	
	public User findByCode(long code);

}
