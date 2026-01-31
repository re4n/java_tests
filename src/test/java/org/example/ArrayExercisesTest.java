package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ArrayExercisesTest {
    @Test
    void max_shouldWork(){
        assertEquals(5, ArrayExercises.max(new int[]{1,5,2}));
        assertEquals(-1, ArrayExercises.max(new int[]{-10,-1,-3}));
        assertEquals(7, ArrayExercises.max(new int[]{7}));
    }

    @Test
    void min_shouldWork(){
        assertEquals(1, ArrayExercises.min(new int[]{1,5,2}));
        assertEquals(-10, ArrayExercises.min(new int[]{-10,-1,-3}));
        assertEquals(7, ArrayExercises.min(new int[]{7}));
    }
    @Test
    void sum_shouldWork() {
        assertEquals(8L, ArrayExercises.sum(new int[]{1, 5, 2}));
        assertEquals(-14L, ArrayExercises.sum(new int[]{-10, -1, -3}));
        assertEquals(7L, ArrayExercises.sum(new int[]{7}));
    }

    @Test
    void average_shouldWork() {
        assertEquals(2.6666666667, ArrayExercises.average(new int[]{1, 5, 2}), 1e-9);
        assertEquals(-4.6666666667, ArrayExercises.average(new int[]{-10, -1, -3}), 1e-9);
        assertEquals(7.0, ArrayExercises.average(new int[]{7}), 1e-9);
    }

    @Test
    void invalidInputs_shouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> ArrayExercises.max(null));
        assertThrows(IllegalArgumentException.class, () -> ArrayExercises.max(new int[]{}));
    }

}
