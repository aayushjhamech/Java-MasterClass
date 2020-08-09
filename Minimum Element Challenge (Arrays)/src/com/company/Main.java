package com.company;

import java.util.Scanner;

public class Main {
    Scanner sc= new Scanner(System.in);

    public static void main(String[] args) {

    }

    public static int[] readIntegers(int count){
        Scanner sc= new Scanner(System.in);
        int[] x= new int[count];
        System.out.println("Enter the integers:");
        for(int i=0; i<count; i++){
            x[i]= sc.nextInt();
        }

        return x;
    }
}
