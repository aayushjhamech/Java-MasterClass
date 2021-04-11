package com.company;
import java.util.*;

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        int[] a= new int[m];
        int[] b= new int[n];

        for(int i=0 ; i<m; i++){
            a[i]= sc.nextInt();
        }

        for(int i=0 ; i<n; i++){
            b[i]= sc.nextInt();
        }

        int[] res= new int[m+n];
        sortedMerge(a, b, res, m, n);

    }

    static void sortedMerge(int[] a, int[] b, int[] res, int m, int n) {
        Arrays.sort(a);
        Arrays.sort(b);

        int i=0, j=0, k=0;

        while(i<m && j<n){
            if(a[i]<=b[j]){
                res[k]= a[i];
                i++;
                k++;
            }
            else{
                res[k]= b[j];
                j++;
                k++;
            }
        }

        while(i<m){
            res[k]= a[i];
            i++;
            k++;
        }

        while(j<n){
            res[k]= b[j];
            j++;
            k++;
        }


        for(int q=0 ; q<(m+n); q++){
            System.out.println(res[q]);
        }
    }
}
