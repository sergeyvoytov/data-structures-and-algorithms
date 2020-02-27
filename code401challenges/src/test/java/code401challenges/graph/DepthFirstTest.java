package code401challenges.graph;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static code401challenges.graph.BreadthFirst.breadthFirstTraversal;
import static org.junit.Assert.*;

public class DepthFirstTest {

    @Test
    public void depthFirst() {
        Graph graph = new Graph();
        Node bob = graph.addNode("Bob");
        Node alice = graph.addNode("Alice");
        Node mark = graph.addNode("Mark");
        Node rob = graph.addNode("Rob");
        Node maria = graph.addNode("Maria");
        graph.addEdge(bob, alice, 1);
        graph.addEdge(alice, mark, 2);
        graph.addEdge(rob, mark, 3);
        graph.addEdge(maria, mark, 4);
        graph.addEdge(bob, mark, 5);
        List<Node> compareList = new ArrayList<>();
        compareList.add(bob);
        compareList.add(alice);
        compareList.add(mark);
        compareList.add(rob);
        compareList.add(maria);
        assertEquals("[Bob, Mark, Maria, Rob, Alice]", DepthFirst.depthFirst(graph).toString());

    }

}