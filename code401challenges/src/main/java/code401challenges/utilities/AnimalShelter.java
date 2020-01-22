package code401challenges.utilities;

import code401challenges.stacksandqueues.Node;

public class AnimalShelter<Potato> {

    Node<Potato> front;
    Node<Potato> rear;

    public AnimalShelter() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(Potato value) {
        Node new1 = new Node(value, null);
        if (this.front == null) {
            this.front = new1;
            this.rear = new1;
        } else {
            this.rear.next = new1;
            this.rear = new1;
        }
    }
}
