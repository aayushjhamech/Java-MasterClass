package com.company;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.company.entity.instructor;
import com.company.entity.instructor_detail;

public class GetInstructorDetailDemo {
	
	public static void main(String args[]) {
		
		SessionFactory factory= new Configuration().configure().addAnnotatedClass(instructor.class).addAnnotatedClass(instructor_detail.class).buildSessionFactory();
		Session session= factory.getCurrentSession();
		
		try {
			session.beginTransaction();
			//get instructor detail object
			int theId=1;
			instructor_detail instructorHobby= session.get(instructor_detail.class, theId);
		
			// print inst detail obj
			System.out.println("Instructor Details: "+instructorHobby);
			//print associated instructor
			System.out.println("Instructor: "+instructorHobby.getInstructor());
			
			session.getTransaction().commit();
			System.out.println("Done");
					
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
				session.close();
				factory.close();
		}
	}

}
