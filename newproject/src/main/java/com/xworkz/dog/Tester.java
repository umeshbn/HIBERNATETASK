package com.xworkz.dog;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Tester {
	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure("dbconn.config.xml");
		configuration.addAnnotatedClass(Dog.class);
		SessionFactory buildSessionFactory = configuration.buildSessionFactory();
		Session openSession = buildSessionFactory.openSession();
		Dog dog = new Dog(1, "hero", "gottila", "do", "it", "for");
		Transaction beginTransaction = openSession.beginTransaction();
		//beginTransaction.begin();
		openSession.save(dog);
		beginTransaction.commit();
		openSession.close();

	}

}
