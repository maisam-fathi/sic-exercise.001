package string;

import java.util.Scanner;

public class ProductInformation {
    /*
    3- Write a program in which the user enters product information. Output the individual pieces of information and convert
    them to an appropriate data type beforehand.

    The input format should look like this:
    Product name: Chocolate, Price: 1.99 EUR, Quantity: 10
    The output should look like this:
    Product name: Chocolate
    Price: 1.99
    Quantity: 10
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Product name: ");
        String productName = scanner.nextLine();

        String[] splitProductName = productName.split(",");

        System.out.println("\n" + splitProductName[0].trim());
        System.out.println(splitProductName[1].trim());
        System.out.println(splitProductName[2].trim());
    }
}
