package code401challenges.graph;

public class Edge {
    Node nextNode;
    int weight;

    @Override
    public String toString() {
        return  ""+ nextNode + " "+
                 + weight
                ;
    }

    public Edge(Node nextNode, int weight) {
        this.nextNode = nextNode;
        this.weight = weight;
    }
}