package com.rob.problems.tree;

import com.rob.datastruct.tree.binary.BinaryNode;

public class BalancedBinaryTree {


    public int getHeight(BinaryNode bn) {
        if (bn == null) return -1;

        return Math.max(getHeight(bn.getLeft()), getHeight(bn.getRight()))+ 1;
    }

    boolean isBalanced(BinaryNode root) {
        if (root == null) {
           return true;
        }

        int heightDiff = getHeight(root.getLeft()) - getHeight(root.getRight());
        if (Math.abs(heightDiff) > 1) {
            return false;
        } else {
            return isBalanced(root.getLeft()) && isBalanced(root.getRight());
        }
    }


}
