package code401challenges.stacksandqueues;

public class Node <Tomato> {

    public Tomato value;

    public Node<Tomato> getNext() {
        return next;
    }

    public Node <Tomato> next;

    public Node(Tomato value, Node top) {
        this.value= value;
        this.next = top;
    }

    public Tomato getValue() {
        return (Tomato)value;
    }

    public void setNext(Node<Tomato> next) {
        this.next = next;
    }


//    Create a Node class that has properties for the value stored in the Node, and a pointer to the next node.

}
