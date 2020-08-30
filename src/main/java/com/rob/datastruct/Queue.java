package com.rob.datastruct;

import java.util.NoSuchElementException;

/**
 * Often implemented as linked list, as long as items can be added and removed from opposite sides
 */
public class Queue<T> {

    private static class QueueNode<T> {
        private T data;
        private QueueNode<T> next;

        public QueueNode(T data) {
            this.data = data;
        }
    }

    private QueueNode<T> first;
    private QueueNode<T> last;

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

    public T remove() {
        if (first == null) throw new NoSuchElementException();
        T data = first.data;
        first = first.next;
        if (first == null) {
            last = null;
        }
        return data;

    }

    public T peek() {
        if (first == null) throw new NoSuchElementException();
        return first.data;
    }

    public boolean isEmpty() {
        return first == null;
    }



}
