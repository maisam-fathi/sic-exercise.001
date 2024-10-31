package string;

import java.util.Scanner;

public class DateSplit {
    /*
    2- Write a program in which the user can enter a date in the following format: 01/01/2024
    Divide the date into day, month and year.

    Convert the values to integers.
    String number = "3";
    Conversion: int number = Integer.parseInt(number);

    Example console:
    Enter your date:
    Input: 01.01.2024
    Your day is 01.
    Your month is 01.
    Your year is 2024
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your date(Example: 01.01.2024): ");
        String date = scanner.nextLine().trim();

        String[] splitDate = date.split("\\.");

        int day = Integer.parseInt(splitDate[0]);
        int month = Integer.parseInt(splitDate[1]);
        int year = Integer.parseInt(splitDate[2]);

        System.out.println("Your day is " + day);
        System.out.println("Your month is " + month);
        System.out.println("Your year is " + year);
    }
}
