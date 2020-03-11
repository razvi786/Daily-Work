package com.cts.training.userservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.provider.HibernateUtils;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.cts.training.userservice.model.UserDTO;

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
			System.out.println("sending mail...");
		}
		catch (Exception e){
			e.printStackTrace();
		}
		return user;
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
			System.out.println("sending mail...");
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
	public User getById(int id) {
		Optional<User> user=userRepo.findById(id);
		return user.orElse(null);
	}

	@Override
	public List<User> getAll() {
		return userRepo.findAll();
	}

	@Override
	public User getUserByCode(long code) {
		return userRepo.findByCode(code);
	}

	@Override
	public User getUserByEmail(String email) {
		return userRepo.findByEmail(email);
	}

	@Override
	public User decrypt(String authToken) {
		String username=authToken.split(":")[0];
		User user=userRepo.findByUsername(username);
		return user;
	}
	
	@Override
	public UserDTO getUserByUsernameAndPassword(String username,String password) {
		Optional<User> u=userRepo.findByUsernameAndPassword(username, password);
		User user=u.orElse(null);
		UserDTO userDTO=new UserDTO();
		BeanUtils.copyProperties(user, userDTO);
		return userDTO;
	}

}
