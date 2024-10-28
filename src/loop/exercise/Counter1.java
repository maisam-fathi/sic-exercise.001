package loop.exercise;

import java.util.Scanner;

public class Counter1 {
    public static void main(String[] args) {
        /*
        1. implement a program that uses a simple for-loop to count from a start value to a final value with a defined
        step size. The user should be prompted to enter the following values:
        the start value (an integer), the increment (a positive integer) and the end value (an integer greater than
        the start value).

        A For loop should be used in the Main method, which counts the values and outputs them to the console. The
        output should be in the form “Count: 1, 3, 5”.
        For example, if the user enters a start value of 1, an increment of 2 and a final value of 10, the output
        should be “Count: 1, 3, 5, 7, 9”.
        Make sure that the user input is checked for validity, in particular that the increment is greater than 0 and
        the end value is greater than the start value.

        Console example:
        Enter your start value:
        Input: 1
        Enter your end value:
        Input: 10
        Enter your increment:
        Enter: 2
        Count: 1,3,5,7,9
         */

        int startValue;
        int endValue;
        int increment;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your start value: ");
        startValue = scanner.nextInt();
        System.out.print("Enter your end value: ");
        endValue = scanner.nextInt();
        System.out.print("Enter your increment: ");
        increment = scanner.nextInt();

        System.out.print(startValue + ",");

        for (int i = (endValue/increment); i > 1; i--){
            System.out.print(startValue + increment + ",");
            startValue += increment;
        }
    }
}
