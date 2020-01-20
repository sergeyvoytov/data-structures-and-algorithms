package code401challenges.stacksandqueues;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {
    Stack stackTest;

    @Before
    public void setUp() throws Exception {
        stackTest = new Stack();
        stackTest.push(1);
        stackTest.push(2);
        stackTest.push(3);
        stackTest.push(4);
    }

    @Test
    public void push() {
        stackTest.push(5);
        stackTest.push(7);
        stackTest.push(8);

        assertEquals(8, stackTest.peek());
    }

    @Test
    public void pop() {
        assertEquals(4, stackTest.pop());
    }

    @Test
    public void peek() {
        assertEquals(4, stackTest.peek());
    }

    @Test
    public void isEmpty() {
        assertFalse(stackTest.isEmpty());
    }
}