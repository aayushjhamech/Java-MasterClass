package com.tcs;

public class Main {

    public static void main(String[] args) {
        Account bobsAccount= new Account("151511515", 5000,"Bob", "bobaccount@gmail.com", "+91 8420880455");

        bobsAccount.withdraw(100);

        bobsAccount.deposit(5000);
        bobsAccount.withdraw(51);

        Account aayushAccount= new Account("kmcmw", "aayush@gmail.com", "8425154");

        VipCustomer anotherAcount= new VipCustomer();
        System.out.println(anotherAcount.getCreditLimit()+ " " +anotherAcount.getEmail()+ " " +anotherAcount.getName());

        VipCustomer onemoreAccount= new VipCustomer("Aayush", 526261);
        System.out.println(onemoreAccount.getCreditLimit()+ " " +onemoreAccount.getName()+ " " +onemoreAccount.getEmail());


    }
}
