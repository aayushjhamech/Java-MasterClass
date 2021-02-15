package com.company;


import java.util.List;

import javax.persistence.Id;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.aayush.employeedata;

public class CreateEmployee {

	public static void main(String[] args) {
		
		SessionFactory factory= new Configuration().configure().addAnnotatedClass(employeedata.class)
				.buildSessionFactory();
		
		Session session= factory.getCurrentSession();
		
		try {
			employeedata employee1= new employeedata("Aayush", "Kumar", "TCS");
			employeedata employee2= new employeedata("Rati", "Jha", "Oracle");
			employeedata employee3= new employeedata("Ankita", "Jana", "TCS");
			employeedata employee4= new employeedata("Simmy", "Jha", "Narayana");
			
			session.beginTransaction();
			session.save(employee1);
			session.save(employee2); 
			session.save(employee3);
			session.save(employee4);
			
			
					
					
			session.getTransaction().commit();
		}
		
		finally {
			factory.close();
		}
		
	}

}
