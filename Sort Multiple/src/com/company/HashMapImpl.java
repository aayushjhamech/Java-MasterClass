package com.company;
import java.util.*;

public class HashMapImpl {
    public static void main(String[] args) {
        HashMap<Integer, String> map= new HashMap<>();

        map.put(001, "Aayush");
        map.put(002, "Vishal");
        map.put(003, "Ankita");
        map.put(004, "Preety");

        System.out.println("Using for-each LOOP");
       for(Map.Entry hm: map.entrySet()){
           int key= (int)hm.getKey();
           String value= (String)hm.getValue();

           System.out.println(key+" "+ value);
       }

        System.out.println("Using for-each with Lambda METHOD");
        map.forEach((k, v)-> System.out.println(k+" "+v));
    }
}
