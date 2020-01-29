package code401challenges.tree;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TreeToQueueTest {

    @Test
    public void breadthFirst() {
        TreeToQueue tree = new TreeToQueue();


        Node root = new Node(1, new Node(10), new Node(3));
        Node node1 = new Node(20);
        Node node2 = new Node(40);
        Node node3 = new Node(50);
        tree.root = root;
        //             1
        //       10            3
        //    20   40      50
        root.left.left = node1;
        root.left.right = node2;
        root.right.left = node3;
        //expected 1,10,3,20,40,50
        ArrayList expected = new ArrayList();
        expected.add(1);
        expected.add(10);
        expected.add(3);
        expected.add(20);
        expected.add(40);
        expected.add(50);
        assertEquals(expected, TreeToQueue.breadthFirst(tree));
    }
}