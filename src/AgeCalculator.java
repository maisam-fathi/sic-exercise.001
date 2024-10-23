/*
Write a program that includes the user's name, current year, and year of birth.
Then this information is to be used to calculate how old the user is.
The console should then look like this, for example:

Hello, what's your name?
Input: Mia
What year is it, Mia?
Input:2024 (I have do it automatic with: import java.time.LocalDate;)
What year were you born?
Entry:2020
Mia, you are 4 years old.

Bonus:
In addition, ask the user if it was a birthday this year and adjust ---------------the age accordingly.
Here's what it might look like in the console:
Has it been your birthday this year?
Input: No
Mia, you are 3 years old.
     */

import java.util.Scanner;
import java.time.LocalDate;

public class AgeCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();
        int age;

        System.out.println("Hello, what's your name?");
        String name = input.nextLine();

        System.out.println("What year were you born " + name + "?");
        int yearOfBirth = input.nextInt();

        System.out.println("Did you have a birthday this year? (Yes or No)");
        String checkThisYearBirthday = input.next();

        if (checkThisYearBirthday.equalsIgnoreCase("Yes")){
            age = currentYear - yearOfBirth;
            //System.out.println(name + ", you are" + age + "years old.");
        } else if (checkThisYearBirthday.equalsIgnoreCase("No")){
            age = currentYear - yearOfBirth - 1;
        } else {
            System.out.println("Please check your answer. Correct answer is Yes or No!");
            return;
        }
        System.out.println(name + ", you are " + age + " years old!");
    }
}
