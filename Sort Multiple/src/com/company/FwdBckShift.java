package com.company;
import java.util.*;
public class FwdBckShift {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.next();

        String strBkd= bkdShift(str);
        String strFwd= fwdShift(str);


        if(strFwd.equals(strBkd)){
            System.out.println(1);
        }
        else
            System.out.println(0);

    }

    private static String bkdShift(String str) {
        System.out.println(str.substring(0, 1));
        System.out.println(str.substring(1,str.length()));
        System.out.println(str.substring(1,str.length()).concat(str.substring(0, 1)));
        return (str.substring(1,str.length()).concat(str.substring(0, 1)));// abcdef -> bcdefa
    }

    private static String fwdShift(String str) {
        String s1= str.substring(0, str.length()-1);
        String s2= str.substring(str.length()-1, str.length());
        System.out.println(s2.concat(s1));
        return (s2.concat(s1));// abcdef -> fabcde
    }


}
