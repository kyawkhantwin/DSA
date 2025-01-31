package com.example.dsa.queueTest;

import static org.junit.jupiter.api.Assertions.*;

import com.example.dsa.queue.Queue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class QueueTest {
    private Queue queue;

    @BeforeEach
    void setUp() {
        queue = new Queue(5);
    }

    @Test
    void testEnqueueAndPeek() {
        queue.enqueue(10);
        queue.enqueue(20);
        assertEquals(10, queue.peek(), "Peek should return the first inserted element (FIFO)");
    }

    @Test
    void testEnqueueAndDequeue() {
        queue.enqueue(10);
        queue.enqueue(20);
        assertEquals(10, queue.dequeue(), "Dequeue should return the first inserted element (FIFO)");
        assertEquals(20, queue.peek(), "Peek should now return the next element after dequeue");
    }

    @Test
    void testSize() {
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        assertEquals(3, queue.size(), "Size should be 3 after enqueueing 3 elements");
        queue.dequeue();
        assertEquals(2, queue.size(), "Size should decrease after dequeue");
    }

    @Test
    void testIsEmpty() {
        assertTrue(queue.isEmpty(), "Queue should be empty initially");
        queue.enqueue(5);
        assertFalse(queue.isEmpty(), "Queue should not be empty after enqueue");
        queue.dequeue();
        assertTrue(queue.isEmpty(), "Queue should be empty after removing all elements");
    }

    @Test
    void testIsFull() {
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        assertTrue(queue.isFull(), "Queue should be full after enqueueing up to capacity");
    }

    @Test
    void testDequeueFromEmptyQueueThrowsException() {
        Exception exception = assertThrows(IllegalStateException.class, () -> {
            queue.dequeue();
        });
        assertEquals("Queue is empty", exception.getMessage(), "Should throw an exception when dequeuing from an empty queue");
    }

    @Test
    void testEnqueueToFullQueueThrowsException() {
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        Exception exception = assertThrows(IllegalStateException.class, () -> {
            queue.enqueue(6);
        });
        assertEquals("Queue is full", exception.getMessage(), "Should throw an exception when enqueueing to a full queue");
    }
}
