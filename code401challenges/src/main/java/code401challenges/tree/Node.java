package code401challenges.tree;

public class Node {
    //Create a Node class that has properties for the value stored in the node,
    // the left child node, and the right child node.

    public int value;
    public Node right;
    public Node left;

    public Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}
