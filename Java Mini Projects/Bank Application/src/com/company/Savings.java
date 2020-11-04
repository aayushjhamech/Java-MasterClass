package com.company;

public class Savings extends Account{
    private int safetyDepositNumber;
    private int safetyPin;

    public Savings(String name, String socialSN, double initDeposit){
        super(name, socialSN, initDeposit);
        accntNumber= "1"+super.accntNumber;
//        System.out.println("Account Number: "+accntNumber);
        setSafeDepositBox();
    }

    public void setRate() {
         rate= setBaserate()- 0.25;
    }

    public void setSafeDepositBox() {
        safetyDepositNumber= (int) (Math.random()*Math.pow(10,3));
        safetyPin= (int) (Math.random()*Math.pow(10,4));
//        String safeSet= "0123456789";
//        char[] safeThree= new char[3];
//        for(int i=0; i<safeThree.length;i++){
//            int rand= (int)(Math.random()*safeSet.length());
//            safeThree[i]=safeSet.charAt(rand);
//        }
//        String safeId= new String(safeThree);
//
//
//        String passSet= "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%";
//        char[] anotherSafeThree= new char[4];
//        for(int i=0; i<anotherSafeThree.length;i++){
//            int rand= (int)(Math.random()*passSet.length());
//            anotherSafeThree[i]=passSet.charAt(rand);
//        }
//        String safePass= new String(anotherSafeThree);

//        System.out.println("Your Safe Deposit id and Pass are: "+safetyDepositNumber+" "+safetyPin);
    }

    public void showInfo(){
        super.showInfo();
        System.out.println("Account type: Savings");
        System.out.println("Features: \n"+
                            "Safety Deposit Box ID: "+this.safetyDepositNumber+
                            "\nSafety Deposit Box PIN: "+this.safetyPin);
    }



}
