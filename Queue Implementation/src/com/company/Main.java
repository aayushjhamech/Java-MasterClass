package com.company;

public class Main {

    Node front= null;
    Node rear=null;

    public static void main(String[] args) {
	// write your code here
        Main list = new Main();
        list.enqueue(1);
        list.enqueue(7);
        list.enqueue(5);
        list.enqueue(3);
        printList(list);
    }

    public Main(){
        this.front= front;
        this.rear= rear;
    }



    void enqueue(int key){
        Node temp= new Node(key);
        if(this.rear==null){
            this.front=this.rear= temp;
            return;
        }
        this.rear.next=temp;
        this.rear= temp;
    }

    Node dequeue(){
        if(this.front==null)
            return null;

        Node temp= this.front;
        this.front=this.front.next;

        if(this.front==null)
            this.rear=null;
        return temp;
    }

    public static void printList(Main list){
        Node currentNode= list.front;
        System.out.println("The elements are: ");
        while(currentNode != null){
            System.out.println(currentNode.data+" ");
            currentNode= currentNode.next;
        }
    }

}
