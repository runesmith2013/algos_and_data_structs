package com.rob.datastruct;

public class LinkedList<T> {

    private Node head;


    public LinkedList(Node head) {
        this.head = head;

    }

    public LinkedList(T data) {
        this.head = new Node(data);

    }



    public Node getHead() {
        return head;
    }

    public void appendToTail(T data) {
        head.appendToTail(data);
    }

    public void printList() {
        head.print();
    }

    public void deleteNode(T data) {

        Node n = head;

        if (n.data.equals(data)) {
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
