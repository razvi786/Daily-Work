package com.cts.training.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	@GetMapping({"/","/home"})
	public String homePage() {
		return "home";
	}
	
	@GetMapping("/admin")
	public String admin(Model model,Principal principal) {
		String loggedInUserName=principal.getName();
		model.addAttribute("user",loggedInUserName);
		model.addAttribute("name","Spring Security");
		model.addAttribute("description","Page is protected");
		return "admin";
	}
	
	@PostMapping("/login")
	public String login(ModelMap map) {
		return "login";
	}
	
	@GetMapping("/logout")
	public String logout(ModelMap model) {
		return "logout";
	}
	
	@GetMapping("/loginError")
	public String loginError(ModelMap model) {
		model.addAttribute("error","true");
		return "login";
	}
	
	@GetMapping("/accessDenied")
	public ModelAndView accessDenied(Principal user) { 
				ModelAndView model=new ModelAndView();
				if(user != null) {
					model.addObject("msg","Hi "+ user.getName() + ", you do not have permission to access this page!");
				}else {
					model.addObject("msg","You do not have permission to access this page!");
				}
				model.setViewName("accessDenied");
				return model;
	}

}
