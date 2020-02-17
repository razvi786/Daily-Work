
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

import com.cts.training.bean.Product;
import com.cts.training.dao.ProductDAO;



@Controller
public class ProductController {

	@Autowired
	ProductDAO productDAO;

	@GetMapping("/product-home")
	public String ProductPage(Model model) {
		List<Product> products = productDAO.getAllProducts();
		model.addAttribute("list", products);
		model.addAttribute("product", new Product());
		return "manage-products";

	}

	@PostMapping("/product/save")
	public String addProduct(@ModelAttribute("product") Product product) {
		productDAO.saveOrUpdateProduct(product);
		return "redirect:/product-home";
	}

	@GetMapping("/product/delete/{id}")
	public String deleteProduct(@PathVariable("id") int id) {
		Product product = productDAO.getProductById(id);
		productDAO.deleteProduct(product);
		return "redirect:/product-home";
	}
	
	@GetMapping("/product/update/{id}")
	public String updateProduct(@PathVariable("id") int id,Model model) {
		List<Product> products = productDAO.getAllProducts();
		model.addAttribute("list", products);
		Product product = productDAO.getProductById(id);
		model.addAttribute("product",product);	
		return "manage-products";
			
	}
	
	@GetMapping("view-product/{id}")
	public String viewProduct(@PathVariable("id")int id,Model model) {
		Product product=productDAO.getProductById(id);
		model.addAttribute("product", product);
		return "view-product";
	}
}
