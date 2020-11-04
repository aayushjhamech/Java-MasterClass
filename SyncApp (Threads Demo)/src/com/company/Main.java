package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("=========Application Started=========");

        Printer printer= new Printer();
        printer.printDoc(10, "Aayush.pdf");

        MyThread mRef= new MyThread(printer);
        mRef.start();


        System.out.println("=========Application Ended=========");
    }
}

class MyThread extends Thread{
    Printer pRef;

    MyThread(Printer p){
        pRef=p;
    }

    @Override
    public void run() {
        pRef.printDoc(10, "Aayush1.pdf");
    }
}

class Printer{
    void printDoc(int num, String docName){
        for(int i=0; i<num; i++){
            System.out.println("Print"+docName+" "+i);
        }
    }
}
