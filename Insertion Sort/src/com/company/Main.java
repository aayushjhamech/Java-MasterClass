package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc= new Scanner(System.in);
        int[] intArray= new int[10];
        for(int i=0; i<intArray.length; i++){
            intArray[i]= sc.nextInt();
        }


        for(int firstUnsortedIndex= 1; firstUnsortedIndex<intArray.length; firstUnsortedIndex++){
            int newElement= intArray[firstUnsortedIndex];
            int i;
            for(i= firstUnsortedIndex; i>0 && intArray[i-1]>newElement; i--){
                intArray[i]= intArray[i-1];
            }
            intArray[i]= newElement;
        }

        for(int i=0; i<intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }
}
