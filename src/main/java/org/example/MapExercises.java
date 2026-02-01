package org.example;

import java.util.HashMap;
import java.util.Map;

public class MapExercises {
    public static Map<Integer, Integer> frequency(int[] nums){
        if (nums == null) throw new IllegalArgumentException("NULL");
        Map<Integer, Integer> freq = new HashMap<>();
        for (int n: nums) freq.put(n, freq.getOrDefault(n, 0) + 1);
        return freq;
    }

    public static int countPairs(int[] nums){
        if (nums == null) throw new IllegalArgumentException("NULL");
        Map<Integer, Integer> freq = new HashMap<>();
        int pairs = 0;
        for (int n: nums){
            int newCount = freq.getOrDefault(n, 0) + 1;
            freq.put(n, newCount);
            if(newCount % 2 == 0) pairs++;
        }
        return pairs;
    }

}
