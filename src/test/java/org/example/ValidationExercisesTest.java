package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidationExercisesTest {

    @Test
    void isAdult_shouldWork() {
        assertFalse(ValidationExercises.isAdult(0));
        assertFalse(ValidationExercises.isAdult(17));
        assertTrue(ValidationExercises.isAdult(18));
        assertTrue(ValidationExercises.isAdult(99));
    }

    @Test
    void isInRange_shouldBeInclusive(){
        assertTrue(ValidationExercises.isInRange(1,1,10));
        assertTrue(ValidationExercises.isInRange(10,1,10));
        assertTrue(ValidationExercises.isInRange(5,1,10));
        assertFalse(ValidationExercises.isInRange(11,1,10));
        assertFalse(ValidationExercises.isInRange(0,1,10));
    }

    @Test
    void grade_shouldWork(){
        assertEquals("A",ValidationExercises.grade(100));
        assertEquals("A",ValidationExercises.grade(90));
        assertEquals("B",ValidationExercises.grade(89));
        assertEquals("C",ValidationExercises.grade(70));
        assertEquals("D",ValidationExercises.grade(60));
        assertEquals("F",ValidationExercises.grade(0));
    }

    @Test
    void grade_invalidScoreShouldThrowException(){
        assertThrows(IllegalArgumentException.class, () -> ValidationExercises.grade(-1));
        assertThrows(IllegalArgumentException.class, () -> ValidationExercises.grade(101));
    }

    void isValidPassword_shouldWork(){
        assertTrue(ValidationExercises.isValidPassword("abc12345"));
        assertFalse(ValidationExercises.isValidPassword("adcdefghi")); // no numbers
        assertFalse(ValidationExercises.isValidPassword("abc 12345")); //with space
        assertFalse(ValidationExercises.isValidPassword("a1b2c3")); // short
        assertFalse(ValidationExercises.isValidPassword(null)); // null
    }
}
