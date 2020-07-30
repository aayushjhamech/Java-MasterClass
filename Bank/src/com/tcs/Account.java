package com.tcs;

public class Account {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public Account(){
        this("dwjdoqnw", 520.51, "kdjwu", "jnwjnc", "+9562841");
    }

    //below constructor is major, has all initialisations and all other constructors call this one
    public Account(String accountNumber, double balance, String customerName, String email, String phoneNumber){
        this.accountNumber= accountNumber;
        this.balance= balance;
        this.customerName= customerName;
        this.email=  email;
        this.phoneNumber= phoneNumber;
    }

    public Account(String customerName, String email, String phoneNumber){
        this("sdwucjnec", 653.5, customerName, email, phoneNumber);//defaulted two values while we still call the main contructor to update the values.
    }



    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
    }

    public void withdraw(double withdrawAmount){

        if((this.balance- withdrawAmount) >0){
            this.balance= this.balance- withdrawAmount;
            System.out.println("Available : "+this.balance);
        }
        else{
            System.out.println("Only have "+this.balance+" available.");
        }

    }
}
