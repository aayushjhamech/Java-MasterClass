package com.company;

public class Checking extends Account{
    long debitCardNumber;
    int debitPin;

    public Checking(String name, String socialSN, double initDeposit){
        super(name, socialSN, initDeposit);
        accntNumber= "2"+super.accntNumber;
//        System.out.println("Account Number: "+accntNumber);
        setDebitCard();
    }

    @Override
    public void setRate() {
        rate= setBaserate()*0.15;
    }


    private void setDebitCard(){
        debitCardNumber= (long) (Math.random()*Math.pow(10,12));
        debitPin= (int) (Math.random()*Math.pow(10,4));
    }

    public void showInfo(){
        super.showInfo();
        System.out.println("Account type: Checking");
        System.out.println("Features: \n"+
                "Debit Card Number: "+this.debitCardNumber+
                "\nDebit Card PIN: "+this.debitPin);
    }
}
