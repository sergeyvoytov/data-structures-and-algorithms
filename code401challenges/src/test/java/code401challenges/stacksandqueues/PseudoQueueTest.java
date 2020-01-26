package code401challenges.stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class PseudoQueueTest {

    @Test
    public void enqueue() {
        Queue testQueue = new Queue();
        testQueue.enqueue(1);
        testQueue.enqueue(2);
        testQueue.enqueue(3);

        assertEquals(1,testQueue.peek());
    }

    @Test
    public void dequeue() {

        Queue testQueue = new Queue();

        testQueue.enqueue(1);
        testQueue.enqueue(2);
        testQueue.enqueue(3);
        testQueue.dequeue();
        testQueue.dequeue();

        assertEquals(3,testQueue.peek());
    }
}