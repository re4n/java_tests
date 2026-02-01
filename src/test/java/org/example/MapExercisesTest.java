package org.example;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MapExercisesTest {

    @Test
    void frequency_shouldCountOccurrences() {
        Map<Integer, Integer> freq = MapExercises.frequency(new int[] {10, 20, 10, 30, 30, 30});
        assertEquals(2, freq.get(10));
        assertEquals(1, freq.get(20));
        assertEquals(3, freq.get(30));
        assertNull(freq.get(40));
    }

    @Test
    void frequency_emptyShouldReturnEmptyMap(){
        Map<Integer, Integer> freq = MapExercises.frequency(new int[] {});
        assertTrue(freq.isEmpty());
    }

    @Test
    void frequency_nullShouldThrow(){
        assertThrows(IllegalArgumentException.class, () -> MapExercises.frequency(null));
    }

    @Test
    void countPairs_shouldWork(){
        assertEquals(2, MapExercises.countPairs(new int[]{10, 20, 10, 30, 30, 30}));
        assertEquals(1, MapExercises.countPairs(new int[]{1, 1}));
        assertEquals(1, MapExercises.countPairs(new int[]{1, 1, 1}));
        assertEquals(2, MapExercises.countPairs(new int[]{1, 1, 1, 1, 1}));
        assertEquals(0, MapExercises.countPairs(new int[]{}));
    }

    void countPairs_nullShouldThrow(){
        assertThrows(NullPointerException.class, () -> MapExercises.countPairs(null));
    }

}
