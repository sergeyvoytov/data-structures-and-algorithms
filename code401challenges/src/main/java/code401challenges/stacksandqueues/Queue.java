package code401challenges.stacksandqueues;

public class Queue {
    Node front;
    Node back;

    //    Define a method called enqueue which takes any value as an argument and adds a new node with that value
    //    to the back of the queue with an O(1) Time performance.
    public void enqueue(int value) {

        Node newNode = new Node(value, null);

        if (front == null) {
            this.front = newNode;
            this.back = newNode;
            return;
        }
        back.next = newNode;
        back = back.next;
    }


//    Define a method called dequeue that does not take any argument, removes the node from the front of the queue, and returns the node’s value.

    public int dequeue() {

        if (this.front == null) {
            throw new IllegalArgumentException("Nope");
        } else {
            front = front.next;
            return front.value;

        }

    }

    //   returns the value of the node located in the front of the queue, without removing it from the queue.
    public int peek() {
        return this.front.value;
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
