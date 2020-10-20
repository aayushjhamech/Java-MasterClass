package com.company;

//class MyTask extends Thread{
//    @Override
//    public void run(){
//        for(int i=0; i<=10; i++){
//            System.out.println("2nd Print: "+i);
//        }
//    }
//}

class CA{

}


class MyTask extends CA implements Runnable{
    @Override
    public void run(){
        for(int i=0; i<=10; i++){
            System.out.println("2nd Print: "+i);
        }
    }
}


public class Main {
    //main method is main thread
    public static void main(String[] args) {
	// write your code here
        //whatever we write here will be executed
        //by main method in a sequence
        System.out.println("=====App Start=====");

//        MyTask task= new MyTask();//Child Thread/Worker Thread
//        task.start();//internally calls run()

        Runnable r= new MyTask();
        Thread task =new Thread(r);//polymorphic statement
        task.setDaemon(true);
        task.start();

//      Thread task= new Thread(new MyTask());
//      same as above
        for(int i=0; i<=10; i++){
            System.out.println(i);
        }
        //running this AppENd comes first and then MyTask is executed
        //Edureka says-> Both tasks(main and MyTask) run parallely and executing the program yields
        //different o/p at different times.

        System.out.println("=====App End=====");
    }
}

