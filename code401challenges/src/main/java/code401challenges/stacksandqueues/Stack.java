package code401challenges.stacksandqueues;


import java.util.EmptyStackException;

public class Stack<Potato> {

    Potato russet;

    Node<Potato> top;

//    Create a Stack class that has a top property. It creates an empty Stack when instantiated.
//    This object should be aware of a default empty value assigned to top when the stack is created.

    public Stack() {
        this.top = null;
    }

    //       takes any value as an argument and adds a new node with that value to the top of the stack
    public void push(Potato value) {
        Node<Potato> newNode = new Node<>(value, this.top);
        this.top = newNode;
    }


    //   removes the node from the top of the stack, and returns the node’s value.
    public Potato pop() {

        if (this.top == null) {
            System.out.println("stack is empty");
        } else {
            Node<Potato> temp = top;
            top = top.next;
            return temp.value;
        }
        throw new EmptyStackException();

    }

    //    returns the value of the node located on top of the stack, without removing it from the stack.
    public Potato peek() {
        if (!isEmpty()) {
            return this.top.value;
        } else {

            System.out.println("stack is empty");
            throw new EmptyStackException();
        }
    }


//    Indicating whether or not the stack is empty.

    public boolean isEmpty() {

        if (this.top == null) {
            return true;
        } else {

            return false;
        }
    }


    public void display() {

        if (top == null) {
            System.out.println("stack is empty");

        } else {
            Node temp = top;
            while (temp != null) {
                System.out.printf("%d -> ", temp.value);
                temp = temp.next;
            }
        }
    }
}
