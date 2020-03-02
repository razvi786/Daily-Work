package com.cts.project.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.cts.project.bean.User;
import com.cts.project.dto.UserDTO;
import com.cts.project.repo.UserRepo;
import com.cts.project.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepo userRepo;
	
	@Autowired
	JavaMailSender jms;

	@Override
	public UserDTO insert(UserDTO userDTO) {
		User userEntity=new User();
		BeanUtils.copyProperties(userDTO,userEntity);
		userRepo.save(userEntity);
		try {
			SimpleMailMessage sm = new SimpleMailMessage();
			sm.setFrom("babymol.bobby@gmail.com");
			sm.setTo(userDTO.getEmail());
			sm.setSubject("Activate User Account");
			sm.setText("Hi "+userDTO.getUsername()+",\n"
					+ "Your Account has been created successfully.\n"
					+ "Click on the Link below to activate your account:\n"
					+ "http://localhost:4200/user/activate?code="+userDTO.getCode());
			jms.send(sm);
			System.out.println("sending mail...");
		}
		catch (Exception e){
			e.printStackTrace();
		}
		return userDTO;
	}

	@Override
	public void remove(int id) {
		userRepo.deleteById(id);
	}

	@Override
	public UserDTO update(UserDTO userDTO) {
		User userEntity=new User();
		BeanUtils.copyProperties(userDTO,userEntity);
		userRepo.save(userEntity);
		return userDTO;
	}

	@Override
	public UserDTO getById(int id) {
		Optional<User> u=userRepo.findById(id);
		User userEntity=u.orElse(new User());
		UserDTO userDTO=new UserDTO();
		BeanUtils.copyProperties(userEntity,userDTO);
		return userDTO;
	}

	@Override
	public List<UserDTO> getAll() {
		List<User> userEntities=userRepo.findAll();
		List<UserDTO> userDTOs=new ArrayList<UserDTO>();
		for(User userEntity:userEntities) {
			UserDTO userDTO=new UserDTO();
			BeanUtils.copyProperties(userEntity,userDTO);
			userDTOs.add(userDTO);
		}
		return userDTOs;
	}

	@Override
	public UserDTO getUserByCode(long code) {
		User userEntity=userRepo.findByCode(code);
		UserDTO userDTO=new UserDTO();
		BeanUtils.copyProperties(userEntity, userDTO);
		return userDTO;
	}

}
