package org.example;

public class LoopExercises {
    public static int sumToN(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n should be greater than 0");
        }
        int sum = 0;
        for (int i = 1;i <= n; i++){
            sum += i;
        }
        return sum;
    }

    public static long factorial(int n){
        if (n < 0) {
            throw new IllegalArgumentException("n should be greater than 0");
        }
        long result = 1;
        for (int i = 2; i <= n; i++){
            result *= i;
        }
        return result;
    }

    public static int countDigits(int n){
        if (n == 0) return 1;
        int x = Math.abs(n);
        int count = 0;
        while (x > 0){
            x /= 10;
            count++;
        }
        return count;
    }

}
