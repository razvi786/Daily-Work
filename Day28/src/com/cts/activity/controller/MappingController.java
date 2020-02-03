package com.cts.activity.controller;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.cts.activity.bean.Actor;
import com.cts.activity.bean.Developer;
import com.cts.activity.bean.Movie;
import com.cts.activity.bean.PassportDetails;
import com.cts.activity.bean.Person;
import com.cts.activity.bean.Technology;

public class MappingController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session=sessionFactory.openSession();
//		Transaction tx=session.beginTransaction();
		
//		Person person=new Person();
//		person.setName("John Cena");
//		
//		PassportDetails passport=new PassportDetails();
//		passport.setPassportNumber("7966 3361");
//		passport.setPerson(person);
//		person.setPassport(passport);
//		
//		session.save(person);
		
//		Criteria criteria=session.createCriteria(Person.class);
//		Person p=(Person) criteria.uniqueResult();
//		System.out.println(p.getName());
//		List<Person> persons=criteria.add(Restrictions.gt("id", 0)).list();
//		for(Person p : persons)
//			System.out.println(p.getId()+" : "+p.getName()+" : "+p.getPassport().getPassportNumber());
		
//		Movie movie=new Movie();
//		movie.setName("Avengers");
//		
//		Actor actor1=new Actor();
//		actor1.setActorName("Dr. Strange");
//		actor1.setMovie(movie);
//		
//		Actor actor2=new Actor();
//		actor2.setActorName("Iron Man");
//		actor2.setMovie(movie);
//		
//		Actor actor3=new Actor();
//		actor3.setActorName("Captain America");
//		actor3.setMovie(movie);
//		
//		session.save(movie);
//		session.save(actor1);
//		session.save(actor2);
//		session.save(actor3);
		
		
		
		Technology tech1=new Technology();
		tech1.setLanguage("Angular");
		
		Technology tech2=new Technology();
		tech2.setLanguage("Hibernate");
		
		Set<Technology> technologies=new LinkedHashSet<Technology>();
		technologies.add(tech1);
		technologies.add(tech2);
		
		Developer dev1=new Developer();
		dev1.setName("Aniket");
		dev1.setTechnology(technologies);
		
		Developer dev2=new Developer();
		dev2.setName("Kumar");
		dev2.setTechnology(technologies);
		
		Transaction transaction = session.getTransaction();
		transaction.begin();
		session.save(dev1);
		session.save(dev2);
		
		transaction.commit();
//		tx.commit();
		session.close();

	}

}
