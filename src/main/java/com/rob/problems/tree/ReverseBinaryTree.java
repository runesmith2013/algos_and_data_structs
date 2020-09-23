package com.rob.problems.tree;

public class ReverseBinaryTree {

    static class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
    }


    static class BinaryTree {
        Node root;


        void invert() {
            root = invert(root);
        }

        Node invert(Node node) {
            if (node == null) {
                return node;
            }

            Node left = invert(node.left);
            Node right = invert(node.right);

            node.left = right;
            node.right = left;

            return node;
        }


        void print_tree() {
            print_tree(root);
        }

        // print InOrder binary tree traversal.
        void print_tree(Node node) {
            if (node == null)
                return;

            print_tree(node.left);
            System.out.print(node.data + " ");

            print_tree(node.right);
        }
    }

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();
        tree.root = new Node(2);
        tree.root.left = new Node (1);
        tree.root.right = new Node (1);
        tree.root.right.left = new Node(3);
        tree.root.right.right = new Node (5);

        System.out.println("In order traversal");
        tree.print_tree();

        tree.invert();
        System.out.println("In order traversal");
        tree.print_tree();

    }

}
