package code401challenges.hashtable;
import org.junit.Test;

import static org.junit.Assert.*;

public class TreeIntersectionTest {
    @Test
    public void treeIntersectionTest() {

        TreeIntersection.Tree tree1 = new TreeIntersection.Tree();
        TreeIntersection.Tree tree2 = new TreeIntersection.Tree();

        tree1.root = new TreeIntersection.Node(1, new TreeIntersection.Node(2, new TreeIntersection.Node(3, null, null), null), null);
        tree2.root = new TreeIntersection.Node(1, new TreeIntersection.Node(2, new TreeIntersection.Node(7, null, null), null), null);
//        System.out.println(TreeIntersection.treeIntersection(tree1, tree2).toString());
        String stuff = "[1, 2]";
        assertEquals(stuff, TreeIntersection.treeIntersection(tree1, tree2).toString());
    }
}