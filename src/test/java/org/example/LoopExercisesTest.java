package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class LoopExercisesTest {

    @Test
    void sumToN_shouldWork() {
        assertEquals(1, LoopExercises.sumToN(1));
        assertEquals(6, LoopExercises.sumToN(3));
        assertEquals(55, LoopExercises.sumToN(10));
    }

    @Test
    void sumToN_invalidShouldThrowException() {
        assertThrows(IllegalArgumentException.class, () -> LoopExercises.sumToN(0));
        assertThrows(IllegalArgumentException.class, () -> LoopExercises.sumToN(-1));
    }

    @Test
    void factorial_shouldWork() {
        assertEquals(1L, LoopExercises.factorial(0));
        assertEquals(1L, LoopExercises.factorial(1));
        assertEquals(2L, LoopExercises.factorial(2));
        assertEquals(120L, LoopExercises.factorial(5));
    }

    @Test
    void factorial_invalidShouldThrowException() {
        assertThrows(IllegalArgumentException.class, () -> LoopExercises.factorial(-1));
    }

    @Test
    void countDigits_shouldWork() {
        assertEquals(1, LoopExercises.countDigits(0));
        assertEquals(1, LoopExercises.countDigits(7));
        assertEquals(2, LoopExercises.countDigits(10));
        assertEquals(3, LoopExercises.countDigits(999));
        assertEquals(4, LoopExercises.countDigits(-1234));
    }
}
