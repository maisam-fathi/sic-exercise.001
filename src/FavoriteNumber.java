//Print favorite number (Scanner, System.out.println)
//Write a program that asks the user for their favorite number and prints that number on the screen.

import java.util.Scanner;

public class FavoriteNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Number;

        System.out.println("What is your favorite number? ");
        Number = scanner.nextInt();

        System.out.println("Your favorite number is " + Number);
    }
}
