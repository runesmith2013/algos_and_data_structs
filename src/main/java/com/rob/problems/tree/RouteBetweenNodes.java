package com.rob.problems.tree;

import com.rob.datastruct.Queue;
import com.rob.datastruct.graph.Node;

public class RouteBetweenNodes {


    public boolean routeExists(Node graphNodeOne, Node graphNodeTwo) {
        Queue<Node> queue = new Queue();

        graphNodeOne.marked = true;
        queue.add(graphNodeOne);

        while (!queue.isEmpty()) {
            Node node = queue.remove();
            if (!node.marked) {
                if (node.name.equals(graphNodeTwo)) {
                    return true;
                }
                for (Node n : node.children) {
                    if (n.marked == false) {
                        n.marked = true;
                    }
                    queue.add(n);
                }
            }
        }
        return false;
    }

}
