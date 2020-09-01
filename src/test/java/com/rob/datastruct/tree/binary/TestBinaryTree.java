package com.rob.datastruct.tree.binary;

import org.junit.Before;
import org.junit.Test;

public class TestBinaryTree {


    private BinaryTree tree;

    private void addNodes(BinaryNode node, int i) {
        BinaryNode left = new BinaryNode(i);
        node.setLeft(left);

        BinaryNode right = new BinaryNode (i);
        node.setRight(right);

    }

    @Before
    public void createTestTree() {
        BinaryNode root = new BinaryNode(0);
        tree = new BinaryTree(root);

        BinaryNode current = root;
        addNodes(current, 0);

        addNodes(current.getRight(),1);
        addNodes(current.getLeft(), 1);


    }


    @Test
    public void testInOrder() {

        tree.inOrderTraversal(tree.getRoot());

    }


    @Test
    public void testPreOrder() {

        tree.preOrderTraversal(tree.getRoot());

    }

    @Test
    public void testPostOrder() {

        tree.postOrderTraversal(tree.getRoot());
    }


}
