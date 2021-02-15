package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc= new Scanner(System.in);
        int  n= sc.nextInt();
        int a[]= {7,5,1};
        
        int dp[]=new int[n+1];
        Arrays.fill(dp, -1);
        dp[0]= 0;

        int ans= minCoins(n, a, dp);
        System.out.println(ans);
    }

    static int minCoins(int n, int a[], int dp[]){//n is for the amount we need to get
        //array a is to get the denominations
        if(n==0) return 0;

        int ans=Integer.MAX_VALUE;
        for(int i=0; i<a.length; i++){
            if(n- a[i]>=0) {
                int subAns=0;
                if(dp[n-a[i]] != -1){
                    subAns= dp[n-a[i]];
                }
                else{
                    subAns= minCoins(n-a[i], a, dp);
                }

                subAns= minCoins(n-a[i], a, dp);
                if(subAns!=Integer.MAX_VALUE && subAns+1<ans){
                    ans= subAns+1;
                }
            }
        }

        return dp[n]= ans;
    }
}
