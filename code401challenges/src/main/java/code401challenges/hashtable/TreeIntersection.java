package code401challenges.hashtable;

import code401challenges.tree.BinaryTree;

import java.util.LinkedList;

public class TreeIntersection {

    public static Hashtable treeIntersection(BinaryTree tree1, BinaryTree tree2) {
        Hashtable table1 = new Hashtable();
        Hashtable table2 = new Hashtable();
//        Hashtable table3 = new Hashtable();

        LinkedList secondQ = new LinkedList();


        for (Object string : tree1.postOrder()) table1.add(string.toString(), null);


//        for (Object string : tree2.postOrder()) table2.add(string.toString(), null);

        for (Object string : tree2.postOrder()) secondQ.add(string);


        // If removes all values from set1 that aren't also in set2
        for (Object value : secondQ) {
//            String value = "";
            if (table1.contains(value.toString())) {
                table2.add(value.toString(), null);
            }
        }
        return table2;
    }
}


