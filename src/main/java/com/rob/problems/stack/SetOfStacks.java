package com.rob.problems.stack;

import com.rob.datastruct.Stack;

import java.util.ArrayList;
import java.util.List;

public class SetOfStacks {

    private List<Stack> stacks = new ArrayList<>();
    private int stackCapacity = 5;

    public SetOfStacks() {
        stacks = new ArrayList<>();
        Stack<String> initial = new Stack<>();
        stacks.add(initial);
    }

    public String pop() {
       Stack<String> currentStack = stacks.get(stacks.size()-1);
       if (currentStack.isEmpty()) {
           stacks.remove(currentStack);
           currentStack = stacks.get(stacks.size()-1);
       }
       return currentStack.pop();

    }


    public void push(String item) {
      //-- get current stack
        Stack currentStack = stacks.get(stacks.size()-1);
        if (currentStack.size() > stackCapacity){
            Stack<String> newStack = new Stack<>();
            stacks.add(newStack);
            currentStack = newStack;
        }
        currentStack.push(item);
    }


    public static void main(String[] args) {
        SetOfStacks stacks = new SetOfStacks();
        for (int i = 0 ; i < 23; i++) {
            stacks.push("Hello "+ i);
        }
        for (int i = 0 ; i < 23; i++) {
            System.out.println(stacks.pop());
        }

    }



}
