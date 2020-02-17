package com.cts.training.dao;

import java.util.List;

import com.cts.training.bean.Product;


public interface ProductDAO {
	
	
	public boolean saveOrUpdateProduct(Product product);

	public boolean deleteProduct(Product product);

	public Product getProductById(int id);

	public List<Product> getAllProducts();
	
	


}
