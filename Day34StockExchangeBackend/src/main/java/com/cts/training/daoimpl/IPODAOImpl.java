package com.cts.training.daoimpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.cts.training.bean.IPO;
import com.cts.training.dao.IPODAO;

public class IPODAOImpl implements IPODAO{

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public boolean saveIPO(IPO ipo) {
		try {
			Session session=sessionFactory.openSession();
			Transaction tx=session.beginTransaction();
			session.save(ipo);
			tx.commit();
			session.close();
			return true;
		} catch (HibernateException e) {
			System.out.println("Exception: "+e.getMessage());
			return false;
		}
	}

	@Override
	public boolean updateIPO(IPO ipo) {
		try {
			Session session=sessionFactory.openSession();
			Transaction tx=session.beginTransaction();
			session.update(ipo);
			tx.commit();
			session.close();
			return true;
		} catch (HibernateException e) {
			System.out.println("Exception: "+e.getMessage());
			return false;
		}
	}

	@Override
	public boolean deleteIPO(IPO ipo) {
		try {
			Session session=sessionFactory.openSession();
			Transaction tx=session.beginTransaction();
			session.delete(ipo);
			tx.commit();
			session.close();
			return true;
		} catch (HibernateException e) {
			System.out.println("Exception: "+e.getMessage());
			return false;
		}
	}

	@Override
	public IPO getIPOById(int id) {
		try {
			Session session=sessionFactory.openSession();
			Transaction tx=session.beginTransaction();
			IPO ipo=session.get(IPO.class, id);
			tx.commit();
			session.close();
			return ipo;
		} catch (HibernateException e) {
			System.out.println("Exception: "+e.getMessage());
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<IPO> displayAllIPOs() {
		try {
			Session session=sessionFactory.openSession();
			Transaction tx=session.beginTransaction();
			List<IPO> ipos=session.createQuery("FROM IPO").list();
			tx.commit();
			session.close();
			return ipos;
		} catch (HibernateException e) {
			System.out.println("Exception: "+e.getMessage());
			return null;
		}
	}
	
	

}
