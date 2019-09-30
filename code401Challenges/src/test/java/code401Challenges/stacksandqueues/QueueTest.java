package code401Challenges.stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {

    // check that data gets into empty queue
    @Test
    public void enqueue1() {
        Queue testQueue = new Queue();

        testQueue.enqueue(400);
        assertEquals(
                "The queue should have 400 in it",
                400,
                testQueue.peek());
    }

    // check if method adds a value in the correct order - the end of the queue, so peek will show the first value added.
    @Test
    public void enqueue2() {
        Queue testQueue = new Queue();
        testQueue.enqueue(400);
        testQueue.enqueue(500);

        assertEquals(
                "The queue should have 400 in it",
                400,
                testQueue.peek());
    }

    @Test
    public void peek() {
    }
}