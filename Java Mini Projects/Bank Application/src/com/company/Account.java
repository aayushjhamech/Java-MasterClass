package com.company;

import java.sql.SQLOutput;

public abstract class Account implements IBaseRate{

    private String name;
    private String socialSN;
    double balance;
    String accntNumber;
    protected static int uniqueFive= 10000;
    protected double rate;

    public Account(String name, String socialSN, double initDeposit){
        this.name= name;
        this.socialSN= socialSN;
        balance= initDeposit;
        accntNumber= setAccntNumber();
        setRate();
    }

    private String setAccntNumber(){
        String lastTwoSSN= socialSN.substring(socialSN.length()-2, socialSN.length());
        uniqueFive=uniqueFive+1;
        String unique= Integer.toString(uniqueFive);
        char[] threeRandom= new char[3];
        String passSet= "0123456789";
        for(int i=0; i<threeRandom.length;i++){
            int rand= (int)(Math.random()*passSet.length());
            threeRandom[i]=passSet.charAt(rand);
        }
        return lastTwoSSN+unique+(new String(threeRandom));
    }

    public abstract void setRate();

    public void withdraw(double withdraw){
        balance= balance-withdraw;
        System.out.println("Withdrawing: "+withdraw+" Now vailable: "+balance);
    }

    public void deposit(double deposit){
        balance= balance+deposit;
        System.out.println("Depositing: "+deposit+" Now vailable: "+balance);
    }

    public void compound(){
        double accuredInterest= balance*(rate/100);
        System.out.println("Accured Interest: "+accuredInterest);
    }


    public void transfer(String toWhere, double amount){
        System.out.println("Transfer successful");
        balance= balance-amount;
        System.out.println("Transferring: "+amount+" Now vailable: "+balance);
    }

    public void showInfo() {
        System.out.println("Name: " + name +
                "\nAccount number: " + accntNumber +
                "\nBalance: " + balance +
                "\n Rate: " + rate);

    }
}
