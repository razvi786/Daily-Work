package com.cts.training.dao;

import java.util.List;

import com.cts.training.bean.Category;



public interface CategoryDAO {
	
	public boolean saveOrUpdateCategory(Category category);

	public boolean deleteCategory(Category category);

	public Category getCategoryById(int id);

	public List<Category> getAllCategories();
	

}
