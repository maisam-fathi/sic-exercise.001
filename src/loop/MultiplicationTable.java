package loop;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        /*
        3. multiplication table (for loop)
        - Write a program that outputs the multiplication table for a number entered by the user (e.g. 7).
        Console example:
        Enter the multiplication series:
        Input: 7
        1 x 7 = 7
        2 x 7 = 14
        3 x 7 = 21
        4 x 7 = 28
        ...
         */
        Scanner scanner = new Scanner(System.in);

        int number;

        System.out.print("Which number multiplication table do you want? ");
        number = scanner.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.println(i + " x " + number + " = " + (i*number));
        }
    }
}
