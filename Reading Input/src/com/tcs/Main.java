package com.tcs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int sum=0;
        int counter= 0;
        //while(true)
        while (counter<10)
        {

            int order= counter+1;
            System.out.println("Enter number #" +order+ ":");
            boolean hasNextInt= sc.hasNextInt();
            if(hasNextInt)
            {
                int number= sc.nextInt();
                counter++;
                sum+= number;
            }
            else {
                System.out.println("Invalid Number");
            }
            sc.nextLine();

        }
            System.out.println("Sum= " +sum);

        sc.close();
    }

}
