package com.company;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.company.entity.instructor;
import com.company.entity.instructor_detail;

public class CreateDemo {
	
	public static void main(String args[]) {
		
		SessionFactory factory= new Configuration().configure().addAnnotatedClass(instructor.class).addAnnotatedClass(instructor_detail.class).buildSessionFactory();
		Session session= factory.getCurrentSession();
		
		try {
			System.out.println("Creating instructor and details:....");
			/*instructor instructor1= new instructor("Aayush", "Kumar", "aayushjhamech@gmail.com");
			instructor_detail instructor_detail1= new instructor_detail("aayush@youtube.com", "reading");
			instructor1.setInstructorDetail(instructor_detail1);
			*/
			
			instructor instructor2= new instructor("Monisha", "Roy", "monisha@gmail.com");
			instructor_detail instructor_detail2= new instructor_detail("monisha@youtube.com", "Irritate");
			instructor2.setInstructorDetail(instructor_detail2);
			
			
			session.beginTransaction();
			System.out.println("Saving tables/.......");
			session.save(instructor2);
			//Cascade type= ALL, so save applies to instructorDetail1 as well
			
			
			session.getTransaction().commit();
			System.out.println("Done");
					
		}
		
		finally {
			factory.close();
		}
	}

}
