package com.tcs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        inputThenPrintSumAndAverage();

    }
    public static void inputThenPrintSumAndAverage() {
        System.out.println("Enter the numbers:");
        Scanner sc = new Scanner(System.in);
        double sum1=0;
        int sum=0;
        long avg=0;
        int count=1;
        boolean first = true;

        while(true)
        {
            boolean isInt= sc.hasNextInt();
            if(isInt){
                double number= sc.nextDouble();
                sum1+=number;
                double avg1 = sum1 / count;
                avg= Math.round(avg1);
                count++;
                sum= (int)sum1;
            }
            else{
                break;
            }

            sc.nextLine();
        }

        System.out.println("Sum = "+sum+" AVG = "+avg);
        sc.close();
    }

}


