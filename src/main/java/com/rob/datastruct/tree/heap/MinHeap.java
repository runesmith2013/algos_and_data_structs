package com.rob.datastruct.tree.heap;


import com.rob.datastruct.tree.binary.BinaryNode;

/**
 * - complete binary tree (totally filled aside from rightmost elements on last level)
 * - each node is smaller than its children
 * - root is therefore the minimum element in the heap (heap property)
 *- typically represented as an array
 *
 * heap size is log n
 * heaps are used for priority queues
 * heaps are useful for k-th element questions
 *
 *
 */
public class MinHeap {

    private int[] heap;
    private int size;
    private int maxSize;

    private static final int FRONT = 1;


    public MinHeap(int maxSize) {
        this.maxSize = maxSize;
        this.size = 0;
        heap = new int[this.maxSize +1];
        heap[0] = Integer.MIN_VALUE;
    }


    /**
     * parent of a node is n/2
     * @param pos
     * @return
     */
    private int parent(int pos) {
        return pos / 2;
    }

    /**
     * left child is 2 * pos
     *
     * @param pos
     * @return
     */
    private int leftChild(int pos) {
       return (2 * pos);
    }


    /**
     * rightchild is adjacent to left child
     * @param pos
     * @return
     */
    private int rightChild(int pos) {
        return (2*pos) +1 ;
    }

    /**
     * True if node is a lead (has no children)
     * @param pos
     * @return
     */
    private boolean isLeaf(int pos) {

        //-- if pos is in the second half of the array
        if (pos >= (size /2) && pos <= size) {
            return true;
        }
        return false;
    }

    /**
     * Swap two nodes in the heap, using temp storage
     * @param fpos
     * @param spos
     */
    private void swap(int fpos, int spos) {
        int tmp;

        tmp = heap[fpos];
        heap[fpos] = heap[spos];
        heap[spos] = tmp;
    }

    /**
     * Heapify the node at pos
     * @param pos
     */
    private void heapify(int pos) {

        //-- if the node is not a leaf and is greater than any of its children
            if (!isLeaf(pos)) {
                if (heap[pos] > heap[leftChild(pos)] || heap[pos] > heap[rightChild(pos)])  {

                    if (heap[leftChild(pos)] < heap[rightChild(pos)]) {
                        swap(pos, leftChild(pos));
                        heapify(leftChild(pos));

                    } else {
                       swap(pos, rightChild(pos));
                       heapify(rightChild(pos));
                    }
                }

            }
    }

    /**
     * inserts element at the last index in the array
     * @param element
     */
    public void insert(int element) {

        if (size >= maxSize) {
            return;
        }

        heap[++size] = element;
        int current = size;

        //-- fix the tree by swapping with parent until we can't anymore
        while(heap[current] < heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    public void print() {

        for (int i = 0; i < size /2 ; i++) {
            System.out.println("PARENT:" + heap[i]
                               + " LEFT CHILD "+ heap[2*i]
                                +" RIGHT CHILD "+ heap[2*i +1]);
            System.out.println();

        }
    }

    /**
     * Build a min heap using heapify
     */
    public void minHeap() {
        for (int pos = (size /2); pos >=1; pos --) {
            heapify(pos);
        }

    }


    /**
     * removes the root element and finds a new root
     */
    public int removeMinElement() {
        //-- remove head
        int popped = heap[FRONT];

        //-- swap last element in heap with root
        heap[FRONT] = heap[size--];

        //-- push down, swapping with one of its children until heap property restored
        heapify(FRONT);
        return popped;

    }




}
