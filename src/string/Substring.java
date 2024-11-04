package string;

import java.util.Scanner;

/*
1. Write a program in which the user enters their ID number (e.g. `T2022051012345`). Split the number and output the ID
type (first letter), year of birth, month of birth and serial number separately.

Example console:
Enter your ID number:
Input: T2022051012345

T 2022 05 1012345

ID type: T
Year of birth: 2022
Month of birth: 05
Serial number: 1012345

Note: Use `substring()` and `Integer.parseInt()` to parse the parts of the number.
 */
public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your ID number: ");
        String id = scanner.next();

        String idType = id.substring(0, 1);
        String yearOfBirth = id.substring(1,5);
        String monthOfBirth = id.substring(5,7);
        String serialNumber = id.substring(7);

        System.out.println("ID type: " + idType);
        System.out.println("Year of birth: " + yearOfBirth);
        System.out.println("Month of birth: " + monthOfBirth);
        System.out.println("Serial number: " + serialNumber);
    }
}
