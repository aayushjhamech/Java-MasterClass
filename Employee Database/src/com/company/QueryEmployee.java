package com.company;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.aayush.employeedata;

public class QueryEmployee {

	public static void main(String[] args) {
		
		SessionFactory factory= new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(employeedata.class).buildSessionFactory();
		
		Session session= factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			
			List<employeedata> theEmpList= session.createQuery("from employeedata e where e.id= '1' ").getResultList();
			displayEmployee(theEmpList);
			
			theEmpList= session.createQuery("from employeedata e where e.company= 'TCS' ").getResultList();
			displayEmployee(theEmpList);
					
					
			session.getTransaction().commit();
			System.out.println("Done");
		}
		
		finally {
			factory.close();
		}
		
	}
	
	
	
	
	
	private static void displayEmployee(List<employeedata> theEmployeeData) {
		for(employeedata employee: theEmployeeData) {
			System.out.println(employee);
		}
	}

}
