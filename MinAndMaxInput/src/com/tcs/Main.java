package com.tcs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int max= 0;
        int min= 0;
        boolean first= true;
        while(true)
        {
            System.out.println("Enter the number:");
            boolean isInt = sc.hasNextInt();
            if(isInt)
            {
                int number= sc.nextInt();
                if(first){
                    first =false;
                    max= number;
                    min= number;
                }
                if(number>max){
                    max= number;
                }
                else if(number<min){
                    min= number;
                }

            }
            else {
                break;
            }

            sc.nextLine();

        }
        sc.close();
        System.out.println("MAX: "+max+ " Min: "+min);
    }
}
