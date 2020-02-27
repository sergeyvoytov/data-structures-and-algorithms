package code401challenges.graph;

import java.util.*;

public class DepthFirst {

    public static List<Node> depthFirst(Graph graph) throws EmptyStackException {
        List<Node> result = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        Node currentNode;

        for (Node node : graph.listNodes) {
            if (!result.contains(node)) {
                stack.push(node);
                try {
                    while (stack.peek() != null) {
                        currentNode = stack.pop();
                        if (!result.contains(currentNode)) {
                            result.add(currentNode);
                            for (Edge edge : currentNode.listEdges) {
                                if (!result.contains(edge.nextNode)) {
                                    stack.push(edge.nextNode);
                                }
                            }
                        }
                    }
                } catch (EmptyStackException e) {
                }
            }
        }
        return result;
    }
}

