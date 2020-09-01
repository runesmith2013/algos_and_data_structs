package com.rob.datastruct.tree.binary;

/**
 * Binary Search Tree - all left descendants are less than node and all right descendents are greater
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
 */
public class BinarySearchTree extends BinaryTree {


    public BinarySearchTree(int value) {
        super(new BinaryNode(value));
    }

    public BinarySearchTree(BinaryNode root) {
        super(root);
    }

    /**
     * insertion is O(log n) because we need to find where to put the node
     *
     * if the new node's value is lower than current, we go to left child
     * if new node's value is greater, we go to the right child
     * if current is null, we have a leaf and can insert at that point
     *
     * @param current
     * @param value
     * @return
     */
    private BinaryNode insert(BinaryNode current, int value) {
        if (current == null) {
            return new BinaryNode(value);

        }

        if (value < current.getValue()) {
            current.setLeft(insert(current.getLeft(), value));
        } else if (current.getValue() < value) {
            current.setRight(insert(current.getRight(), value));

        } else {
            //-- value already exists
            return current;
        }

        return current;
    }

    public void insert(int value) {
        root = insert(root, value);
    }


    /**
     * O(log n) as we're halfing the search space with each recursive call
     * @param current
     * @param value
     * @return
     */
    private boolean containsNodeRecursive(BinaryNode current, int value) {

        //-- we've reached a leaf
        if (current == null) {
            return false;
        }

        if (value == current.getValue()) {
            return true;
        }

        //-- recurse down left or right branches
        return value < current.getValue() ? containsNodeRecursive(current.getLeft(), value) : containsNodeRecursive(current.getRight(), value);
    }

    public boolean containsNode(int value) {
        return containsNodeRecursive(root, value);
    }


    private BinaryNode deleteRecursive (BinaryNode current, int value) {
        if (current == null) {
            return null;
        }

        if (value == current.getValue()) {

            //-- case 1: node has no children, need to set parent node to null
            if (current.getLeft() == null && current.getRight() == null) {
                return null;
            }

            //-- case 2: node has 1 child, which gets assigned to the parent
            if (current.getRight() == null) {
                return current.getLeft();
            }
            if (current.getLeft() == null) {
                return current.getRight();
            }


            //-- case 3: has two children
            int smallestValue = findSmallestValue(current.getRight());
            current.value = smallestValue;
            current.setRight(deleteRecursive(current.getRight(), smallestValue));
            return current;
        }

        if (value < current.getValue()) {
            current.setLeft(deleteRecursive(current.getLeft(), value));
            return current;
        }

        current.setRight(deleteRecursive(current.getRight(), value));
        return current;



    }

    public void delete(int value) {
      root = deleteRecursive(root, value);
    }

    private int findSmallestValue(BinaryNode node) {
        return node.getLeft() == null ? node.getValue() : findSmallestValue(node.getLeft());
    }


}
