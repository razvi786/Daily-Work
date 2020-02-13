package com.cts.training.middle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.cts.training.bean.Sector;
import com.cts.training.dao.SectorDAO;

@Controller
public class SectorController {

	@Autowired
	SectorDAO sectorDAO;

	@GetMapping("/sector-home")
	public String sectorHome(Model model) {
		List<Sector> list = sectorDAO.displayAllSectors();
		model.addAttribute("list", list);
		model.addAttribute("sector", new Sector());
		return "sectors";
	}

	@PostMapping("/sector/save")
	public String saveSector(@ModelAttribute("sector") Sector sector) {
		sectorDAO.saveOrUpdateSector(sector);
		return "redirect:/sector-home";
	}

	@GetMapping("/sector/remove/{id}")
	public String removeSector(@PathVariable("id") int id) {
		Sector sector = sectorDAO.getSectorById(id);
		sectorDAO.removeSector(sector);
		return "redirect:/sector-home";
	}

	@GetMapping("/sector/update/{id}")
	public String updateSector(@PathVariable("id") int id, Model model) {
		List<Sector> list = sectorDAO.displayAllSectors();
		model.addAttribute("list",list);
		Sector sector=sectorDAO.getSectorById(id);
		model.addAttribute("sector",sector);
		return "sectors";
	}

}
