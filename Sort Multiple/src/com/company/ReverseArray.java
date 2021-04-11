package com.company;
import java.util.*;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=  new int[n];
        for(int i = 0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }
        int[] revArr= arrReverse(arr, 0, n-1);
        System.out.println("/nAfter reversing...");
        for(int i = 0; i<n; i++){
            System.out.print(revArr[i]+ " ");
        }
    }

    public static int[] arrReverse(int[] arr, int start, int end){
        int temp;
        while(start<end){
            temp= arr[start];
            arr[start]= arr[end];
            arr[end]= temp;
            start++;
            end--;
        }
        return arr;
    }
}
