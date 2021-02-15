package com.company;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.company.entity.instructor;
import com.company.entity.instructor_detail;

public class DeleteDemo {
	
	public static void main(String args[]) {
		
		SessionFactory factory= new Configuration().configure().addAnnotatedClass(instructor.class).addAnnotatedClass(instructor_detail.class).buildSessionFactory();
		Session session= factory.getCurrentSession();
		
		try {
			session.beginTransaction();
			int theId= 2;
			instructor tempInstructor= session.get(instructor.class, theId);
			if(tempInstructor != null) {
				session.delete(tempInstructor);
				System.out.println("Deleted "+tempInstructor);
				//Cascade=ALL done so instructor_detail will also be deleted
			}
			
			
			
			//Cascade type= ALL, so save applies to instructorDetail1 as well
			
			
			session.getTransaction().commit();
			System.out.println("Done");
					
		}
		
		finally {
			factory.close();
		}
	}

}
