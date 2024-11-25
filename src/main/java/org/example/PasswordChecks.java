package org.example;

public class PasswordChecks {
    public static boolean checkLength(String password) {
        return password.length() >= 8;
    }
}
