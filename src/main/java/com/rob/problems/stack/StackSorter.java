package com.rob.problems.stack;

import com.rob.datastruct.Stack;

public class StackSorter {



    static void sort(Stack<Integer> s) {
        Stack<Integer> r = new Stack<>();

        while (!s.isEmpty()) {
             int tmp = s.pop();
             while (!r.isEmpty() && r.peek() > tmp) {
                 s.push(r.pop());
             }
             r.push(tmp);
        }
        while (!r.isEmpty()) {
            s.push(r.pop());
        }
    }


    public static void main(String[] args) {
         Stack<Integer> stackOne = new Stack<>();
          stackOne.push(5);
          stackOne.push(3);
          stackOne.push(8);
          stackOne.push(2);
          stackOne.push(7);

          sort(stackOne);


    }



}
