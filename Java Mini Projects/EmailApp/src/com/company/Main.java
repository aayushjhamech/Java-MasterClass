package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        EmailApp e1= new EmailApp("Aayush", "Kumar");
        e1.setMailCapacity(500);
        e1.setAltMail("aayushjhamech@gmail.com");
        System.out.println("Alterante Email: "+e1.getAltMail());
    }
}
