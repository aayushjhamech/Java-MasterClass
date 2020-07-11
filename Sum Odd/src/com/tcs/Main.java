package com.tcs;

public class Main {

    public static void main(String[] args) {
	int res;
	res= sumOdd(5, 100);
        System.out.println(res);
    }
    public static boolean isOdd(int number){
        if((number%2==1) & number>0)
            return true;
        else
            return false;
    }

    public static int sumOdd(int start, int end){
        int sum=0;
        if(start> 0 && start<=end ){
            for(int i=start; i<=end; i++)
            {
                if(isOdd(i)){
                    sum += i;
                }
            }
            return sum;
        }
        else
        return -1;

    }
}
