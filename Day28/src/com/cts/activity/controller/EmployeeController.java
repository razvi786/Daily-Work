package com.cts.activity.controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cts.activity.bean.ContractualEmployee;
import com.cts.activity.bean.Employee;
import com.cts.activity.bean.PermanentEmployee;

public class EmployeeController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		
		Employee emp=new Employee();
		emp.setName("Hardik Pandya");
		
		PermanentEmployee pe=new PermanentEmployee();
		pe.setSalary(23690);
		pe.setBonus(5000);
		pe.setName("Sumuk");
		
		ContractualEmployee ce=new ContractualEmployee();
		ce.setPayPerHour(1500);
		ce.setContractPeriod(30);
		ce.setName("Anil");
		
		session.save(emp);
		session.save(pe);
		session.save(ce);
		
		tx.commit();
		session.close();

	}

}
