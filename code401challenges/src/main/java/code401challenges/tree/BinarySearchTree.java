package code401challenges.tree;

public class BinarySearchTree extends BinaryTree {


    public BinarySearchTree(Node root) {
        super(root);
    }

    public BinarySearchTree() {
        super();
    }

    public void add(int value) {
        root = add(root, value);
    }


    public Node add(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }

        if (value < root.value) {
            root.left = add(root.left, value);
        } else if (value > root.value) {
            root.right = add(root.right, value);
        } else {
            // value already exists
            return root;
        }

        return root;
    }


    //Define a method named contains that accepts a value, and returns a boolean indicating whether
// or not the value is in the tree at least once.
    public boolean contains(int key){
        return contains(this.root, key);

    }

    private boolean contains(Node node, int key) {
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


    public void printInOrder(Node root) {
        if (root == null) {
            return;
        }
        printInOrder(root.left);
        System.out.println(root.value);
        printInOrder(root.right);
    }


    @Override
    public String toString() {
        return "Node{" +
                "value=" + root +
                '}';
    }


}










