package com.example.dsa.stackTest;

import com.example.dsa.stack.Stack;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    private final  Stack<Integer> stack = new Stack<>(5);

    @Test
    public void pushTest() {
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.peek(), "Top element should be 3 after two pushes.");
    }

    @Test
    public void popTest() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.pop(), "The element popped should be 3.");
        assertEquals(2, stack.pop(), "The next element popped should be 2.");
    }

    @Test
    public void peekTest() {
        stack.push(4);
        stack.push(5);
        assertEquals(5, stack.peek(), "The top element should be 5.");
    }

    @Test
    public void isEmptyTest() {
        assertTrue(stack.isEmpty(), "Stack should be empty initially.");
        stack.push(10);
        assertFalse(stack.isEmpty(), "Stack should not be empty after pushing an element.");
    }

    @Test
    public void sizeTest() {
        assertEquals(0, stack.size(), "Initial stack size should be 0.");
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.size(), "Stack size should be 2 after two pushes.");
    }
}
