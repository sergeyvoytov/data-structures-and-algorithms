package code401challenges.tree;

import java.util.ArrayList;

public class BinaryTree {
    // reference     https://www.baeldung.com/java-binary-tree
    public Node root;
    public StrNode strRoot;

    public BinaryTree(StrNode strRoot) {
        this.strRoot = strRoot;
        this.root= null;
    }




    public BinaryTree(Node root) {
        this.root = root;
    }

    public BinaryTree() {
        this.root = null;
        this.strRoot=null;
    }

    public  ArrayList preOrder(){
        ArrayList<Integer> list = new ArrayList<>();
        return preOrder(root, list);

    }

    private ArrayList preOrder(Node node, ArrayList list) {
        if (node != null) {
            list.add(node.value);
            preOrder(node.left, list);
            preOrder(node.right, list);

        }
        return list;
    }



    public  ArrayList inOrder(){
        ArrayList<Integer> list = new ArrayList<>();
        return inOrder(root, list);

    }
    private ArrayList inOrder(Node node, ArrayList list) {
        if (node != null) {
            inOrder(node.left,list);
//            System.out.print(" " + node.value);
            list.add(node.value);

            inOrder(node.right,list);

        }
        return list;
    }


    public  ArrayList postOrder(){
        ArrayList<Integer> list = new ArrayList<>();
        return postOrder(root, list);

    }
    private ArrayList postOrder(Node node, ArrayList list) {

        if (node != null) {
            postOrder(node.left,list);
            postOrder(node.right,list);
            list.add(node.value);

        }
        return list;
    }



}