package loop;

import java.util.Scanner;

public class SumOfTheNumbers {
    public static void main(String[] args) {
        /*
        4. Sum of the numbers
        · Write a program that repeatedly asks the user for a number until they enter 0.
        The program should calculate the sum of all the numbers entered and output it at the end.

        Note: The condition of the loop is that the number is not equal to 0, 0 is the cancel
        button for the user, so to speak
         */

        Scanner input = new Scanner(System.in);

        int sum = 0;
        int number;

        System.out.print("Enter a number (Without 0) to start program: ");
        number = input.nextInt();

        while (number != 0){
            System.out.print("Enter new number to sum (enter 0 to see the result): ");
            number = input.nextInt();
            sum += number; //Shot form for: sum += sum + number
        }
        System.out.println("\nThe sum of the numbers is equal to " + sum + ".");
    }
}