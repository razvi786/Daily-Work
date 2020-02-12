package com.cts.training.middle.controller;

import java.util.List;

import javax.swing.text.html.FormSubmitEvent.MethodType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cts.training.bean.User;
import com.cts.training.dao.UserDAO;

@Controller
public class UserController {
	
	@Autowired
	UserDAO userDAO;

	@GetMapping("/user-home")
	public String usersPage(Model model) {
		List<User> users=userDAO.getAllUsers();
		model.addAttribute("list",users);
		model.addAttribute("user",new User()); //user will work as a model attribute in the form
		return "users";
	}
	
	@PostMapping("/user/save")
//	@RequestMapping(value = "/user/save", method = RequestMethod.POST)
	public String addUser(@ModelAttribute("user") User user) {
		userDAO.saveOrUpdateUser(user);
		return "redirect:/user-home";
	}
	
	@GetMapping("/user/remove/{id}") // {x} -> Path Variable
	public String deleteUser(@PathVariable("id") int id) {
		User user=userDAO.getUserById(id);
		userDAO.removeUser(user);
		return "redirect:/user-home";
	}
	
	@GetMapping("/user/update/{id}")
	public String updateUsersPage(Model model, @PathVariable("id") int id) {
		List<User> users=userDAO.getAllUsers();
		model.addAttribute("list",users);
		User user=userDAO.getUserById(id);
		model.addAttribute("user",user); //user will work as a model attribute in the form
		return "users";
	}
	
//	@PostMapping("/user/update")
//	public String updateUser(@ModelAttribute("update_user") User user) {
////		User u=userDAO.getUserById(user.getId());
//		userDAO.updateUser(user);
//		return "redirect:/user-home";
//	}

}
