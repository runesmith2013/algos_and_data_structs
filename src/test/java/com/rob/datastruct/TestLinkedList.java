package com.rob.datastruct;

import org.junit.Test;

public class TestLinkedList {


    @Test
    public void testLinkedList() {
        Node head = new Node(0);
        LinkedList<Integer> list = new LinkedList(head);

        list.appendToTail(1);
        list.appendToTail(100);
        list.appendToTail(1000);

        list.printList();
        list.deleteNode(10);

    }
}
