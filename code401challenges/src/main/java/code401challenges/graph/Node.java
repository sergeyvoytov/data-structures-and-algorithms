package code401challenges.graph;

import java.util.ArrayList;
import java.util.List;

public class Node {
    String name;
    ArrayList<Edge> listEdges;


    public Node(String name) {
        this.name = name;
        this.listEdges = new ArrayList<>();
    }

    @Override
    public String toString() {
        return name  ;


    }
}
