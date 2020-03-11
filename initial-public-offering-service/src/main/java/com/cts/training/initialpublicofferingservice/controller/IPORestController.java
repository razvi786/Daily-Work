package com.cts.training.initialpublicofferingservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.training.initialpublicofferingservice.entity.IPO;
import com.cts.training.initialpublicofferingservice.service.IPOService;

@CrossOrigin(origins = "*")
@RestController
public class IPORestController {
	
	@Autowired
	IPOService ipoService;
	
	@PostMapping("/ipo")
	public ResponseEntity<?> saveIPO(@RequestBody IPO i) {
		IPO ipo= ipoService.insert(i);
		return new ResponseEntity<IPO>(ipo,HttpStatus.OK);
	}
	
	@DeleteMapping("/ipo/{id}")
	public void deleteIPO(@PathVariable int id) {
		ipoService.remove(id);
	}
	
	@PutMapping("/ipo")
	public ResponseEntity<?> updateIPO(@RequestBody IPO i) {
		IPO ipo= ipoService.update(i);
		return new ResponseEntity<IPO>(ipo,HttpStatus.OK);
	}
	
	@GetMapping("/ipo")
	public ResponseEntity<?> getAllIPOs(){
		List<IPO> ipos= ipoService.getAll();
		if(ipos.size()>0) {
			return new ResponseEntity<List<IPO>>(ipos,HttpStatus.OK);
		}else {
			return new ResponseEntity<String>("No Ipos Found",HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/ipo/{id}")
	public ResponseEntity<?> getIPOById(@PathVariable int id) {
		IPO ipo=ipoService.getById(id);
		if(ipo!=null) {
			return new ResponseEntity<IPO>(ipo,HttpStatus.OK);
		}else {
			return new ResponseEntity<String>("IPO Not Found",HttpStatus.NOT_FOUND);
		}
	}

}
