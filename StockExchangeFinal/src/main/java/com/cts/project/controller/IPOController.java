package com.cts.project.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.project.bean.IPO;
import com.cts.project.repo.IPORepo;

@CrossOrigin(origins = "*")
@RestController
public class IPOController {
	
	@Autowired
	IPORepo ipoRepo;
	
	@GetMapping("/ipo")
	public List<IPO> getAllIpos(){
		return ipoRepo.findAll();
	}
	
	@GetMapping("/ipo/{id}")
	public IPO getIpoById(@PathVariable int id) {
		Optional<IPO> ipo=ipoRepo.findById(id);
		IPO i=ipo.get();
		return i;
	}
	
	@PostMapping("/ipo")
	public IPO saveIpo(@RequestBody IPO ipo) {
		IPO i=ipoRepo.save(ipo);
		return i;
	}
	
	@DeleteMapping("/ipo/{id}")
	public void deleteIpo(@PathVariable int id) {
		ipoRepo.deleteById(id);
	}
	
	@PutMapping("/ipo")
	public IPO updateIpo(@RequestBody IPO ipo) {
		IPO i=ipoRepo.save(ipo);
		return i;
	}

}
