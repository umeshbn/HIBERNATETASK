package com.xworkz.dog.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.dog.Dog;

public class DogDAOImpl implements DogDAO {

	@Override
	public void save(Dog dog) {
		Configuration configuration = new Configuration();
		configuration.configure("dbconn.config.xml");
		configuration.addAnnotatedClass(Dog.class);
		SessionFactory buildSessionFactory = configuration.buildSessionFactory();
		Session openSession = buildSessionFactory.openSession();
		Transaction beginTransaction = openSession.beginTransaction();
		//beginTransaction.begin();
		openSession.save(dog);		
		beginTransaction.commit();
		openSession.close();
		System.out.println("data added successfully..........");
	}

	@Override
	public void getByID(int DogId) {
		System.out.println("getByID....method is invoked");
		Configuration configuration = new Configuration();
		configuration.configure("dbconn.config.xml");
		configuration.addAnnotatedClass(Dog.class);
		SessionFactory buildSessionFactory = configuration.buildSessionFactory();
		Session openSession = buildSessionFactory.openSession();
		Transaction beginTransaction = openSession.beginTransaction();
		;
		//beginTransaction.begin();
		Dog dog = openSession.get(Dog.class,DogId);
		System.out.println(dog);
		beginTransaction.commit();
		openSession.close();
		System.out.println("data added successfully..........");
		
	}

}
