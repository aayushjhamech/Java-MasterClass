package com.company;
import java.util.*;

public class ReverseLinkedEveryK {
}

class DupLinkedList{

    static Node head;
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data= data;
            next= null;
        }
    }

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        DupLinkedList dpList= new DupLinkedList();
        dpList.push(5);
        dpList.push(7);
        dpList.push(15);
        dpList.push(82);
        dpList.push(28);
        dpList.push(42);

        int k= sc.nextInt();
        dpList.printList();
        dpList.head=reverseEveryK(head, k);
        dpList.printList();

    }

    private static Node reverseEveryK(Node head, int k) {
        if(head == null)
            return null;

        Node prev= null;
        Node curr= head;
        Node next= null;
        int i=0;
        while(i<k && curr!= null){
            next= curr.next;
            curr.next= prev;
            prev= curr;
            curr= next;
            i++;
        }

        if (next != null)
            head.next = reverseEveryK(next, k);

        return prev;

    }

    public void push(int new_data)
    {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }

    void printList() {

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
