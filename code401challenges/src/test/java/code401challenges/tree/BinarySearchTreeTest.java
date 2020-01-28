package code401challenges.tree;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {

    @Test
    public void addTest() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(3);
        tree.add(5);
        tree.add(7);
        tree.add(2);

        assertEquals(3, tree.root.value);
        assertEquals(5, tree.root.right.value);
        assertEquals(7, tree.root.right.right.value);
        assertEquals(2, tree.root.left.value);
        assertNull(tree.root.left.left);
        assertNull(tree.root.left.right);

//        tree.add(2);
//Will not add duplicate value
//        tree.printInOrder(tree.root);

    }


    @Test
    public void containsTest() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(3);
        tree.add(5);
        tree.add(7);
        tree.add(2);
        tree.add(72);
        tree.add(23);


        assertTrue(tree.contains(3));
        assertFalse(tree.contains(100));
        assertTrue(tree.contains(23));

    }
}