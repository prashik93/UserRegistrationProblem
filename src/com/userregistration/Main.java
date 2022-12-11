package com.userregistration;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration Problem!");
        new Main().validatingUserRegistration();
    }

    public void validatingUserRegistration() {
        System.out.println("\nValidating FirstName " + Pattern.matches("^[A-Z]{1}[a-z]{2,}$", "Prashik"));
    }
}