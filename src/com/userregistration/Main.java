package com.userregistration;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class Main {
    private final ArrayList<String> validEmailArray = new ArrayList<>();
    private final ArrayList<String> inValidEmailArray = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Welcome to User Registration Problem!");
        String[] allEmailsArray = {"abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com",
                "abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com",
                "abc+100@gmail.com", "abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com",
                "abc123@.com.com", ".abc@abc.com", "abc()*@gmail.com", "abc@%*.com",
                "abc..2002@gmail.com", "abc.@gmail.com", "abc@abc@gmail.com", "abc@gmail.com.1a",
                "abc@gmail.com.aa.au"};

        new Main().validatingUserRegistration();
        new Main().checkValidAndInvalidEmails(allEmailsArray);
    }

    public void validatingUserRegistration() {
        System.out.println("\nValidating FirstName and LastName " + Pattern.matches("^[A-Z]{1}[a-z]{2,}[\s][A-Z]{1}[a-z]{2,}$", "Prashik Kamble"));
        System.out.println("\nValidating Email " + Pattern.matches("^((([a-z]{3})|([a-z]{3}[.][a-z]{3}))[@][bl]{2}[.]([co]{2}|[co]{2}[.][in]{2}))$", "abc.xyz@bl.co.in"));
        System.out.println("\nValidating Mobile Format " + Pattern.matches("^[0-9]{2}[\\s][0-9]{10}$", "91 9919819801"));
        System.out.println("\nPassword should have minimum 8 characters and at least 1 UpperCase letter and 1 Numeric Number and exactly One Special character " + Pattern.matches("^(?=[^!@#$%^&*]*[!@#$%^&*]([^!@#$%^&*])*$)(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])([a-zA-Z0-9(!@#$%^&*)]){8,}$", "a1aEWe@3he"));
    }

    public void checkValidAndInvalidEmails(String[] allEmailsArray) {
        for (int i = 0; i < allEmailsArray.length; i++) {
            boolean matchResult = Pattern.matches("^([a-z 0-9]{3,}|[a-z 0-9]{3,}[-|+|-|.][a-z 0-9]{1,})[@][a-z 0-9]{1,}[.]([com|net|co]{2,3}|[com|net|co]{2,3}[.][au|in|com]{2,3})$",
                    allEmailsArray[i]);
            if(matchResult) {
                validEmailArray.add(allEmailsArray[i]);
            } else {
                inValidEmailArray.add(allEmailsArray[i]);
            }
        }

        System.out.print("\nValid Emails are ");
        for(int i = 0; i < validEmailArray.size(); i++) {
            System.out.print(validEmailArray.get(i));
            if(i < validEmailArray.size()-1) {
                System.out.print(", ");
            }
        }
        System.out.println(".");

        System.out.print("\nInValid Emails are ");
        for(int i = 0; i < inValidEmailArray.size(); i++) {
            System.out.print(inValidEmailArray.get(i));
            if(i < inValidEmailArray.size()-1) {
                System.out.print(", ");
            }
        }
        System.out.println(".");
    }
}