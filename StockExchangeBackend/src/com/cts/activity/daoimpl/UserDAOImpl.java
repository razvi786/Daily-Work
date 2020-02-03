package com.cts.activity.daoimpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.cts.activity.bean.User;
import com.cts.activity.dao.UserDAO;
import com.cts.activity.hibernate.HibernateUtil;

public class UserDAOImpl implements UserDAO{
	
	SessionFactory sessionFactory=HibernateUtil.getSessionFactory();

	@Override
	public boolean saveUser(User user) {
		try {
			Session session=sessionFactory.openSession();
			Transaction tx=session.beginTransaction();
			session.save(user);
			tx.commit();
			session.close();
			return true;
		} catch (HibernateException e) {
			System.out.println("Exception: "+e.getMessage());
			return false;
		}
	}

	@Override
	public boolean updateUser(User user) {
		try {
			Session session=sessionFactory.openSession();
			Transaction tx=session.beginTransaction();
			session.update(user);
			tx.commit();
			session.close();
			return true;
		} catch (HibernateException e) {
			System.out.println("Exception: "+e.getMessage());
			return false;
		}
	}

	@Override
	public boolean removeUser(User user) {
		try {
			Session session=sessionFactory.openSession();
			Transaction tx=session.beginTransaction();
			session.delete(user);
			tx.commit();
			session.close();
			return true;
		} catch (HibernateException e) {
			System.out.println("Exception: "+e.getMessage());
			return false;
		}
	}

	@Override
	public User getUserById(int id) {
		try {
			Session session=sessionFactory.openSession();
			Transaction tx=session.beginTransaction();
			User user=session.get(User.class, id);
			tx.commit();
			session.close();
			return user;
		} catch (HibernateException e) {
			System.out.println("Exception: "+e.getMessage());
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getAllUsers() {
		try {
			Session session=sessionFactory.openSession();
			Transaction tx=session.beginTransaction();
			List<User> users=session.createQuery("FROM User").list();
			tx.commit();
			session.close();
			return users;
		} catch (HibernateException e) {
			System.out.println("Exception: "+e.getMessage());
			return null;
		}
	}

	@Override
	public boolean isValidUser(String username, String password) {
		try {
			Session session=sessionFactory.openSession();
			Transaction tx=session.beginTransaction();
			Query query=session.createQuery("FROM User WHERE username=:uname AND password=:pwd");
			query.setString("uname", username);
			query.setString("pwd", password);
			
			User user=(User) query.uniqueResult();
			tx.commit();
			session.close();
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
			Session session=sessionFactory.openSession();
			Transaction tx=session.beginTransaction();
			Query query=session.createQuery("FROM User WHERE id=:id AND admin=true");
			query.setString("id", String.valueOf(id));
			
			User user=(User) query.uniqueResult();
			tx.commit();
			session.close();
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
			Session session=sessionFactory.openSession();
			Transaction tx=session.beginTransaction();
			Query query=session.createQuery("FROM User WHERE id=:id AND confirmed=true");
			query.setString("id", String.valueOf(id));
			
			User user=(User) query.uniqueResult();
			tx.commit();
			session.close();
			if(user == null)
				return false;
			else
				return true;
		} catch (HibernateException e) {
			System.out.println("Exception: "+e.getMessage());
			return false;
		}
	}

}
