package code401challenges.utilities;

import code401challenges.tree.Node;
import code401challenges.tree.StrNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTreeTest {

    @Test
    public void fizzBuzzTree() {
        StrNode root = new StrNode("5", new StrNode("15"), new StrNode("3"));
        StrNode node1 = new StrNode("20");
        StrNode node2 = new StrNode("40");
        StrNode node3 = new StrNode("50");
        //             5
        //       10            3
        //    20   40      50

        root.left.left = node1;
        root.left.right = node2;
        root.right.left = node3;

        FizzBuzzTree fizz = new FizzBuzzTree(root) ;

        fizz.runFizzBuzz();

        assertEquals("Buzz", root.value);
        assertEquals("FizzBuzz", root.left.value);

    }
}