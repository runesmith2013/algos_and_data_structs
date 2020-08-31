package com.rob.datastruct.tree.heap;

import org.junit.Test;

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

}
