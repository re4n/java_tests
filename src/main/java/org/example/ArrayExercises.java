package org.example;

public class ArrayExercises {

    public static int max(int[] nums) {
        validate(nums);
        int m = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > m) m = nums[i];
        }
        return m;
    }

    public static int min(int[] nums) {
        validate(nums);
        int m = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < m) m = nums[i];
        }
        return m;
    }

    public static long sum(int[] nums) {
        validate(nums);
        long s = 0;
        for (int n : nums) s += n;
        return s;
    }

    public static double average(int[] nums) {
        validate(nums);
        return (double) sum(nums) / nums.length;
    }

    private static void validate(int[] nums) {
        if (nums == null) throw new IllegalArgumentException("array nulo");
        if (nums.length == 0) throw new IllegalArgumentException("array vazio");
    }
}
