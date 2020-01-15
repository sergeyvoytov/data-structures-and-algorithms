package code401challenges.linkedlist;

import java.util.StringJoiner;

public class LinkedList {

    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void insert(int value) {
        this.head = new Node(value, this.head);

    }

    //Define a method called includes which takes any value as an argument and returns
    //a boolean result depending on whether that value exists as a Node’s value somewhere within the list.

    public boolean includes(int value) {

        Node search = this.head;    //Initialize search
        while (search != null) {
            if (search.value == value)
                return true;    //data found
            search = search.next;
        }
        return false;    //data not found
    }

    public String toString() {
        Node currentNodeWeAreLookingAt = this.head;
        StringJoiner answer = new StringJoiner(", ");
        while (currentNodeWeAreLookingAt != null) {

//            System.out.println("" + currentNodeWeAreLookingAt.value);
            answer.add(Integer.toString(currentNodeWeAreLookingAt.value));
            currentNodeWeAreLookingAt = currentNodeWeAreLookingAt.next;
        }
        return answer.toString();
    }

    //     Appends a new node at the end.  This method is defined inside LinkedList class shown above
    public void append(int value) {
        Node newNode = new Node(value, null);

        if (head == null) {
            head = new Node(value, null);
            return;
        }
        Node last = this.head;
        while (last.next != null)
            last = last.next;
        last.next = newNode;
    }

    //Insert new node before the specified value
    public void insertBefore(int value, int newValue) {
        if (this.head.value == value) {
            this.insert(newValue);
            return;
        } else if (!this.includes(value)) {
            return;
        }

        Node current = this.head;
        while (current != null) {
            if (current.next.value == value) {
                Node newNode = new Node(newValue, null);
                newNode.next = current.next;
                current.next = newNode;
                break;
            }
            current = current.next;
        }
    }

    // Insert new node after specified value
    public void insertAfter(int value, int newValue) {
        if (!this.includes(value)) {
            return;
        }

        Node current = this.head;
        while (current != null) {
            if (current.value == value) {
                Node newNode = new Node(newValue, null);
                newNode.next = current.next;
                current.next = newNode;
                break;
            }
            current = current.next;
        }
    }

    public int getK(int k) {


        Node currentNode = this.head;

        while (currentNode != null) {

            Node lastNode = currentNode;
            for (int i = 0; i < k; i++) {
                if (lastNode.next == null && i != k - 1) {
                    throw new IllegalArgumentException();
                }
                lastNode = lastNode.next;
            }
            if (lastNode.next == null) {
                return currentNode.value;
            }
            currentNode = currentNode.next;
        }
        throw new IllegalArgumentException("Did not find the value");
    }
}
