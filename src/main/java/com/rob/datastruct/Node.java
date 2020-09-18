package com.rob.datastruct;


public class Node <T>{

    public Node next = null;
    T data;

    public Node(T d) {
        this.data = d;
    }

    public T getData() {
        return data;
    }

    public void appendToTail(T d) {
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
