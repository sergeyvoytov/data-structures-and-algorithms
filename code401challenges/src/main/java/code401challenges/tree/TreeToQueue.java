package code401challenges.tree;

import code401challenges.stacksandqueues.Queue;

import java.util.ArrayList;

public class TreeToQueue extends BinaryTree {

    TreeToQueue() {
        super();
    }

    public static ArrayList<Integer> breadthFirst(BinaryTree tree) {
        Queue<Node> queue = new Queue<>();
        queue.enqueue(tree.root);
        ArrayList res= new ArrayList();

        while (!queue.isEmpty()) {
            Node front = queue.dequeue();
//            System.out.print(front.value + " ");
            res.add(front.value);
            if (front.left != null) {
                queue.enqueue(front.left);
            }
            if (front.right != null) {
                queue.enqueue(front.right);
            }
        }
        return  res;
    }
}
