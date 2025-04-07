package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    void push_ShouldAddElementToStack() {
        Stack stack = new Stack();
        stack.push(5);
        assertEquals(1, stack.size());
        assertEquals(5, stack.peek());
    }

    @Test
    void pop_ShouldRemoveAndReturnTopElement() {
        Stack stack = new Stack();
        stack.push(10);
        int popped = stack.pop();
        assertEquals(10, popped);
        assertTrue(stack.isEmpty());
    }

    @Test
    void pop_ShouldThrowException_WhenStackIsEmpty() {
        Stack stack = new Stack();
        assertThrows(IllegalStateException.class, stack::pop);
    }

    @Test
    void peek_ShouldReturnTopElementWithoutRemovingIt() {
        Stack stack = new Stack();
        stack.push(7);
        assertEquals(7, stack.peek());
        assertEquals(1, stack.size());
    }

    @Test
    void peek_ShouldThrowException_WhenStackIsEmpty() {
        Stack stack = new Stack();
        assertThrows(IllegalStateException.class, stack::peek);
    }

    @Test
    void isEmpty_ShouldReturnTrue_WhenStackIsEmpty() {
        Stack stack = new Stack();
        assertTrue(stack.isEmpty());
    }

    @Test
    void isEmpty_ShouldReturnFalse_WhenStackHasElements() {
        Stack stack = new Stack();
        stack.push(3);
        assertFalse(stack.isEmpty());
    }
}
