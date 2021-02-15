package com.company;
import java.util.*;
public class FiboDP{

    public static void main(String []args){

        int n= 40;
        int lookup[]= new int[n+1];
        Arrays.fill(lookup, -1);
        int res= fib(n, lookup);
        System.out.println(res);
    }

    static int fib(int n, int lookup[]){
        if(lookup[n]==-1){
            if(n<=1)
                lookup[n]= n;
            else
                lookup[n]= fib(n-1, lookup)+fib(n-2, lookup);
        }

        return lookup[n];
    }
}