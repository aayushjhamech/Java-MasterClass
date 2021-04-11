package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List list= new ArrayList<>();
        Student obj1 = new Student("Ajay", 27);
        Student obj2 = new Student("Sneha", 23);
        Student obj3 = new Student("Simran", 37);
        Student obj4 = new Student("Ajay", 22);
        Student obj5 = new Student("Ajay", 29);
        Student obj6 = new Student("Sneha", 22);

        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        list.add(obj4);
        list.add(obj5);
        list.add(obj6);

        //Iteration using an iterator before Sorting
        Iterator<Student> custIterator= list.iterator();

        while(custIterator.hasNext()){
            System.out.println(custIterator.next());
        }

        System.out.println("\n");
        Collections.sort(list, new SortingComparator());

        for(int i=0; i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
