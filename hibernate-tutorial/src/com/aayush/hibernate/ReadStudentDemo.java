package com.aayush.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.aayush.Student;


public class ReadStudentDemo {

	public static void main(String[] args) {
		//create session factory
		SessionFactory factory= new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		
		//create a session
		Session session= factory.getCurrentSession();
		
		
		try {
			//use session object to save Java object
			System.out.println("Creating:");
			//create a student obj
			Student tempStudent= new Student("Sarthak", "Kumar", "sarthakk@gmail.com");
			
			//begin transaction
			session.beginTransaction();
			
			//save student obj
			System.out.println("Saving:");
			session.save(tempStudent);
			
			//commit transaction
			session.getTransaction().commit();
			
			//find out what primary key is
			System.out.println("Id for student:"+tempStudent.getId());
			
			//now get a new session and start transaction
			session= factory.getCurrentSession();
			session.beginTransaction();
			//retreive student based on id: primary key
			System.out.println("Get student with id: "+tempStudent.getId());
			Student myStudent=session.get(Student.class, tempStudent.getId());
			System.out.println("Get complete: "+myStudent);
			
			//commit transaction
			session.getTransaction().commit();
			
			
			System.out.println("Done");
		}
		
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		finally {
			factory.close();
		}

	}

}
