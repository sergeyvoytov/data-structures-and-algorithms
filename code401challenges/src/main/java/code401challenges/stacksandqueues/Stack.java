package code401challenges.stacksandqueues;


public class Stack {

    Node top;

//    Create a Stack class that has a top property. It creates an empty Stack when instantiated.
//    This object should be aware of a default empty value assigned to top when the stack is created.

    public Stack() {
        this.top = null;
    }

    //       takes any value as an argument and adds a new node with that value to the top of the stack
    public void push(int value) {
        Node newNode = new Node(value, this.top);
        this.top = newNode;
    }


    //   removes the node from the top of the stack, and returns the node’s value.
    public int pop() {

        if (this.top == null) {
            System.out.println("stack is empty");
        } else {
            Node temp = top;
            top = top.next;
            return temp.value;
        }
        return -1;
    }

    //    returns the value of the node located on top of the stack, without removing it from the stack.
    public int peek() {
        return this.top.value;
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
