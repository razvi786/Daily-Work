package com.cts.training.daoimpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.training.bean.User;
import com.cts.training.dao.UserDAO;

@Transactional
@Repository(value = "userDAO")
public class UserDAOImpl implements UserDAO{
	
	@Autowired
	SessionFactory sessionFactory;

//	@Override
//	public boolean saveUser(User user) {
//		try {
//			sessionFactory.getCurrentSession().save(user);
//			return true;
//		} catch (HibernateException e) {
//			System.out.println("Exception: "+e.getMessage());
//			return false;
//		}
//	}

//	@Override
//	public boolean updateUser(User user) {
//		try {
//			sessionFactory.getCurrentSession().update(user);
//			return true;
//		} catch (HibernateException e) {
//			System.out.println("Exception: "+e.getMessage());
//			return false;
//		}
//	}

	@Override
	public boolean removeUser(User user) {
		try {
			sessionFactory.getCurrentSession().delete(user);
			return true;
		} catch (HibernateException e) {
			System.out.println("Exception: "+e.getMessage());
			return false;
		}
	}

	@Override
	public User getUserById(int id) {
		try {
			return sessionFactory.getCurrentSession().get(User.class, id);
		} catch (HibernateException e) {
			System.out.println("Exception: "+e.getMessage());
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getAllUsers() {
		try {
			List<User>  users=sessionFactory.getCurrentSession().createQuery("FROM User").list();
			return users;
		} catch (HibernateException e) {
			System.out.println("Exception: "+e.getMessage());
			return null;
		}
	}

	@Override
	public boolean isValidUser(String username, String password) {
		try {
			Query query=sessionFactory.getCurrentSession().createQuery("FROM User WHERE username=:uname AND password=:pwd");
			query.setString("uname", username);
			query.setString("pwd", password);
			User user=(User) query.uniqueResult();
			if(user==null)
				return false;
			else
				return true;
		} catch (HibernateException e) {
			System.out.println("Exception: "+e.getMessage());
			return false;
		}
	}

	@Override
	public boolean isAdmin(int id) {
		try {
			Query query=sessionFactory.getCurrentSession().createQuery("FROM User WHERE id=:id AND admin=true");
			query.setString("id", String.valueOf(id));
			User user=(User) query.uniqueResult();
			if(user == null)
				return false;
			else
				return true;
		} catch (HibernateException e) {
			System.out.println("Exception: "+e.getMessage());
			return false;
		}
	}

	@Override
	public boolean isActivated(int id) {
		try {
			Query query=sessionFactory.getCurrentSession().createQuery("FROM User WHERE id=:id AND confirmed=true");
			query.setString("id", String.valueOf(id));
			User user=(User) query.uniqueResult();
			if(user == null)
				return false;
			else
				return true;
		} catch (HibernateException e) {
			System.out.println("Exception: "+e.getMessage());
			return false;
		}
	}

	@Override
	public boolean saveOrUpdateUser(User user) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(user);
			return true;
		} catch (HibernateException e) {
			System.out.println("Exception: "+e.getMessage());
			return false;
		}
	}

}
