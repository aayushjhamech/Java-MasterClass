package com.company;
import java.util.*;

public class Main {


    public static void main(String[] args) {
	// write your code here
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= Solution.getIntegers(n);
        Solution.printArray(arr);
        System.out.println("\n");
        int[] sorted= Solution.sortArray(arr);
        Solution.printArray(arr);
    }

}
