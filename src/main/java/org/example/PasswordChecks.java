package org.example;

public class PasswordChecks {
    public static boolean checkLength(String password) {
        return password.length() >= 8;
    }

    public static boolean checkDigits(String password) {
        return password.matches(".*[0-9].*");
    }

    public static boolean checkUpperAndLower(String password) {
        return password.matches(".*[A-Z].*") && password.matches(".*[a-z].*");
    }

    public static boolean checkWeak(String password) {
        if (password.equals("Password1") || password.equals("Aa345678")) {
            return false;
        }
        return true;
    }
}
