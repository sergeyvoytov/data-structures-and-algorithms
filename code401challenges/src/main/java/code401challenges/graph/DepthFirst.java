package code401challenges.graph;

import java.util.*;

public class DepthFirst {

    public static List<Node> depthFirst(Node node) {
        List<Node> nodes = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        HashSet<Node> set = new HashSet<>();

        Node currentNode = node;
        stack.add(currentNode);
        nodes.add(currentNode);
        set.add(currentNode);

        while (!stack.empty()) {
            ArrayList<Edge> nodesNeighbors = currentNode.listEdges;
            for (Edge edge : nodesNeighbors) {
                if (!set.contains(edge.nextNode)) {
                    set.add(edge.nextNode);
                    stack.add(edge.nextNode);
                    nodes.add(edge.nextNode);
                }
            }
            currentNode = stack.pop();
        }
        System.out.println(nodes);
        return nodes;
    }
}

