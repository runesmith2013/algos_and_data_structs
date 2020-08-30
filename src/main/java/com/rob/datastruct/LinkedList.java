package com.rob.datastruct;

public class LinkedList {

    private Node head;


    public LinkedList(Node head) {
        this.head = head;

    }

    public Node getHead() {
        return head;
    }

    public void appendToTail(int data) {
        head.appendToTail(data);
    }

    public void printList() {
        head.print();
    }

    public void deleteNode(int data) {

        Node n = head;

        if (n.data == data) {
            head = head.next;
            return;
        }

        while (n.next != null) {
            if (n.next.data == data) {
                n.next = n.next.next;
                return;
            }
            n = n.next;
        }

    }


}
