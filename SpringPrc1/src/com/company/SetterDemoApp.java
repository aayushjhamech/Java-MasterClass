package com.company;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		//load spring config file
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve bean from container
		
		CricketCoach theCoach= context.getBean("myCricketCoach", CricketCoach.class); 
		//call methods on bean
		
		
		context.close();

	}

}
