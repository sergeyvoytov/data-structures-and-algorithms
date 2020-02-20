package code401challenges.hashtable;

import code401challenges.tree.BinaryTree;
import code401challenges.tree.Node;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class TreeIntersectionTest {

    @Test
    public void treeIntersectionTest() {

        Node root1 = new Node(1, new Node(10), new Node(3));
        Node node11 = new Node(20);
        Node node21 = new Node(40);
        Node node31 = new Node(50);
        //             1
        //       10            3
        //    20   40      50

        root1.left.left = node11;
        root1.left.right = node21;
        root1.right.left = node31;
        BinaryTree tree = new BinaryTree(root1);



        Node root2 = new Node(1, new Node(10), new Node(3));
        Node node1 = new Node(20);
        Node node2 = new Node(40);
        Node node3 = new Node(50);
        //             1
        //       10            3
        //    20   40      50

        root1.left.left = node1;
        root1.left.right = node2;
        root1.right.left = node3;
        BinaryTree tree444 = new BinaryTree(root1);
        BinaryTree tree555 = new BinaryTree(root2);


        System.out.println(TreeIntersection.treeIntersection(tree444,tree555));


    }
}