package code401challenges.tree;

import org.junit.Test;

import static code401challenges.tree.MaxTree.findMaximumValue;
import static org.junit.Assert.*;

public class MaxTreeTest {

    @Test
    public void getNullTree() {
        MaxTree tree = new MaxTree();
        assertEquals(null, findMaximumValue(tree));

    }

    @Test
    public void getMaximumRecTest() {
        MaxTree tree = new MaxTree();
        assertEquals(null, findMaximumValue(tree));

        Node root = new Node(1, new Node(10), new Node(3));
        Node node1 = new Node(20);
        Node node2 = new Node(40);
        Node node3 = new Node(60);

        tree.root = root;

        //             1
        //       10            3
        //    20   40      60

        root.left.left = node1;
        root.left.right = node2;
        root.right.left = node3;
        int expected =60;
        int actual = findMaximumValue(tree);
        assertEquals(expected,actual);

    }
}