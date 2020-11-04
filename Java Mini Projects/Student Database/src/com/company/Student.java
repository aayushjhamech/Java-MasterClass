package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private String year;
    private int numNewStudents;
    private String uniqueId;
    private int eachCourseCost= 600;
    private String courses= null;
    private int balance=0;
    private int id= 1000;

    public Student() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter First and Last Name: ");
        this.firstName = sc.nextLine();
        this.lastName = sc.next();
        System.out.println("Enter year:\n1- First\n 2- Second \n3- Third");
        this.year = sc.next();
        System.out.println("Your unique Id is: "+setUniqueId(year));
    }

    public String setUniqueId(String year){
        id++;
        return year+id;
    }

    public void enroll() {
        do{
        System.out.println("Enter courses to enroll from below list (Q to quit):\n 1) History 101 \n2) Mathematics 101 " +
                "\n3)English 101 \n4)Chemistry 101 \n5)Computer Science 101");
        Scanner sc = new Scanner(System.in);
        String course = sc.nextLine();
        if (!course.equals("Q")) {
            courses = courses + "\n" + course;
            balance += eachCourseCost;
        }
        else{
            System.out.println("Completed");
            break;
        }
    }while(1!=0);
        System.out.println("Enrolled in: "+courses);
        System.out.println("Tuition balance: "+balance);
    }

    public void showBalance(){
        System.out.println("Your Balance is: "+balance);
    }

    public void payment(){
        Scanner sc= new Scanner(System.in);
        int payment= sc.nextInt();
        balance= balance-payment;
        System.out.println("Your payment was accepted");
        showBalance();
    }
}
