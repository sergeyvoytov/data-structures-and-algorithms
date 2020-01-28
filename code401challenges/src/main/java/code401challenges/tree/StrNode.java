package code401challenges.tree;

public class StrNode {
    public String value;
    public StrNode right;
    public StrNode left;

    public StrNode(String value, StrNode left, StrNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public StrNode(String value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}