package com.cts.training.userservice.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.training.userservice.entity.User;

public interface UserRepo extends JpaRepository<User, Integer>{
	
	public Optional<User> findByEmail(String email);
	
	public Optional<User> findByUsername(String username);
	
	public Optional<User> findByPhone(long phone);
	
	public Optional<User> findByCode(long code);
	
	public Optional<User> findByUsernameAndPassword(String username,String password);

}
