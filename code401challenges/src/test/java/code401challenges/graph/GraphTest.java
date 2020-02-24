package code401challenges.graph;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GraphTest {

//    All appropriate neighbors can be retrieved from the graph

//    Neighbors are returned with the weight between nodes included


    @Test
    public void addNodeAndSize() {

//    Node can be successfully added to the graph

        Graph graph = new Graph();
        Node bob = graph.addNode("Bob");
        Node alice = graph.addNode("Alice");
        Node mark = graph.addNode("Mark");
        Node rob = graph.addNode("Rob");
        Node maria = graph.addNode("Maria");

        //    A collection of all nodes can be properly retrieved from the graph
        assertEquals("[Bob, Alice, Mark, Rob, Maria]", graph.toString());


        //    The proper size is returned, representing the number of nodes in the graph
        assertEquals(5, graph.size());


    }

    @Test
    public void addEdge() {
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

//        assertEquals("[Bob, Alice, Mark, Rob, Maria]", graph.getNodes());
//        System.out.println( graph.getNeighbors(bob).toString());
//        graph.getNeighbors(bob);
//        graph.getNodes();
        assertEquals("[Alice 1, Mark 5]", graph.getNeighbors(bob).toString());

    }

}