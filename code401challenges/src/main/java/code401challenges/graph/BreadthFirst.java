package code401challenges.graph;

import java.util.*;

public class BreadthFirst {

    public static List<Node> breadthFirstTraversal(Node node) {
        List<Node> nodes = new ArrayList<>();
        Queue<Node> qChecker = new LinkedList<>();
        HashSet<Node> set = new HashSet<>();

        Node currentNode = node;
        nodes.add(currentNode);
        set.add(currentNode);

        while (currentNode != null) {
            ArrayList<Edge> nodesNeighbors = currentNode.listEdges;
            for (Edge edge : nodesNeighbors) {
                if (!set.contains(edge.nextNode)) {
                    set.add(edge.nextNode);
                    qChecker.add(edge.nextNode);
                    nodes.add(edge.nextNode);
                }
            }
            currentNode = qChecker.poll();
        }
//        System.out.println(nodes);
        return nodes;
    }
}
