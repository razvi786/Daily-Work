package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductRestServiceController {
	@Autowired
	ProductRepo pr;
	
	@Autowired
	JavaMailSender jms;
	
	@RequestMapping(value = "/prod",method = RequestMethod.GET,produces = MediaType.APPLICATION_XML_VALUE)
//	@GetMapping(value = "/prod")
	public List<Product> findAll(){
		return pr.findAll();
	}
	
	@RequestMapping(value = "/prod/{id}",method = RequestMethod.GET,produces = MediaType.APPLICATION_XML_VALUE)
//	@GetMapping("/prod/{id}")
	public Product findOne(@PathVariable int id) {
		Optional<Product> pro=pr.findById(id);
		Product p=pro.get();
		return p;
	}
	
	@RequestMapping(value = "/prod",method = RequestMethod.POST)
//	@PostMapping("/prod")
	public Product save(@RequestBody Product pro) {
		Product prod=pr.save(pro);
		return prod;
	}
	
	@RequestMapping(value = "/prod/{id}",method = RequestMethod.DELETE)
//	@GetMapping("/prod/{id}")
	public void delete(@PathVariable int id) {
		pr.deleteById(id);
	}
	
	@RequestMapping(value="/reg",method=RequestMethod.GET,produces = MediaType.APPLICATION_XML_VALUE)
	public String reg() {
		try {
			SimpleMailMessage sm=new SimpleMailMessage();
			sm.setFrom("Peronx.gmail.com");
			sm.setTo("ehsan.razvi786@gmail.com");
			sm.setSubject("Testing Mail");
			sm.setText("This is a testing mail...");
			jms.send(sm);
			System.out.println("Sending Mail...");
		}catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		return "{\"reg\":\"ok\"}";
	}
	
}
