package com.aayush.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.aayush.Student;



public class QueryStudent {

	public static void main(String[] args) {
		//create session factory
		SessionFactory factory= new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		
		//create a session
		Session session= factory.getCurrentSession();
		
		
		try {
			//begin transaction
			session.beginTransaction();
			
			//query and display students
			
			List<Student> theStudents= session.createQuery("from Student").getResultList();
			
			displayStudents(theStudents);
			
			theStudents= session.createQuery("from Student s where s.lastName='Kumar'").getResultList();
			System.out.println("\n Students with last Name as Kumar: \n");
			displayStudents(theStudents);
			
			//space before s.lastName is necessary
			theStudents= session.createQuery("from Student s where"
					+" s.lastName='Kumar' OR s.lastName='Jha'").getResultList();
			System.out.println("\n Students with last Name as Kumar or Jha: \n");
			displayStudents(theStudents);
			
			//commit transaction
			session.getTransaction().commit();
			System.out.println("Done");
		}
		
		finally {
			factory.close();
		}

	}

	private static void displayStudents(List<Student> theStudents) {
		for(Student tempStudent: theStudents) {
			System.out.println(tempStudent);
		}
	}

}
