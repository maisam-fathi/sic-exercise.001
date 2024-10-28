package loop.exercise;

import java.util.Scanner;

public class CountingWorkHours {
    public static void main(String[] args) {
        /*
        Task 1: Counting work hours

        · Write a program that counts the daily work time and displays the total work hours at the end of the week.
        The user enters the number of work hours per day. The program counts for a 5-day week.

        Console example:
        Enter the work hours per day:
        Input: 8
        Day 1: 8 hours
        Day 2: 16 hours
        Day 3: 24 hours
        Day 4: 32 hours
        Day 5: 40 hours
        At the end of the week, you have worked 40 hours!
         */
        Scanner scanner = new Scanner(System.in);

        double hoursPerDay = 0;
        double sumHours = 0;

        System.out.println("Enter the work hours per day: ");
        hoursPerDay = scanner.nextDouble();

        for(int i = 1; i <= 5; i++){
            sumHours += hoursPerDay;
            System.out.println("Day " + i + ": " + sumHours);
        }
    }
}
