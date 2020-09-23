package com.rob.problems.tree;

import com.rob.datastruct.tree.binary.BinaryNode;

public class SymmetricTree {

    public boolean isSymmetric(BinaryNode root) {

        return isSymmetric(root.getRight(), root.getLeft());
    }

    private boolean isSymmetric(BinaryNode right, BinaryNode left) {
       if (right == null && left == null) {
           return true;
       }

       if (right == null || left == null) {
           return false;
       }

       return isSymmetric(right.getRight(), left.getLeft()) && isSymmetric(right.getLeft(), left.getRight());

    }


}
