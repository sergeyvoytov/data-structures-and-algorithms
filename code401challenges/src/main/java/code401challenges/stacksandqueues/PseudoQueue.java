package code401challenges.stacksandqueues;

public class PseudoQueue<Potato> {

    Potato russet;

    Node<Potato> top;

    Stack<Potato> firstStack;
    Stack<Potato> secondStack;

    public PseudoQueue(Stack<Potato> firstStack, Stack<Potato> secondStack) {
        this.firstStack = firstStack;
        this.secondStack = secondStack;
    }

    public void enqueue(Potato value) {
        if (firstStack.peek() == null) {
            firstStack.push(value);
        } else {
            secondStack.push(firstStack.pop());
        }
        firstStack.push(value);

    }


    // Removes the node from the front of the queue, and returns that node's value
    public Potato dequeue() {
        if (firstStack != null) {

            return firstStack.pop();
        }
        throw new IllegalArgumentException();
    }


}
