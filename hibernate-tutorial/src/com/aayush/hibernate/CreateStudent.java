package com.aayush.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.aayush.Student;


public class CreateStudent {

	public static void main(String[] args) {
		//create session factory
		SessionFactory factory= new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		
		//create a session
		Session session= factory.getCurrentSession();
		
		
		try {
			//use session object to save Java object
			System.out.println("Creating:");
			//create a student obj
			Student tempStudent= new Student("Aayush", "Kumar", "aayushjha@gmail.com");
			
			//begin transaction
			session.beginTransaction();
			
			//save student obj
			System.out.println("Saving:");
			session.save(tempStudent);
			
			//commit transaction
			session.getTransaction().commit();
			System.out.println("Done");
		}
		
		finally {
			factory.close();
		}

	}

}
