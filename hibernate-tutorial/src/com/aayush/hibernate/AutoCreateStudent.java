package com.aayush.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.aayush.Student;

public class AutoCreateStudent {

	public static void main(String[] args) {
		// SessionFactory factory= new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		SessionFactory factory= new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		//create a session
		Session session= factory.getCurrentSession();
		
		
		try {
			//use session object to save Java object
			System.out.println("Creating students:");
			//create a student obj
			Student tempStudent1= new Student("Sushant", "Kumar", "shushantk@gmail.com");
			Student tempStudent2= new Student("Ankita", "Jana", "ankitajana@gmail.com");
			Student tempStudent3= new Student("Vedant", "Jha", "vedantjha@gmail.com");
			
			//begin transaction
			session.beginTransaction();
			
			//save student obj
			System.out.println("Saving students:");
			session.save(tempStudent1);
			session.save(tempStudent2);
			session.save(tempStudent3);
			
			//commit transaction
			session.getTransaction().commit();
			System.out.println("Done");
		}
		
		finally {
			factory.close();
		}

	}

}
