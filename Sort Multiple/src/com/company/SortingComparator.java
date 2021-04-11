package com.company;
import java.util.*;
import java.lang.*;

public class SortingComparator implements Comparator<Student>{
    @Override
    public int compare(Student s1, Student s2) {
        int nameCompare= s1.getName().compareTo(s2.getName());
        int ageCompare= s1.getAge()-s2.getAge();

        if(nameCompare==0){
            return ((ageCompare==0? nameCompare:ageCompare));
        }
        else
            return nameCompare;
    }
}
