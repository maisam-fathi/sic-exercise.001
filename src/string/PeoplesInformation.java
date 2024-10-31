package string;

import java.util.Scanner;

public class PeoplesInformation {
    /*
    Write a program in which the user can enter their address in 3 lines.

    Line 1: First and last name
    Line 2: Street and house number
    Line 3: Postal code and city

    Now enter the individual components individually.

    Console example:
    Enter your first and last name:
    Enter: Timo Blomeyer
    Enter your street and house number:
    Enter: Musterstraße 78
    Enter your postal code and city:
    Enter: 12161 Berlin
    Your first name is Timo
    Your last name is Blomeyer
    Your street is Musterstraße
    Your house number is 78
    Your postal code is 12161
    Your city code is Berlin
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Information from user
        System.out.print("First and last name: ");
        String firstAndLast = scanner.nextLine();

        System.out.print("Street and house number (Example: Muesterstrasse 15): ");
        String streetAndHouseNumber = scanner.nextLine();

        System.out.print("Postal code and city (Example: 85446 Muestestadt): ");
        String postalCodeAndCity = scanner.nextLine();

        //Split the information
        String[] splitFirstAndLast = firstAndLast.split(" ");
        String[] splitStreetAndHouseNumber = streetAndHouseNumber.split(" ");
        String [] splitPostalCodeAndCity = postalCodeAndCity.split(" ");

        //Print separate information
        System.out.println("\nYour first name is " + splitFirstAndLast[0]);
        System.out.println("Your last name is " + splitFirstAndLast[1]);
        System.out.println("Your street is " + splitStreetAndHouseNumber[0]);
        System.out.println("Your house number is " + splitStreetAndHouseNumber[1] );
        System.out.println("Your postal code is " + splitPostalCodeAndCity[0]);
        System.out.println("Your city code is " + splitPostalCodeAndCity[1]);
    }
}
