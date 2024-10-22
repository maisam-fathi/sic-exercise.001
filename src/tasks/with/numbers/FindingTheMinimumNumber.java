package tasks.with.numbers;

//4.	Finding the minimum number (if-else) Write a program that reads two numbers from the user and outputs the smaller of the two.

import java.util.Scanner;

public class FindingTheMinimumNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Write the first number?");
        int number1 = input.nextInt();

        System.out.println("Write the second number?");
        int number2 = input.nextInt();

        int smaleNumber;

        if (number1 < number2){
            smaleNumber = number1;
        } else if (number2 < number1) {
            smaleNumber = number2;
        } else {
            System.out.println(number1 + " is equal to " + number2 + ".");
            //Stop the program. Note: If number1 equal to number2 then the variable smaleNumber remain empty and
            //happen an error. To prevent this error should ude return!
            return;
        }
        System.out.println("The smale number is " + smaleNumber + ".");
    }
}
