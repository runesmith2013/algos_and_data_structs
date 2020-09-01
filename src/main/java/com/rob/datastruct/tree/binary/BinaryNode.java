package com.rob.datastruct.tree.binary;

public class BinaryNode {

    protected int value;

    private BinaryNode left;
    private BinaryNode right;


    public BinaryNode(int value) {
        this.value = value;
    }


    public int getValue() {
        return value;
    }


    public BinaryNode getLeft() {
        return left;
    }

    public void setLeft(BinaryNode left) {
        this.left = left;
    }

    public BinaryNode getRight() {
        return right;
    }

    public void setRight(BinaryNode right) {
        this.right = right;
    }
}
