package com.rob.datastruct.tree.binary;


/**
 * Binary tree - each node has at most two children
 *
 * Binary Search Tree - all left descendents are less than node and all right descendents are greater
 *
 * valid bst:
 *         8
 *       /  \
 *      4    10
 *    /  \    \
 *   2   6    20
 *
 *  invalid bst:
 *        8
 *      /  \
 *    4     10
 *   / \      \
 *  2  12
 *
 *
 */
public class BinaryTree {

    private BinaryNode root;


    public BinaryTree(BinaryNode root) {
        this.root = root;
    }


    public BinaryNode getRoot() {
        return root;
    }


    /**
        In order travsersal means to visit the left, current, right
     */
    public void inOrderTraversal(BinaryNode node) {
        if (node != null) {
             inOrderTraversal(node.getLeft());
             visit(node);
             inOrderTraversal(node.getRight());
        }

    }


    /**
     Pre order traversal means to visit the current, left, right
     */
    public void preOrderTraversal(BinaryNode node) {
        if (node != null) {
            visit(node);
            inOrderTraversal(node.getLeft());
            inOrderTraversal(node.getRight());
        }

    }

    /**
     Post order traversal means to visit the current, left, right
     */
    public void postOrderTraversal(BinaryNode node) {
        if (node != null) {
            inOrderTraversal(node.getLeft());
            inOrderTraversal(node.getRight());
            visit(node);
        }

    }



    public void visit(BinaryNode node) {
        System.out.println(node.getName());
    }


}
