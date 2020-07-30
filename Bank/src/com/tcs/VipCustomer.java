package com.tcs;

public class VipCustomer {

    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer(String name, double creditLimit, String email){
        this.name= name;
        this.creditLimit= creditLimit;
        this.email= email;
    }

    public VipCustomer(){
        this("Default", 5845492, "Aayush@gmail.com");
    }

    public VipCustomer(String name, double creditLimit){
        this(name, creditLimit, "Aayush@gmail.com");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
