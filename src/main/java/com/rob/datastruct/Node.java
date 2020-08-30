package com.rob.datastruct;


public class Node {

    public Node next = null;
    int data;

    public Node(int d) {
        this.data = d;
    }

    public void appendToTail(int d) {
        Node end = new Node (d);
        Node n = this;

        //-- step over list until the end
        while (n.next != null) {
            n = n.next;
        }

        //-- add pointer to end
        n.next = end;
    }


    public void print() {
        Node n = this;
        System.out.println(n.data);

        //-- step over list until the end
        while (n.next != null) {

            n = n.next;
            System.out.println(n.data);
        }


    }

}
