package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc= new Scanner(System.in);
        int[] intArray= new int[10];
        for(int i=0; i<intArray.length; i++){
            intArray[i]= sc.nextInt();
        }

        for(int lastUnsortedindx= intArray.length-1; lastUnsortedindx>0; lastUnsortedindx--){
            for(int i=0; i<lastUnsortedindx; i++){
                if(intArray[i]>intArray[i+1]){// stable sort, unstable sort when >=
                    swap(intArray, i, i+1);
                }
            }
        }
    }

    public static void swap(int[] intArray, int i, int j){
        if(i==j){
            return;
        }
        int temp= intArray[i];
        intArray[i]= intArray[j];
        intArray[j]= temp;
    }
}
