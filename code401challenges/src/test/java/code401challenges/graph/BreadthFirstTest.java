package code401challenges.graph;

import org.junit.Test;

import static code401challenges.graph.BreadthFirst.breadthFirstTraversal;
import static org.junit.Assert.*;

public class BreadthFirstTest {

    @Test
    public void breadthFirstTraversalTest() {

        Graph graph = new Graph();
        Node bob = graph.addNode("Bob");
        Node alice = graph.addNode("Alice");
        Node mark = graph.addNode("Mark");
        Node rob = graph.addNode("Rob");
        Node maria = graph.addNode("Maria");

        //    An edge can be successfully added to the graph
        graph.addEdge(bob, alice, 1);
        graph.addEdge(alice, mark, 2);
        graph.addEdge(rob, mark, 3);
        graph.addEdge(maria, mark, 4);
        graph.addEdge(bob, mark, 5);

        assertEquals("[Maria, Mark, Alice, Rob, Bob]", breadthFirstTraversal(maria).toString());
    }
}