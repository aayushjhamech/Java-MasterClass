package com.tcs;
import java.util.*;

public class Solution {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the 2 numbers:");
		double a= sc.nextDouble();
		double b= sc.nextDouble();
		System.out.println("Enter operation as add, sub, mult, div:");
		String str= sc.nextLine(); sc.next();
		
		double result = operationDone(a, b, str);
		System.out.println(result);
	}

	private static double operationDone(double a, double b, String str) 
	{
		double result = 0;
		if(str.startsWith("add"))
		{
			result= a+b;
		}
		
		else if(str.startsWith("sub"))
		{	
			result= a-b;	
		}
		
		else if(str.startsWith("mult"))
		{
			result= a*b;	
		}
		
		else if(str.startsWith("div"))
		{
			result= a/b;
		}
		
		return result;
	}

}
