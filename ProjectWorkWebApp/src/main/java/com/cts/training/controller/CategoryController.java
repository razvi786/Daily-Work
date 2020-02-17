package com.cts.training.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.cts.training.bean.Category;
import com.cts.training.dao.CategoryDAO;

@Controller
public class CategoryController {
		@Autowired
		CategoryDAO categoryDAO;
		@GetMapping("/category-home")
		public String CategoryPage(Model model)
		{
			model.addAttribute("category", new Category());
			List<Category> categories=categoryDAO.getAllCategories();
			model.addAttribute("list", categories);
			return "manage-categories";
		}
		@PostMapping("/category/save")
		
		public String addCategory(@ModelAttribute("category") Category category){
			categoryDAO.saveOrUpdateCategory(category);
			return "redirect:/category-home";
		}
		@GetMapping("/category/delete/{id}")
		public String deleteCategory(@PathVariable("id")int id)
		{
			Category category= categoryDAO.getCategoryById(id);
			categoryDAO.deleteCategory(category);
			return "redirect:/category-home";
		}
		@GetMapping("/category/update/{id}")
		public String saveOrUpdateCategory(@PathVariable("id") int id, Model model)
		{
			Category category= categoryDAO.getCategoryById(id);
			model.addAttribute("category",category);
			List<Category> categories=categoryDAO.getAllCategories();
			model.addAttribute("list", categories);
			return "manage-categories";
		}
	}