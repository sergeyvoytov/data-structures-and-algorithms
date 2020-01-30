package code401challenges.tree;

public class MaxTree extends BinaryTree {
    MaxTree() {
        super();
    }
    public static int maxValue;

    public static Integer findMaximumValue(BinaryTree tree) {
//        base case
        if (tree.root == null) {
            return null;
        }
        MaxTree.maxValue = tree.root.value;
        MaxTree.search(tree.root);
        return maxValue;
    }
    private static void search(Node current) {
        if (current.value > MaxTree.maxValue){
            maxValue = current.value;
        }
        if (current.left != null){
            search(current.left);
        }
        if (current.right != null){
            search(current.right);
        }
    }
}
