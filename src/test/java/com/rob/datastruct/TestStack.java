package com.rob.datastruct;

import org.junit.Test;

public class TestStack {


    @Test
    public void testStack() {

        Stack<Integer> myStack = new Stack<Integer>();
        System.out.println(myStack.isEmpty());

        myStack.push(100);
        myStack.push(1);
        myStack.push(110);

        for (int i = 1; i< 100; i++) {
            myStack.push(i);
        }

        System.out.println(myStack.peek());

        while (!myStack.isEmpty()) {
            System.out.println(myStack.pop());
        }

    }

}
