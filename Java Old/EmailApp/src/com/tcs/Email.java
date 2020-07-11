package com.tcs;

import java.util.Scanner;

public class Email 
{
	private String firstName;
	private String lastName;
	private String password;
	private String email;
	private int mailboxCapacity= 500;
	private String department;
	private String altemail;
	private int passLength= 10;
	private String suffix= "tcs.com";
	
	//COnstructor for last and first name
	
	public Email(String firstName, String lastName)
	{
		super();
		this.firstName= firstName;
		this.lastName= lastName;
		System.out.println("Email Created:" +this.firstName+" "+this.lastName);
		
		this.department= setDepartment();
		System.out.println("Department:" +this.department);
		
		this.password= setRandomPass(passLength);
		System.out.println("Default Pass:" +this.password);
		
		email= firstName.toLowerCase()+ "." +lastName.toLowerCase()+ "@" + department.toLowerCase()+ "." +suffix;
		
	}
	
	//generate random password
	
	private String setRandomPass(int length) 
	{
		String str= "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@#$&!";
		char[] password= new char[length];
		for(int i=0; i<length; i++)
		{
			int rand= (int) (Math.random() * str.length());
			password[i]= str.charAt(rand);
		}
		return new String(password);
	}
	
	
	//ask department
	
	private String setDepartment()
	{
		System.out.print("Enter \n1 for Sales;\n 2 for Development;\n 3 for Accoumting");
		Scanner sc= new Scanner(System.in);
		int depChoice= sc.nextInt();
		if(depChoice == 1)
		{
			return "Sales";
		}
		else if(depChoice== 2)
		{
			return "Development";
		}
		else if(depChoice== 3)
		{
			return "Accounting";
		}
		else
		{
			return "";
		}
		
	}

	public int getMailboxCapacity() {
		return mailboxCapacity;
	}

	public void setMailboxCapacity(int mailboxCapacity) {
		this.mailboxCapacity = mailboxCapacity;
	}

	public String getAltemail() {
		return altemail;
	}

	public void setAltemail(String altemail) {
		this.altemail = altemail;
	}
	
	//set mailbox capacity
	
	public void changePass(String password)
	{
		this.password= password;
	}
	
	public String showInfo()
	{
		return "Display Name:" +firstName+ " "+lastName+
				"\nEmail is:"+email
				+ "\nMail Box Capacity is:" +mailboxCapacity;
		
	}
}
