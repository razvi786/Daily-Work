package com.cts.training.middle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cts.training.dao.IPODAO;

@Controller
public class IPOController {
	
	@Autowired
	IPODAO ipoDAO;
	
	@GetMapping("/ipo-home")
	public String addIPO(Model model) {
		return "ipos";
	}

}
