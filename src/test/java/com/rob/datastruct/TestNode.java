package com.rob.datastruct;

import org.junit.Test;

public class TestNode {


    @Test
    public void testAppend() {
        Node n = new Node(1);
        n.appendToTail(2);
        n.appendToTail(3);

        for (int i = 0 ; i< 100; i++) {
            n.appendToTail(i);
        }
        n.print();

    }

}
