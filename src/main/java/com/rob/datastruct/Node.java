package com.rob.datastruct;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Node {

    private Node next = null;
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

        //-- step over list until the end
        while (n.next != null) {
            System.out.println(n.data);
            n = n.next;
        }


    }

}
