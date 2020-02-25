package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class LoginController {
//	@RequestMapping(value= "/login", method = RequestMethod.GET)
	@GetMapping("/login")
//	@ResponseBody
	public String showLogin(ModelMap model)
	{
		return "login";
	}
//	@RequestMapping(value= "/login", method= RequestMethod.POST)
	@PostMapping("/login")
	public String showWelcome(@RequestParam String nm, ModelMap model)
	{
	model.put("name",  nm);
	return "welcome";
    }
	@GetMapping("/")
	public String test() {
		return "login";
	}
}