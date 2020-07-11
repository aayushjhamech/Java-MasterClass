package com.tcs;

public class Main {

    public static void main(String[] args) {
        boolean res= isPalindrome(122);
        System.out.println(res);
    }

    public static boolean isPalindrome(int number){
            if(number < 0) {
                number *= -1;
            }

            int original = number;
            int reverse = 0;

            while(number != 0) {
                int lastDigit = number % 10;
                reverse += lastDigit;
                number /= 10;

                if(number != 0) {
                    reverse *= 10;
                }
            }

            return (original == reverse);
        }
}
