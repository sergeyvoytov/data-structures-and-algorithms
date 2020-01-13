package code401challenges.linkedlist;

import java.util.StringJoiner;

public class LinkedList {

    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void insert(int value) {
//        this.head = new Node(value, head);
        Node insertNode = new Node(value, head);
        this.head = insertNode;
    }

    //Define a method called includes which takes any value as an argument and returns
    //a boolean result depending on whether that value exists as a Node’s value somewhere within the list.

    public boolean includes( int value) {

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

}



