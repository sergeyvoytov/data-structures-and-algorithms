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
        while (!firstStack.isEmpty()) {
            secondStack.push(firstStack.pop());
        }
        firstStack.push(value);
        while (!secondStack.isEmpty()) {
            firstStack.push(secondStack.pop());
        }
    }

    public Potato dequeue() {
        if (firstStack.isEmpty()) {
            throw new IllegalArgumentException();
        }
        firstStack.peek();
        firstStack.pop();
        return firstStack.peek();
    }
}