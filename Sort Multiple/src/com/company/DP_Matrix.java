package com.company;
import java.sql.SQLOutput;
import java.util.*;
public class DP_Matrix {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int m= sc.nextInt();
        int n= sc.nextInt();
        int[][] matrix= new int[m][n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                matrix[i][j]= sc.nextInt();
            }
        }

        int max= maxSubMatrix(matrix, m, n);
        System.out.println(max);
    }

    static int maxSubMatrix(int[][] matrix, int m, int n) {
        int[][] testMatrix= new int[m][n];

        for(int i=0; i<m; i++){
            testMatrix[0][i]= matrix[0][i];
        }

        for(int i=0; i<n; i++){
            testMatrix[i][0]= matrix[i][0];
        }

        //check for other cells
        //if ==1

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j]==1){
                    testMatrix[i][j]= Math.min(testMatrix[i-1][j-1],Math.min(testMatrix[i][j-1], testMatrix[i-1][j])) + 1;
                }
                else{
                    testMatrix[i][j]= 0;
                }
            }
        }

        int maxSize=0;
        for(int i=0; i<m; i++) {
            for (int j = 0; j < n; j++) {
                    if(testMatrix[i][j]>maxSize){
                        maxSize= testMatrix[i][j];
                    }
            }
        }

        return maxSize;
    }
}
