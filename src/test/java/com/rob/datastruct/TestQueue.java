package com.rob.datastruct;

import org.junit.Test;

public class TestQueue {

    @Test
    public void testQueue() {

        Queue<Integer> queue = new Queue<> ();
        queue.add(100);
        queue.add(200);
        System.out.println(queue.peek());



    }

}
