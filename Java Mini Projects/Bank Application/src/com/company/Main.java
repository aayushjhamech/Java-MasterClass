package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Account> accounts= new LinkedList<Account>();
        String file= "E:\\Java Projects\\Bank Application\\NewBankAccounts.csv";

//        Checking cck1= new Checking("Aayush", "84219177", 50000);
//        Savings ssk1= new Savings("Simmy", "65648154", 2500);
//
//        cck1.showInfo();
//        System.out.println("--------------------");
//        ssk1.showInfo();

        List<String[]>  newCustomers= utilities.CSV.read(file);
        for(String[] accountHolder: newCustomers){
            String name= accountHolder[0];
            String sSN= accountHolder[1];
            String accountType= accountHolder[2];
            double initDeposit= Double.parseDouble(accountHolder[3]);
            if(accountType.equals("Savings")){
                accounts.add(new Savings(name, sSN, initDeposit));
            }
            else if(accountType.equals("Checking")){
                accounts.add(new Checking(name, sSN, initDeposit));
            }
            else{
                System.out.println("Error: Incorrect Account Type");
            }
        }
        accounts.get(5).showInfo();
        for(Account acc : accounts){
            System.out.println("********************");
            acc.showInfo();
        }
    }

}
