package code401challenges.graph;

import java.util.ArrayList;

public class Graph {
///https://www.baeldung.com/java-graphs

    public ArrayList<Node> listNodes;

    public Graph() {
        this.listNodes = new ArrayList<>();
    }

    public Node addNode(String label) {
        Node returningNode = new Node(label);
        listNodes.add(returningNode);
        return returningNode;
    }
//    AddEdge()
//    Adds a new edge between two nodes in the graph
//    Include the ability to have a “weight”
//    Takes in the two nodes to be connected by the edge
//    Both nodes should already be in the Graph

    public void addEdge(Node node1, Node node2, int weight) {

        if (listNodes.contains(node1) && listNodes.contains(node2)) {
            Edge edge1 = new Edge(node2, weight);
            node1.listEdges.add(edge1);
            Edge edge2 = new Edge(node1, weight);
            node2.listEdges.add(edge2);
        } else throw new IllegalArgumentException("Not existing Node!");
    }
//    GetNodes()
//    Returns all of the nodes in the graph as a collection (set, list, or similar)

    public ArrayList<Node> getNodes() {
        return listNodes;
    }

//    GetNeighbors()
//    Returns a collection of nodes connected to the given node
//    Takes in a given node
//    Include the weight of the connection in the returned collection

    public ArrayList<Edge> getNeighbors(Node current) {
        return current.listEdges;

    }

//    Size()
//    Returns the total number of nodes in the graph

    public int size() {
        return listNodes.size();
    }

    @Override
    public String toString() {
        return "" +
                listNodes;
    }
}
