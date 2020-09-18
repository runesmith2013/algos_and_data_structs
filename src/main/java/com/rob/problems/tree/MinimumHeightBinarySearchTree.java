package com.rob.problems.tree;

import com.rob.datastruct.tree.binary.BinaryNode;
import com.rob.datastruct.tree.binary.BinarySearchTree;

public class MinimumHeightBinarySearchTree {

    static BinaryNode split (int[] values, int start, int end) {

        if (end < start) {
            return null;
        }

        int mid = (start + end) / 2;
        BinaryNode bn = new BinaryNode(values[mid]);

        bn.setLeft(split( values, start, mid -1));
        bn.setRight(split(values, mid +1, end));

        return bn;

    }

    public static BinarySearchTree constructTree(int[] values) {
         BinaryNode node = split(values, 0, values.length - 1);
         return new BinarySearchTree(node);

    }

    public static void main(String[] args) {
        int[] values = new int[] {1,24,35,47,53,611,700};

        BinarySearchTree tree = constructTree(values);

        System.out.print("");

    }






}
