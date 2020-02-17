package com.cts.training.daoimpl;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.training.dao.ProductDAO;
import com.cts.training.dao.UserDAO;
import com.cts.training.bean.Product;

@Transactional
@Repository(value="productDAO")
public class ProductDAOImpl implements ProductDAO {
	@Autowired
	SessionFactory sessionFactory;
	@Override
	public boolean deleteProduct(Product product) {
		try {
			sessionFactory.getCurrentSession().delete(product);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}
	@Override
	public Product getProductById(int id) {
		try {
			return sessionFactory.getCurrentSession().get(Product.class,id);
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}
	@Override
	public List<Product> getAllProducts() {
		try {
			List<Product> products = sessionFactory.getCurrentSession().createQuery("from Product").list();
			return products;
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@Override
	public boolean saveOrUpdateProduct(Product product) {
		
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(product);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}
}