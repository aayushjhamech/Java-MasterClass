package com.aayush.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.aayush.Student;


public class UpdateStudentDemo {

	public static void main(String[] args) {
		//create session factory
		SessionFactory factory= new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		
		//create a session
		Session session= factory.getCurrentSession();
		
		
		try {
			//begin transaction
			
			int studentId=1;
			
			//now get a new session and start transaction
			session= factory.getCurrentSession();
			session.beginTransaction();
			//retreive student based on id: primary key
			System.out.println("Get student with id: "+studentId);
			Student myStudent=session.get(Student.class, studentId);
			System.out.println("Updating student: ");
			myStudent.setFirstName("Aarav");
			
			//commit transaction
			session.getTransaction().commit();
			
			
			session= factory.getCurrentSession();
			session.beginTransaction();
			
			session.createQuery("update Student set email= 'aayush@gmail.com'").executeUpdate();
			
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
