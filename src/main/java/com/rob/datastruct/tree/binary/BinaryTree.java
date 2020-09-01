package com.rob.datastruct.tree.binary;


import java.util.LinkedList;
import java.util.Queue;

/**
 * Binary tree - each node has at most two children
 *
 */
public class BinaryTree  {

    protected BinaryNode root;


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


    /**
     * select a node and explore all children fully before going down the branch
     *
     * useful if finding the shortest path between two nodes (dijkstra)
     *
     * an interative solution using a queue works best
     */
    public void breadthFirstSearch() {
        if (root == null) {
            return;
        }

        Queue<BinaryNode> nodes = new LinkedList<>();
        nodes.add(root);

        while (!nodes.isEmpty()) {
            BinaryNode r = nodes.remove(); //-- remove from front of the queue
            visit (r);

            if(r.getLeft() != null) {
                nodes.add(r.getLeft());
            }
            if (r.getRight() != null) {
                nodes.add(r.getRight());
            }
        }

    }


    public void visit(BinaryNode node) {
        System.out.println(node.getValue());
    }


}
