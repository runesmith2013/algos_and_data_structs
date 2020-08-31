package com.rob.datastruct.tree.heap;

import org.junit.Test;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TestMinHeap {


    @Test
    public void testMinHeap() {
        MinHeap minHeap = new MinHeap(15);

        minHeap.insert(5);
        minHeap.insert(3);
        minHeap.insert(17);
        minHeap.insert(10);
        minHeap.insert(84);
        minHeap.insert(19);
        minHeap.insert(6);
        minHeap.insert(65);
        minHeap.insert(22);
        minHeap.insert(9);

        minHeap.minHeap();

        minHeap.print();

        System.out.println("Min value is "+ minHeap.removeMinElement());
        System.out.println("Min value is "+ minHeap.removeMinElement());
        System.out.println("Min value is "+ minHeap.removeMinElement());
        System.out.println("Min value is "+ minHeap.removeMinElement());


    }


    /**
     * Java uses PriorityQueue to implement a min heap
     */
    @Test
    public void testPriorityQueue() {

        PriorityQueue<Integer> pQueue = new PriorityQueue<>();
        pQueue.add(10);
        pQueue.add(30);
        pQueue.add(20);
        pQueue.add(100);

        //-- top priority element
        System.out.println("Head value: "+ pQueue.peek());

        //-- print all elements
        System.out.println("The queue elements");
        Iterator<Integer> iterator = pQueue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Removing the top priority element (or head) and
        // printing the modified pQueue using poll()
        pQueue.poll();
        System.out.println("After removing an element "
                + "with poll function:");
        Iterator<Integer> itr2 = pQueue.iterator();
        while (itr2.hasNext())
            System.out.println(itr2.next());

        // Removing 30 using remove()
        pQueue.remove(30);
        System.out.println("after removing 30 with"
                + " remove function:");
        Iterator<Integer> itr3 = pQueue.iterator();
        while (itr3.hasNext())
            System.out.println(itr3.next());

        // Check if an element is present using contains()
        boolean b = pQueue.contains(20);
        System.out.println("Priority queue contains 20 "
                + "or not?: " + b);

        // Getting objects from the queue using toArray()
        // in an array and print the array
        Object[] arr = pQueue.toArray();
        System.out.println("Value in array: ");
        for (int i = 0; i < arr.length; i++)
            System.out.println("Value: " + arr[i].toString());
    }





}
