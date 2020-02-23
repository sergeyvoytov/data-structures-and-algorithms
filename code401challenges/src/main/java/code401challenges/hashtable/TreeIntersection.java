package code401challenges.hashtable;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;

public class TreeIntersection {
//used in class demo for reference. It made sense to me to do it with nodes this time

    public static ArrayList<Integer> treeIntersection(Tree one, Tree two) {
        ArrayList<Integer> vals = new ArrayList<>();
        HashSet<Integer> seenNumbers = new HashSet<>();
        Stack<Node> nodes = new Stack<>();
        nodes.add(one.root);
        while (!nodes.empty()) {
            Node temp = nodes.pop();
            seenNumbers.add(temp.value);
            if (temp.left != null) {
                nodes.add(temp.left);
            }
            if (temp.right != null) {
                nodes.add(temp.right);
            }
        }
        nodes.add(two.root);
        while (!nodes.empty()) {
            Node temp = nodes.pop();
            if (seenNumbers.contains(temp.value)) {
                vals.add(temp.value);
            }
            if (temp.left != null) {
                nodes.add(temp.left);
            }
            if (temp.right != null) {
                nodes.add(temp.right);
            }
        }
        return vals;
    }

    static class Tree {
        Node root;
    }

    static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value, Node left, Node right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }
}


