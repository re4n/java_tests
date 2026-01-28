package org.example;

public class ValidationExercises {
    public static boolean isAdult(int age) {
        return age >= 18;

    }

    public static boolean isInRange(int x, int min, int max) {
        return x >= min && x <= max;
    }

    public static String grade(int score) {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("Invalid score");
        }
        if (score >= 90) return "A";
        else if (score >= 80) return "B";
        else if (score >= 70) return "C";
        else if (score >= 60) return "D";
        return "F";
    }

    public static boolean isValidPassword(String password) {
        if (password == null) return false;
        else if (password.length() < 8) return false;
        else if (password.contains(" ")) return false;

        boolean hasDigit = false;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isDigit(ch)) {
                hasDigit = true;
                break;
            }
        }
        return hasDigit;
    }
}
