package com.company;

public class ReverseLinked {

}

class LinkedList{
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            this.data=d;
            next= null;
        }
    }

    public static void main(String[] args) {
        LinkedList llist= new LinkedList();
        llist.head= new Node(52);
        llist.head.next= new Node(87);
        llist.head.next.next= new Node(86);
        llist.head.next.next.next= new Node(45);
        llist.head.next.next.next.next= new Node(54);
        
        llist.printList(head);
        head= llist.reverse(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        llist.printList(head);
    }


    //Iterate through the linked list. In loop, do following.
    //// Before changing next of current,
    //// store next node
    //next = curr->next
    //// Now change next of current
    ////This is where actual reversing happens
    //curr->next = prev
    //// Move prev and curr one step forward
    //prev = curr
    //curr = next
    private Node reverse(Node node) {
        Node prev= null;
        Node curr= head;
        Node next= null;

        while(curr!= null){
            next= curr.next;
            curr.next= prev;
            prev= curr;
            curr=next;
        }
        node= prev;
        return node;
    }

     void printList(Node node) {
         while (node != null) {
             System.out.print(node.data + " ");
             node = node.next;
         }
    }
}
