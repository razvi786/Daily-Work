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

import com.cts.training.bean.Category;
import com.cts.training.dao.CategoryDAO;



@Transactional
@Repository(value="categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	@Autowired
	SessionFactory sessionFactory;
	@Override
	public boolean deleteCategory(Category category) {
		try {
			sessionFactory.getCurrentSession().delete(category);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}
	@Override
	public Category getCategoryById(int id) {
		try {
			return sessionFactory.getCurrentSession().get(Category.class,id);
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}
	@Override
	public List<Category> getAllCategories() {
		try {
			List<Category> categories = sessionFactory.getCurrentSession().createQuery("from Category").list();
			return categories;
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@Override
	public boolean saveOrUpdateCategory(Category category) {
		
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(category);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}
}