package loop.exercise;

import java.util.Scanner;

public class MarathonTrainingPlan {
    public static void main(String[] args) {
        /*
        Task 3: Marathon Training Plan

        Write a program that asks the user to enter a starting distance and a daily increase in running distance.
        The program will then display the daily running distance for a week, with the distance increasing by the
        specified amount each day. The target distance is 42 km.

        Console Example:
        Enter the starting distance in km:
        Enter: 3
        Enter the daily increase in km:
        Enter: 1
        Day 1: 3 km
        Day 2: 4 km
        Day 3: 5 km
        Day 4: 6 km
        Day 5: 7 km
        Day 6: 8 km
        Day 7: 9 km
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting distance in km: ");
        int startingDistance = scanner.nextInt();
        System.out.print("Enter the daily increase in km: ");
        int dailyIncrease = scanner.nextInt();
        System.out.print("Enter target distance in km: ");
        int targetDistance = scanner.nextInt();

        int i = 1;
        System.out.println("Day " + i + ": " + startingDistance + " km");
        i++;
        for (int distance = (targetDistance - startingDistance) / dailyIncrease; distance > 0; distance--) {
            startingDistance += dailyIncrease;
            System.out.println("Day " + i + ": " + startingDistance + " km");
            i++;
        }
    }
}
