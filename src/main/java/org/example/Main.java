package org.example;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String password = "Password123";

        if (PasswordChecks.checkLength(password)){
            if (PasswordChecks.checkDigits(password)) {
                if (PasswordChecks.checkUpperAndLower(password)) {
                    if (PasswordChecks.checkWeak(password)) {
                        if (PasswordChecks.checkSpecialCharacters(password)) {
                            System.out.println("Password is valid");
                        } else {
                            System.out.println("Password must contain special characters");
                        }
                    } else {
                        System.out.println("Password is weak");
                    }
                } else {
                    System.out.println("Password must contain upper and lower case letters");
                }
            } else {
                System.out.println("Password must contain numbers");
            }
        } else {
            System.out.println("Password is too short");
        }

    }

}