package com.cts.training.middle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.cts.training.bean.IPO;
import com.cts.training.dao.IPODAO;

@Controller
public class IPOController {
	
	@Autowired
	IPODAO ipoDAO;
	
	@GetMapping("/ipo-home")
	public String addIPO(Model model) {
		List<IPO> ipos=ipoDAO.displayAllIPOs();
		model.addAttribute("list",ipos);
		model.addAttribute("ipo",new IPO());
		return "ipos";
	}
	
	@PostMapping("/ipo/save")
	public String saveIPO(@ModelAttribute("ipo")IPO ipo) {
		ipoDAO.saveOrUpdateIPO(ipo);
		return "redirect:/ipo-home";
	}
	
	@GetMapping("/ipo/update/{id}")
	public String updateIPO(@PathVariable("id") int id,Model model) {
		IPO ipo=ipoDAO.getIPOById(id);
		model.addAttribute("ipo",ipo);
		return "ipos";
	}

}
