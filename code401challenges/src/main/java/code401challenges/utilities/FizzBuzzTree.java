package code401challenges.utilities;

import code401challenges.tree.BinaryTree;
import code401challenges.tree.StrNode;

public class FizzBuzzTree extends BinaryTree {

    public FizzBuzzTree(StrNode strNode) {
        super(strNode);
    }



    private static void fb(StrNode node) {
        if (Integer.parseInt(node.value) % 3 == 0 && Integer.parseInt(node.value) % 5 == 0) {
            node.value = "FizzBuzz";
        } else if (Integer.parseInt(node.value) % 3 == 0) {
            node.value = "Fizz";
        } else if (Integer.parseInt(node.value) % 5 == 0) {
            node.value = "Buzz";
        }
    }

    public void runFizzBuzz() {
        runFizzBuzz(this.strRoot);
    }

    private void runFizzBuzz(StrNode current) {
        //base case
        if (current == null) {
            return;
        }
        fb(current);
        runFizzBuzz(current.left);
        runFizzBuzz(current.right);
    }
}
