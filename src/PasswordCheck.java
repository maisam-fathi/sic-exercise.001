/*
5. Check a simple password (scanner, if-else) Write a program that lets the user enter a password and
checks whether it is the right password (e.g. "secret"). If the password is correct, "Access granted"
should be output, otherwise "Access denied".
 */

import java.util.Objects;
import java.util.Scanner;

public class PasswordCheck {

    public static void main(String[] args) {
        String password = "1234";
        String passwordCheck;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your password:");
        passwordCheck = input.next();

        if(Objects.equals(passwordCheck, password)){
            System.out.println("Access granted.");
        } else {
            System.out.println("Wrong password! Access denied.");
        }
    }
}
