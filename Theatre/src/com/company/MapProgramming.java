package com.company;

import java.util.HashMap;
import java.util.Map;

public class MapProgramming {

    public static void main(String[] args) {
        Map<String, String> languages= new HashMap<>();
        languages.put("Java", "Just a try");
        languages.put("Python", "Another try");
        languages.put("C", "Yet another try");
        languages.put("C#", "And another");
        //can not move put inside to sout
        //will give null

        if(languages.containsKey("Java")){
            System.out.println("Java is present");
        }else{
            languages.put("Java", "Just a try");
        }
        //can use putifAbsent


        System.out.println(languages.get("Java"));
        //key of course is unique
        System.out.println(languages.put("Java", "Failed Try"));
        //statement will print the pre-existing value of that key
        languages.put("Java", "Failed Try");
        //no error but the value associated is overwritten
        System.out.println(languages.get("Java"));


    }
}
