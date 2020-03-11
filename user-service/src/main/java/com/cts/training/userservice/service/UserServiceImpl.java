package com.cts.training.userservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.cts.training.userservice.entity.User;
import com.cts.training.userservice.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepo userRepo;
	
	@Autowired
	JavaMailSender jms;

	@Override
	public User insert(User user) {
		userRepo.save(user);
		try {
			SimpleMailMessage sm = new SimpleMailMessage();
			sm.setFrom("babymol.bobby@gmail.com");
			sm.setTo(user.getEmail());
			sm.setSubject("Activate User Account");
			sm.setText("Hi "+user.getUsername()+",\n"
					+ "Your Account has been created successfully.\n"
					+ "Click on the Link below to activate your account:\n"
					+ "http://localhost:4200/user/activate?code="+user.getCode());
			jms.send(sm);
		}
		catch (Exception e){
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public void remove(int id) {
		userRepo.deleteById(id);
	}

	@Override
	public User update(User user) {
		return userRepo.save(user);
	}
	
	@Override
	public List<User> getAll() {
		return userRepo.findAll();
	}

	@Override
	public User getById(int id) {
		Optional<User> user=userRepo.findById(id);
		return user.orElse(null);
	}	

	@Override
	public User getUserByCode(long code) {
		Optional<User> user=userRepo.findByCode(code);
		return user.orElse(null);
	}

	@Override
	public User getUserByEmail(String email) {
		Optional<User> user=userRepo.findByEmail(email);
		return user.orElse(null);
	}
	
	@Override
	public User getUserByPhone(long phone) {
		Optional<User> user=userRepo.findByPhone(phone);
		return user.orElse(null);
	}
	
	@Override
	public User getUserByUsername(String username) {
		Optional<User> user=userRepo.findByUsername(username);
		return user.orElse(null);
	}
	
	@Override
	public User getUserByUsernameAndPassword(String username,String password) {
		Optional<User> user=userRepo.findByUsernameAndPassword(username, password);
		return user.orElse(null);
	}
	
	@Override
	public User sendResetMail(User user) {
		try {
			SimpleMailMessage sm = new SimpleMailMessage();
			sm.setFrom("babymol.bobby@gmail.com");
			sm.setTo(user.getEmail());
			sm.setSubject("Reset Password");
			sm.setText("Hi "+user.getUsername()+",\n"
					+ "Click on the Link below to reset your password:\n"
					+ "http://localhost:4200/reset-code?code="+user.getCode());
			jms.send(sm);
		}
		catch (Exception e){
			e.printStackTrace();
		}
		return user;
	}

}
