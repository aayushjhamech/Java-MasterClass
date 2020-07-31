package com.tcs;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        if(this.age>100 || this.age<0){
            return 0;
        }
        else{
            return age;
        }
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isTeen(){
        if(this.age> 12 && this.age< 20){
            return true;
        }
        else{
            return false;
        }
    }

    public String getFullName(){
        if (firstName== null){
            return lastName;
        }
        else if(lastName == null){
            return firstName;
        }
        else{
            return firstName+" "+lastName;
        }
    }
}
