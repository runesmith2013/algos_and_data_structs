package com.rob.datastruct;

import java.util.EmptyStackException;

public class Stack<T> {

    private int size;

    private static class StackNode<T> {

        private T data;
        private StackNode<T> next;

        public StackNode(T data) {
            this.data = data;
        }
    }


    private StackNode<T> top;

    public T pop() {
        if (top == null) throw new EmptyStackException();
        T item = top.data;

        top = top.next;
        size --;
        return item;
    }


    public void push(T item) {
        StackNode<T> t = new StackNode<T>(item);
        t.next = top;
        top = t;
        size ++;
    }

    public T peek() {
        if (top == null) return null;
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return size;
    }

}
