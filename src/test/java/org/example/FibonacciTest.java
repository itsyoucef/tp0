package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void fibonacci_ShouldReturn0_WhenInputIs0() {
        assertEquals(0, Fibonacci.fibonacci(0));
    }

    @Test
    void fibonacci_ShouldReturn1_WhenInputIs1() {
        assertEquals(1, Fibonacci.fibonacci(1));
    }

    @Test
    void fibonacci_ShouldReturnCorrectResult_ForPositiveInputs() {
        assertEquals(1, Fibonacci.fibonacci(2));
        assertEquals(2, Fibonacci.fibonacci(3));
        assertEquals(3, Fibonacci.fibonacci(4));
        assertEquals(5, Fibonacci.fibonacci(5));
        assertEquals(8, Fibonacci.fibonacci(6));
    }

    @Test
    void fibonacci_ShouldThrowException_WhenInputIsNegative() {
        assertThrows(IllegalArgumentException.class, () -> Fibonacci.fibonacci(-1));
    }
}