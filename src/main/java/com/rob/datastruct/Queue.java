package com.rob.datastruct;

import java.util.NoSuchElementException;

/**
 * Queues are FIFO structures, first in first out
 *
 *
 * Often implemented as linked list, as long as items can be added and removed from opposite sides
 */
public class Queue<T> {

    //-- node class
    private static class QueueNode<T> {
        private T data;
        private QueueNode<T> next;

        public QueueNode(T data) {
            this.data = data;
        }

        public String toString() {
            StringBuffer out = new StringBuffer(data+"");
            if (next!= null) {
                out.append(next+",");
            }

            return out.toString();
        }
    }

    //-- reference to first and last nodes
    private QueueNode<T> first;
    private QueueNode<T> last;


    //-- add to the back of the queue
    public void add(T item) {
        QueueNode<T> node = new QueueNode<T>(item);
        if (last != null) {
            last.next = node;
        }
        last = node;

        if (first == null) {
            first = last;
        }

    }

    //-- remove from the front of the queue
    public T remove() {
        if (first == null) throw new NoSuchElementException();
        T data = first.data;
        first = first.next;
        if (first == null) {
            last = null;
        }
        return data;

    }


    //-- print out the first node
    public T peek() {
        if (first == null) throw new NoSuchElementException();
        return first.data;
    }

    public boolean isEmpty() {
        return first == null;
    }



    public String toString() {
        return first.toString();
    }

}
