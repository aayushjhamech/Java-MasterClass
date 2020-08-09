package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:" );
        int number= sc.nextInt();
        int[] y= getIntegers(number);
        printIntegers(y);
        int[] z= sortIntegers(y);
        for(int i=0;  i<z.length; i++){
            System.out.println("\n The #"+i+"= "+z[i]);
        }

    }

    public static int[] getIntegers(int number){
        Scanner sc= new Scanner(System.in);
        int[] x= new int[number];
        System.out.println("Enter the integers:");
        for(int i=0; i<number; i++){
            x[i]= sc.nextInt();
        }

        return x;
    }

    public static void printIntegers(int[] x){
        for(int i=0;  i<x.length; i++){
            System.out.println("The #"+i+"= "+x[i]);
        }
    }


    public static int[] sortIntegers(int[] y){
        int[] temp= new int[y.length];
            for(int i=0; i<y.length; i++){
                for(int j=i+1; j<y.length; j++){
                    if(y[i]<y[j]){
                        temp[i]= y[i];
                        y[i]=y[j];
                        y[j]=temp[i];
                    }
                }
        }
            return y;
    }

}
