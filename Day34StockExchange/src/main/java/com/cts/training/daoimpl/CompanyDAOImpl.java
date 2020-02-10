//package com.cts.training.daoimpl;
//
//import java.util.List;
//
//import org.hibernate.HibernateException;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//
//import com.cts.activity.hibernate.HibernateUtil;
//import com.cts.training.bean.Company;
//import com.cts.training.dao.CompanyDAO;
//
//public class CompanyDAOImpl implements CompanyDAO{
//
//	SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
//	
//	@Override
//	public boolean saveCompany(Company company) {
//		try {
//			Session session=sessionFactory.openSession();
//			Transaction tx=session.beginTransaction();
//			session.save(company);
//			tx.commit();
//			session.close();
//			return true;
//		}catch (HibernateException e) {
//			System.out.println("Exception: "+e.getMessage());
//			return false;
//		}
//	}
//
//	@Override
//	public boolean updateCompany(Company company) {
//		try {
//			Session session=sessionFactory.openSession();
//			Transaction tx=session.beginTransaction();
//			session.update(company);
//			tx.commit();
//			session.close();
//			return true;
//		}catch (HibernateException e) {
//			System.out.println("Exception: "+e.getMessage());
//			return false;
//		}
//	}
//
//	@Override
//	public boolean removeCompany(Company company) {
//		try {
//			Session session=sessionFactory.openSession();
//			Transaction tx=session.beginTransaction();
//			session.delete(company);
//			tx.commit();
//			session.close();
//			return true;
//		}catch (HibernateException e) {
//			System.out.println("Exception: "+e.getMessage());
//			return false;
//		}
//	}
//
//	@Override
//	public Company getCompanyById(int id) {
//		try {
//			Session session=sessionFactory.openSession();
//			Transaction tx=session.beginTransaction();
//			Company company=session.get(Company.class, id);
//			session.update(company);
//			tx.commit();
//			session.close();
//			return company;
//		}catch (HibernateException e) {
//			System.out.println("Exception: "+e.getMessage());
//			return null;
//		}
//	}
//
//	@SuppressWarnings("unchecked")
//	@Override
//	public List<Company> getAllCompanies() {
//		try {
//			Session session=sessionFactory.openSession();
//			Transaction tx=session.beginTransaction();
//			List<Company> companies=session.createQuery("FROM Company").list();
//			tx.commit();
//			session.close();
//			return companies;
//		}catch (HibernateException e) {
//			System.out.println("Exception: "+e.getMessage());
//			return null;
//		}
//	}
//
//}
