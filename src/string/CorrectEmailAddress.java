package string;

import java.util.Scanner;

public class CorrectEmailAddress {
    /*
    4- Bonus: Break down email address
    Write a program that checks whether an entered email address is in the correct format.
    Example of correct format: timo@gmail.com
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your email: ");
        String email = scanner.next();
        email = email.trim();

        String[] splitAt = email.split("@");
        String[] splitDot = email.split("\\.");
        String[] splitSpace = email.split(" ");


        if (splitAt.length < 2){
            System.out.println(email + " Email is not correct!");
        } else if (splitDot.length < 2){
            System.out.println(email + " Email is not correct!");
        }else if (splitSpace.length - 1 > 0){
            System.out.println(email + " is not correct email!");
        } else if (!splitAt[1].contains(".")) {
            System.out.println(email + " is not correct email!");
        } else {
            System.out.println("It is a correct email!");
        }
    }
}