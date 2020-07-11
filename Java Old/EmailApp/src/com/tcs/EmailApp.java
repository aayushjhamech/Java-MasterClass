package com.tcs;

public class EmailApp {

	public static void main(String[] args) 
	{
		Email em1= new Email("Aayush", "Kumar");
		System.out.println(em1.showInfo());
		Email em2= new Email("John", "Smith");
		System.out.println(em2.showInfo());
		Email em3= new Email("Sarthak", "Kumar");
		System.out.println(em3.showInfo());
		Email em4= new Email("Vishal", "Kumar");
		System.out.println(em4.showInfo());
		
		
	}

}
