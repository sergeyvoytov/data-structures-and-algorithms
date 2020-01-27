package code401challenges.tree;

public class BinarySearchTree {


    //    public void add(int value) {
//        root = addRecursive(root, value);
//    }

    //Define a method named contains that accepts a value, and returns a boolean indicating whether
// or not the value is in the tree at least once.
    public boolean contains(Node node, int key) {
        if (node == null)
            return false;
        if (node.value == key)
            return true;
        boolean leftSubTree = contains(node.left, key);
        if (leftSubTree) {
            return true;
        } // node found, no need to look further

        boolean rightSubTree = contains(node.right, key);

        return rightSubTree;
    }

    public Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            // value already exists
            return current;
        }

        return current;
    }


}










