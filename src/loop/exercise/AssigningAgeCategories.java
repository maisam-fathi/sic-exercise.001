package loop.exercise;

import java.util.Scanner;

public class AssigningAgeCategories {
    public static void main(String[] args) {
        /*
        Task 4: Assigning age categories

        Write a program that reads the age of several people and assigns a category based on their age: "Child" (0-12),
        "Teen" (13-17), "Adult" (18+). The user enters the age for each person and the program outputs the corresponding category.

        Console example:
        Enter the number of people:
        Enter: 3
        Enter the age for person 1:
        Enter: 10
        Enter the age for person 2:
        Enter: 16
        Enter the age for person 3:
        Enter: 25
        Person 1: Child
        Person 2: Teen
        Person 3: Adult
         */
        Scanner scanner = new Scanner(System.in);

        int age;

        System.out.print("Enter the number of people: ");
        int numberOfPeople = scanner.nextInt();

        for (int i = 1; i < numberOfPeople; i++) {
            System.out.print("Enter the age for person " + i + ": ");
            age = scanner.nextInt();

            if (age < 12 && age > 0) {
                System.out.print("Person " + i + ": Child\n");
            } else if (age >= 12 && age < 18) {
                System.out.print("Person " + i + ": Teen\n");
            } else if (age >= 18) {
                System.out.print("Person " + i + ": Adult\n");
            } else {
                System.out.print("The person's age must be greater than zero.\n");
                i--;
            }
        }
    }
}
