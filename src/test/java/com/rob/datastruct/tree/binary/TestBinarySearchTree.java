package com.rob.datastruct.tree.binary;

import org.junit.Test;

public class TestBinarySearchTree {


    @Test
    public void testInsertion() {
       BinarySearchTree bst = new BinarySearchTree(0);

       bst.insert(6);
       bst.insert(4);
       bst.insert(8);
       bst.insert(3);
       bst.insert(7);
       bst.insert(2);


       bst.inOrderTraversal(bst.root);

        System.out.println("contains 50:" +bst.containsNode(50));
        System.out.println("contains 3:" +bst.containsNode(3));

        bst.delete(8);
        System.out.println("contains 8:" +bst.containsNode(8));

        bst.inOrderTraversal(bst.root);

        System.out.println("Breadth first");

        bst.breadthFirstSearch();


    }

}
