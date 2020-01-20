package code401challenges.stacksandqueues;

import org.checkerframework.checker.nullness.qual.AssertNonNullIfNonNull;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {
    Queue queueTest;

    @Before

    public void setUp() throws Exception {
        queueTest = new Queue();
        queueTest.enqueue(1);
        queueTest.enqueue(2);
        queueTest.enqueue(3);
        queueTest.enqueue(4);
    }

    @Test
    public void enqueue() {
        queueTest.enqueue(79);
        assertEquals(1, queueTest.peek());
    }

    @Test
    public void dequeue() {
        assertEquals(2, queueTest.dequeue());
    }

    @Test
    public void peek() {
        assertEquals(1, queueTest.peek());
    }

    @Test
    public void isEmpty() {
        assertFalse(queueTest.isEmpty());
    }

    @Test(expected = NullPointerException.class)
    public void dequeueAll() {
        queueTest.dequeue();
        queueTest.dequeue();
        queueTest.dequeue();
        queueTest.dequeue();
        queueTest.dequeue();
        queueTest.dequeue();
    }
}