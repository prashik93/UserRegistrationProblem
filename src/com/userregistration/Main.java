package com.userregistration;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration Problem!");
        new Main().validatingUserRegistration();
    }

    public void validatingUserRegistration() {
        System.out.println("\nValidating FirstName and LastName " + Pattern.matches("^[A-Z]{1}[a-z]{2,}[\s][A-Z]{1}[a-z]{2,}$", "Prashik Kamble"));
        System.out.println("\nValidating Email " + Pattern.matches("^((([a-z]{3})|([a-z]{3}[.][a-z]{3}))[@][bl]{2}[.][co]{2})$|^((([a-z]{3})|([a-z]{3}[.][a-z]{3}))[@][bl]{2}[.][co]{2}[.][in]{2})$", "abc.xyz@bl.co.in"));
        System.out.println("\nValidating Mobile Format " + Pattern.matches("^[0-9]{2}[\\s][0-9]{10}$", "91 9919819801"));
    }
}