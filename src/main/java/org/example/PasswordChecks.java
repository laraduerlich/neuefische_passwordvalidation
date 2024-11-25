package org.example;

public class PasswordChecks {
    public static boolean checkLength(String password) {
        return password.length() >= 8;
    }

    public static boolean checkDigits(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) >= '0' && password.charAt(i) <= '9') {
                return true;
            }
        }
        return false;
    }

    public static boolean checkUpperAndLower(String password) {
        boolean lowercase = false;
        boolean uppercase = false;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                uppercase = true;
            }
            if (Character.isLowerCase(password.charAt(i))) {
                lowercase = true;
            }
        }
        return (lowercase && uppercase);
    }

    public static boolean checkWeak(String password) {
        if (password.equals("Password1") || password.equals("Aa345678")) {
            return false;
        }
        return true;
    }

    public static boolean checkSpecialCharacters(String password) {
        return password.matches(".*[!,#,§,$,%,&,/,=,?,+,*,:,;,>,<,°,^,-,_].*");
    }
}
