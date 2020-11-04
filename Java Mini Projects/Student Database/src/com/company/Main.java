package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc= new Scanner(System.in);
        System.out.println("Number of new students: ");
        int n= sc.nextInt();
        Student[] st= new Student[n];
        for(int i=0; i<n;i++){
            st[i]= new Student();
            st[i].enroll();
            st[i].payment();
        }
    }
}
