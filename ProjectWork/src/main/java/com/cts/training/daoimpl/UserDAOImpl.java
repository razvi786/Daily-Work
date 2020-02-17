package com.cts.training.daoimpl;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.cts.training.dao.UserDAO;
import com.cts.training.bean.User;

@Transactional
@Repository(value = "userDAO")
public class UserDAOImpl implements UserDAO {

	@Autowired
	SessionFactory sessionFactory;

//	@Override
//	public boolean saveUser(User user) {
//		try {
//			sessionFactory.getCurrentSession().save(user);
//			return true;
//		} catch (HibernateException e) {
//			e.printStackTrace();
//			return false;
//		}
//	}
//	@Override
//	public boolean updateUser(User user) {
//		try {
//			sessionFactory.getCurrentSession().update(user);
//			return true;
//		} catch (HibernateException e) {
//			e.printStackTrace();
//			return false;
//		}
//	}
	@Override
	public boolean deleteUser(User user) {
		try {
			sessionFactory.getCurrentSession().delete(user);
			return true;
		} catch (HibernateException e) {
			System.out.println("Exc: " + e.getLocalizedMessage());
			return false;
		}
	}

	@Override
	public User getUserById(int id) {
		try {
			return sessionFactory.getCurrentSession().get(User.class, id);
		} catch (HibernateException e) {
			System.out.println("Exc: " + e.getLocalizedMessage());
			return null;
		}
	}

	@Override
	public List<User> getAllUsers() {
		try {
			List<User> users = sessionFactory.getCurrentSession().createQuery("FROM User").list();
			return users;
		} catch (HibernateException e) {
			System.out.println("Exc: " + e.getLocalizedMessage());
			return null;
		}
	}

//	@Override
//	public boolean isValidUser(String username, String Password) {
//		try {
//			Query query=sessionFactory.getCurrentSession().createQuery("from User where username=:username and password=:password");
//			query.setString("username", username);
//			query.setString("password",Password);
//			User user=(User) query.uniqueResult();
//			if(user.getPassword()!=null)
//			{
//				return true;
//			}
//		} catch (HibernateException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return false;
//	}
	@Override
	public boolean saveOrUpdateUser(User user) {

		try {
			sessionFactory.getCurrentSession().saveOrUpdate(user);
			return true;
		} catch (HibernateException e) {
			System.out.println("Exc: " + e.getLocalizedMessage());
			return false;
		}
	}

	@Override
	public boolean activateUser(int id) {
		try {
			User user = getUserById(id);
			user.setConfirmed(true);
			sessionFactory.getCurrentSession().update(user);
			return true;
		} catch (HibernateException e) {
			System.out.println("Exc: " + e.getLocalizedMessage());
			return false;
		}
	}

	@Override
	public boolean deactivateUser(int id) {
		try {
			User user = getUserById(id);
			user.setConfirmed(false);
			sessionFactory.getCurrentSession().update(user);
			return true;
		} catch (HibernateException e) {
			System.out.println("Exc: " + e.getLocalizedMessage());
			return false;
		}
	}
}