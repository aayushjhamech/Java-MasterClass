package com.company;

import java.util.Scanner;

public class Solution {

    public static int[] sortArray(int[] arr) {
        int temp=0;
        for(int i=0; i< arr.length;i++){
            for(int j=i+1; j< arr.length;j++){
                if(arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]= temp;
                }
            }
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        for(int i=0; i<arr.length; i++){
            System.out.println("Element "+i+" contents "+arr[i]);
        }
    }

    public static int[] getIntegers(int n) {
        Scanner sc= new Scanner(System.in);
        int[] x= new int[n];
        for(int i=0; i<n; i++){
            x[i]= sc.nextInt();
        }
        return x;
    }
}
