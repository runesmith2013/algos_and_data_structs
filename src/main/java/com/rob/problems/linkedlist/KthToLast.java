package com.rob.problems.linkedlist;

import com.rob.datastruct.LinkedList;
import com.rob.datastruct.Node;

import java.util.ArrayList;
import java.util.List;

public class KthToLast {


    public static String kthToLastArray(LinkedList<String> list, int k) {
        List<String> elements = new ArrayList<>();

        Node<String> current = list.getHead();
        elements.add(current.getData());
        while (current.next != null) {
            current = current.next;
            elements.add(current.getData());
        }

        return elements.get(elements.size() - k);
    }

        public static String kthToLastNaive(LinkedList<String> list, int k) {

        Node current = list.getHead();
        int count = 0;
      //  System.out.println(current.getData());
        while (current.next != null) {
            current = current.next;
            count ++;
           // System.out.println(current.getData());
        }
       // System.out.println(count);
        int position = count - k;

        count = 0;
        current = list.getHead();
       // System.out.println(current.getData());
        for (int i = 0; i < position; i++) {
            current = current.next;
        }


        return current.getData().toString();
    }


    public static void main(String[] args) {
        LinkedList<String> testList = new LinkedList<>("S");
        testList.appendToTail("O");
        testList.appendToTail("M");
        testList.appendToTail("E");
        testList.appendToTail("T");
        testList.appendToTail("H");
        testList.appendToTail("I");
        testList.appendToTail("N");
        testList.appendToTail("G");

        System.out.println(kthToLastNaive(testList, 5));
        System.out.println(kthToLastArray(testList, 5));


    }


}
