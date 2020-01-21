package code401challenges.stacksandqueues;

import java.util.EmptyStackException;

public class Queue <Potato> {

    Potato russet;

    Node <Potato> front;
    Node <Potato> back;

    //    Define a method called enqueue which takes any value as an argument and adds a new node with that value
    //    to the back of the queue with an O(1) Time performance.
    public void enqueue(Potato value) {

        Node <Potato> newNode = new Node(value, null);

        if (front == null) {
            this.front = newNode;
            this.back = newNode;

        }
        else {
            this.back.next = newNode;
            this.back = back.next;
        }
    }


//    Define a method called dequeue that does not take any argument, removes the node from the front of the queue, and returns the node’s value.

    public Potato dequeue() {

        if (this.front == null) {
            throw new NullPointerException("Nope");
        } else {
            Potato temp = front.value;
            front = front.next;
            return temp;
        }

    }

    //   returns the value of the node located in the front of the queue, without removing it from the queue.

    public Potato peek() {
        if (!isEmpty()) {
            return this.front.value;
        } else {

            System.out.println("queee is empty");
            throw new EmptyStackException();
        }
    }

//    returns a boolean indicating whether or not the queue is empty.

    public boolean isEmpty() {
        if (this.front == null) {
            return true;
        } else {
            return false;
        }
    }

    public void display() {

        if (front == null) {
            System.out.println("queee is empty");

        } else {
            Node temp = front;
            while (temp != null) {
                System.out.printf("%d -> ", temp.value);
                temp = temp.next;
            }
        }
    }
}
