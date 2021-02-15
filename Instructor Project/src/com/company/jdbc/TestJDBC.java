package com.company.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJDBC {

	public static void main(String[] args) {
		

		String jdbcUrl= "jdbc:mysql://localhost:3306/hb-01-one-to-one-uni?useSSL=false";
		String user= "hbstudent";
		String pass= "hbstudent";
		
		try {
			System.out.println("Connecting database: "+jdbcUrl);
			Connection myConn= DriverManager.getConnection(jdbcUrl, user, pass);
			
			System.out.println("Connected.");
			
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
 
	}

}



