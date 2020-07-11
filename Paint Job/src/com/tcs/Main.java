package com.tcs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double width= sc.nextDouble();
        double height= sc.nextDouble();
        double areaPerBucket= sc.nextDouble();
        double extraBuckets= sc.nextDouble();
        double area= sc.nextDouble();
        int res= getBucketCount(width, height, areaPerBucket, extraBuckets);
        int res1= getBucketCount(width, height, areaPerBucket);
        int res2= getBucketCount(area ,areaPerBucket);
        int r
    }

    private static int getBucketCount(double area, double areaPerBucket) {
        return ;
    }

    private static int getBucketCount(double width, double height, double areaPerBucket) {
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, double extraBuckets) {
    }
}
