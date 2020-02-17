
package com.cts.training.controller;

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

import com.cts.training.bean.Supplier;
import com.cts.training.dao.SupplierDAO;




@Controller
public class SupplierController {

	@Autowired
	SupplierDAO supplierDAO;

	@GetMapping("/supplier-home")
	public String SupplierPage(Model model) {
		List<Supplier> suppliers= supplierDAO.getAllSuppliers();

		model.addAttribute("list", suppliers);
		model.addAttribute("supplier", new Supplier());
		
		return "manage-suppliers";

	}

	@PostMapping("/supplier/save")
	// @RequestMapping(value="/user/save",method=MethodType.POST)
	public String addSupplier(@ModelAttribute("supplier") Supplier supplier) {
		supplierDAO.saveOrUpdateSupplier(supplier);
		return "redirect:/supplier-home";
	}

	@GetMapping("/supplier/delete/{id}")
	public String deleteSupplier(@PathVariable("id") int id) {

		Supplier supplier = supplierDAO.getSupplierById(id);
		supplierDAO.deleteSupplier(supplier);
		return "redirect:/supplier-home";
	}
	
	@GetMapping("/supplier/update/{id}")
	public String updateSupplier(@PathVariable("id") int id,Model model) {
		List<Supplier> suppliers= supplierDAO.getAllSuppliers();

		model.addAttribute("list", suppliers);
		
		Supplier supplier = supplierDAO.getSupplierById(id);
		model.addAttribute("supplier",supplier);	
		
		return "manage-suppliers";
			
	}
	
	@GetMapping("/register-supplier")
	public String regSupplier(Model model) {
		model.addAttribute("supplier", new Supplier());
		return "register-supplier";
	}
	
	@PostMapping("/supplier/register")
	public String registerSupplier(@ModelAttribute("supplier") Supplier supplier) {
		supplierDAO.saveOrUpdateSupplier(supplier);
		return "redirect:/home";
	}
	
}
