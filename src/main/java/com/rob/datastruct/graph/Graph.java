package com.rob.datastruct.graph;


import com.rob.datastruct.Queue;

/**
 * - superset of tree. a tree is a connected graph without cycles
 *
 * a graph is:
 * - a collection of nodes with edges
 * - can be directed (path a->b) or undirected (a->b and a<-b)
 *
 * if there is a path between every pair of vertices then it is connected. Otherwise may consist of multiple isolated subgraphs
 *
 * graphs can have cycles
 *
 */
public class Graph {

    //-- multiple nodes since there may be disconnected graphs
    private Node[] nodes;


    //-- adjacency list implementation. O(1) to find vertex between nodes
    //-- 0:1
    //-- 1: 2
    //-- 2: 0,3
    //-- 3: 2
    private int[] vertexes;


    //-- adjacency matrix implementation
    //-- for every (a,b) mark either 0 for no edge or 1 for edge
    private boolean[][] adjacencies;


    /**
     * select a node and explore each branch fully before going to its neighbours
     * inorder, preorder and postorder are all DFS
     */
    public void depthFirstSearch(Node node) {
        if (node == null) {
            return;
        }

        visit(node);
        node.visited = true;
        for (Node n: node.children) {
           if (n.visited = false) {
               depthFirstSearch(n);
           }
        }

    }

    /**
     * select a node and explore all children fully before going down the branch
     *
     * useful if finding the shortest path between two nodes (dijkstra)
     *
     * an interative solution using a queue works best
     */
    public void breadthFirstSearch(Node node) {
        Queue<Node> queue = new Queue<> ();

        node.marked = true;
        queue.add(node); //-- add to the end of the queue

        while (!queue.isEmpty()) {
            Node r = queue.remove(); //-- remove from front of the queue
            visit (r);

            //-- add all of r's children
            for (Node n: r.children) {
                if (n.marked == false) {
                    n.marked = true;
                    queue.add(n);
                }
            }
        }

    }


    private void visit(Node n) {
        System.out.println(n.name);
    }


}
