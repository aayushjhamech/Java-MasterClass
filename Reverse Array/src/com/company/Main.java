package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count=sc.nextInt();
        int[] x= getInteger(count);
    }

    public static int[] getInteger(int count){
        Scanner sc= new Scanner(System.in);
        int[] x= new int[count];
        for(int i=0; i<count; i++){
            x[i]= sc.nextInt();
        }

        for(int i=0; i<count; i++){
            System.out.println(x[i]);
        }

        return x;

    }

    public static void reverse(int[] x){

    }


}

