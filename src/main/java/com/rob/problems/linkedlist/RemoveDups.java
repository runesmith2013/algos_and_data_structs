package com.rob.problems.linkedlist;

import java.util.LinkedHashSet;
import java.util.Set;
import com.rob.datastruct.LinkedList;
import com.rob.datastruct.Node;

public class RemoveDups {

    public static LinkedList<String> dedup(LinkedList<String> input) {
        Set<String> dupes = new LinkedHashSet<>();

        Node current  = input.getHead();

        while (current.next != null) {
            dupes.add((String)current.getData());
            current = current.next;
        }

        System.out.println("---");
        LinkedList<String> result = new LinkedList<>("S");
        dupes.stream().forEach(s-> result.appendToTail(s));

        return result;
    }

    public static void main(String[] args) {
        LinkedList<String> test1 = new LinkedList<String>("a");
        test1.appendToTail("a");
        test1.appendToTail("a");
        test1.appendToTail("b");
        test1.appendToTail("a");

        test1.printList();;

        LinkedList<String> output =  dedup(test1);

        output.printList();

    }

}
